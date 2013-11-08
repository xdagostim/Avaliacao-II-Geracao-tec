package br.com.persistencia;

import br.com.model.Game;
import br.com.persistencia.dao.GameDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class GameDAOImplements implements GameDAO {

    private static final String INSERT = "insert into game (nome, descricao, classificacao_etaria, tipo_midia, tipo_genero, quantidade, preco) values (?, ?, ?, ?, ?, ?, ?);";
    private static final String LIST = "select * from game;";
    private static final String REMOVE = "delete from game where id_game = ?;";
    private static final String UPDATE = "update game set nome = ?, descricao = ?, classificacao_etaria = ?, tipo_midia = ?, tipo_genero = ?, quantidade = ?, preco =? where id_game = ?;";
    private static final String LISTBYID = "select * from game where id_game = ?;";
    private static final String LISTBYNOME = "select * from game where nome like ?;";

    public int salve(Game g) {
        if (g.getId_game() == 0) {
            return insert(g);
        } else {
            return update(g);
        }
    }

    private int insert(Game g) {
        Connection con = null;
        PreparedStatement pstm = null;
        int retorno = -1;
        try {
            con = ConnectionFactory.getConnection();
            pstm = con.prepareStatement(INSERT, Statement.RETURN_GENERATED_KEYS);
            pstm.setString(1, g.getNome());
            pstm.setString(2, g.getDescricao());
            pstm.setInt(3, g.getClassificacaoEtaria());
            pstm.setString(4, g.getTipoMidia());
            pstm.setString(5, g.getTipoGenero());
            pstm.setInt(6, g.getQuantidade());
            pstm.setDouble(7, g.getPreco());

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

    private int update(Game g) {
        Connection con = null;
        PreparedStatement pstm = null;
        int retorno = -1;
        try {
            con = ConnectionFactory.getConnection();
            pstm = con.prepareStatement(UPDATE);
            pstm.setString(1, g.getNome());
            pstm.setString(2, g.getDescricao());
            pstm.setInt(3, g.getClassificacaoEtaria());
            pstm.setString(4, g.getTipoMidia());
            pstm.setString(5, g.getTipoGenero());
            pstm.setInt(6, g.getQuantidade());
            pstm.setDouble(7, g.getPreco());
            pstm.execute();

            retorno = g.getId_game();

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
    public boolean remove(int id_game) {
        boolean status = false;
        Connection con = null;
        PreparedStatement pstm = null;

        try {
            con = ConnectionFactory.getConnection();
            pstm = con.prepareStatement(REMOVE);
            pstm.setInt(1, id_game);
            pstm.execute();
            status = true;

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir game: " + e.getMessage());
        } finally {
            try {
                ConnectionFactory.closeConnection(con, pstm);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro ao fechar conexão: " + e.getMessage());
            }
        }
        return status;
    }

    public List<Game> listAll() {
        Connection con = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        List<Game> games = new ArrayList<>();

        try {
            con = ConnectionFactory.getConnection();
            pstm = con.prepareStatement(LIST);
            rs = pstm.executeQuery();

            while (rs.next()) {
                Game g = new Game();

                g.setNome(rs.getString("nome"));
                g.setDescricao(rs.getString("descricao"));
                g.setClassificacaoEtaria(rs.getInt("classificacao_etaria"));
                g.setTipoMidia(rs.getString("tipo_midia"));
                g.setTipoGenero(rs.getString("tipo_genero"));
                g.setQuantidade(rs.getInt("quantidade"));
                g.setPreco(rs.getDouble("preco"));
                games.add(g);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao listar os games: " + e.getMessage());
        } finally {
            try {
                ConnectionFactory.closeConnection(con, pstm, rs);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro ao fechar conexão: " + e.getMessage());
            }
        }
        return games;
    }

    public Game listById(int id_game) {
        Connection con = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        Game g = new Game();

        try {
            con = ConnectionFactory.getConnection();
            pstm = con.prepareStatement(LISTBYID);
            pstm.setInt(1, id_game);
            rs = pstm.executeQuery();

            while (rs.next()) {
                g.setNome(rs.getString("nome"));
                g.setDescricao(rs.getString("descricao"));
                g.setClassificacaoEtaria(rs.getInt("classificacao_etaria"));
                g.setTipoMidia(rs.getString("tipo_midia"));
                g.setTipoGenero(rs.getString("tipo_genero"));
                g.setQuantidade(rs.getInt("quantidade"));
                g.setPreco(rs.getDouble("preco"));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao listar game: " + e.getMessage());
        } finally {
            try {
                ConnectionFactory.closeConnection(con, pstm, rs);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro ao fechar conexão: " + e.getMessage());
            }
        }

        return g;
    }

    public List<Game> listByNome(String nome) {
        Connection con = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        List<Game> games = new ArrayList<>();

        try {
            con = ConnectionFactory.getConnection();
            pstm = con.prepareStatement(LISTBYNOME);
            pstm.setString(1, "%" + nome + "%");
            rs = pstm.executeQuery();

            while (rs.next()) {
                Game g = new Game();
                g.setNome(rs.getString("nome"));
                g.setDescricao(rs.getString("descricao"));
                g.setClassificacaoEtaria(rs.getInt("classificacao_etaria"));
                g.setTipoMidia(rs.getString("tipo_midia"));
                g.setTipoGenero(rs.getString("tipo_genero"));
                g.setQuantidade(rs.getInt("quantidade"));
                g.setPreco(rs.getDouble("preco"));
                games.add(g);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao pesquisar game! " + e.getMessage());
        } finally {
            try {
                ConnectionFactory.closeConnection(con, pstm, rs);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro ao fechar conexão! " + e.getMessage());
            }
        }
        return games;
    }
}
