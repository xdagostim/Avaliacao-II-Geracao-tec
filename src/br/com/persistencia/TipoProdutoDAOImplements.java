package br.com.persistencia;

import br.com.model.Funcionario;
import br.com.model.TipoProduto;
import br.com.persistencia.dao.TipoProdutoDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class TipoProdutoDAOImplements implements TipoProdutoDAO {

    private static final String INSERT = "insert into tipoproduto (nome) values (?);";
    private static final String LIST = "select * from tipoproduto;";
    private static final String REMOVE = "delete from tipoproduto where id_tipoproduto = ?;";
    private static final String UPDATE = "update tipoproduto set nome = ? where id_tipoproduto = ?;";
    private static final String LISTBYID = "select * from tipoproduto where id_tipoproduto = ?;";
    private static final String LISTBYNOME = "select * from tipoproduto where nome like ?;";

    @Override
    public int salve(TipoProduto tp) {
        if (tp.getId_categoria() == 0) {
            return insert(tp);
        } else {
            return update(tp);
        }
    }

    private int insert(TipoProduto tp) {
        Connection con = null;
        PreparedStatement pstm = null;
        int retorno = -1;
        try {
            con = ConnectionFactory.getConnection();
            pstm = con.prepareStatement(INSERT, Statement.RETURN_GENERATED_KEYS);
            pstm.setString(1, tp.getNome());

            pstm.execute();

            try (ResultSet rs = pstm.getGeneratedKeys()) {
                if (rs.next()) {
                    retorno = rs.getInt(1);
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,
                    "Erro ao inserir: " + e);
        } finally {
            try {
                ConnectionFactory.closeConnection(con, pstm);
            } catch (SQLException ex) {
            }
            return retorno;
        }
    }

    private int update(TipoProduto tp) {
        Connection con = null;
        PreparedStatement pstm = null;
        int retorno = -1;
        try {
            con = ConnectionFactory.getConnection();
            pstm = con.prepareStatement(UPDATE);
            pstm.setString(1, tp.getNome());
            pstm.setInt(2, tp.getId_categoria());
            pstm.execute();

            retorno = tp.getId_categoria();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao editar os dados: " + e.getMessage());
        } finally {
            try {
                ConnectionFactory.closeConnection(con, pstm);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro ao fechar conexão: " + e.getMessage());
            }
        }
        return retorno;
    }

    @Override
    public boolean remove(int codigo) {
        boolean status = false;
        Connection con = null;
        PreparedStatement pstm = null;

        try {
            con = ConnectionFactory.getConnection();
            pstm = con.prepareStatement(REMOVE);
            pstm.setInt(1, codigo);
            pstm.execute();
            status = true;

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir o tipo de produto: " + e.getMessage());
        } finally {
            try {
                ConnectionFactory.closeConnection(con, pstm);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro ao fechar conexão: " + e.getMessage());
            }
        }
        return status;
    }

    @Override
    public List<TipoProduto> listAll() {
        Connection con = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        List<TipoProduto> tipoproduto = new ArrayList<>();

        try {
            con = ConnectionFactory.getConnection();
            pstm = con.prepareStatement(LIST);
            rs = pstm.executeQuery();

            while (rs.next()) {
                TipoProduto tp = new TipoProduto();

                tp.setId_categoria(rs.getInt("id_tipoproduto"));
                tp.setNome(rs.getString("nome"));

                tipoproduto.add(tp);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao listar os tipos de produto: " + e.getMessage());
        } finally {
            try {
                ConnectionFactory.closeConnection(con, pstm, rs);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro ao fechar conexão: " + e.getMessage());
            }
        }
        return tipoproduto;
    }

    @Override
    public TipoProduto listById(int codigo) {
        Connection con = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        TipoProduto tp = new TipoProduto();

        try {
            con = ConnectionFactory.getConnection();
            pstm = con.prepareStatement(LISTBYID);
            pstm.setInt(1, codigo);
            rs = pstm.executeQuery();

            while (rs.next()) {
                tp.setId_categoria(rs.getInt("id_tipoproduto"));
                tp.setNome(rs.getString("nome"));

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao listar tipo de produto: " + e.getMessage());
        } finally {
            try {
                ConnectionFactory.closeConnection(con, pstm, rs);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro ao fechar conexão: " + e.getMessage());
            }
        }

        return tp;
    }

    @Override
    public List<TipoProduto> listByNome(String nome) {
        Connection con = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        List<TipoProduto> tipoprodutos = new ArrayList<>();

        try {
            con = ConnectionFactory.getConnection();
            pstm = con.prepareStatement(LISTBYNOME);
            pstm.setString(1, "%" + nome + "%");
            rs = pstm.executeQuery();

            while (rs.next()) {
                TipoProduto tp = new TipoProduto();
                tp.setId_categoria(rs.getInt("id_tipoproduto"));
                tp.setNome(rs.getString("nome"));
                tipoprodutos.add(tp);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao pesquisar tipo de produto! " + e.getMessage());
        } finally {
            try {
                ConnectionFactory.closeConnection(con, pstm, rs);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro ao fechar conexão! " + e.getMessage());
            }
        }
        return tipoprodutos;
    }
}
