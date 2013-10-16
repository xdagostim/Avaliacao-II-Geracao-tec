package br.com.persistencia;

import br.com.model.Funcionario;
import br.com.persistencia.dao.FuncionarioDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import javax.swing.JOptionPane;

public class FuncionarioDAOImplements implements FuncionarioDAO {

    private static final String INSERT = "insert into funcionario (nome, rg, cpf, telefone, rua, numero, complemento, bairro, cidade, cep, estado, sexo, "
            + "dataNascimento, cargo, cargahoraria, salario, ctps, dataAdmissao, login, senha) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";
    private static final String LIST = "select * from funcionario;";
    private static final String REMOVE = "delete from funcionario where id_funcionario = ?;";
    private static final String UPDATE = "update funcionario set nome = ?, rg = ?, cpf = ?, telefone = ?, rua = ?, numero = ?, complemento = ?, bairro = ?, "
            + "cidade = ?, cep = ?, estado = ?, sexo = ?, dataNascimento = ?, cargo = ?, cargahoraria = ?, salario = ?, ctps = ?, dataAdmissao = ?, login = ?, "
            + "senha = ?  where id_funcionario = ?;";
    private static final String LISTBYID = "select * from funcionario where id_funcionario = ?;";
    private static final String LISTBYNOME = "select * from funcionario where nome like ?;";

    @Override
    public int salve(Funcionario f) {
        if (f.getId_funcionario() == 0) {
            return insert(f);
        } else {
            return update(f);
        }
    }

    private int insert(Funcionario f) {
        Connection con = null;
        PreparedStatement pstm = null;
        int retorno = -1;
        try {
            con = ConnectionFactory.getConnection();
            pstm = con.prepareStatement(INSERT, Statement.RETURN_GENERATED_KEYS);
            pstm.setString(1, f.getNome());
            pstm.setString(2, f.getRg());
            pstm.setString(3, f.getCpf());
            pstm.setString(4, f.getTelefone());
            pstm.setString(5, f.getRua());
            pstm.setInt(6, f.getNumero());
            pstm.setString(7, f.getComplemento());
            pstm.setString(8, f.getBairro());
            pstm.setString(9, f.getCidade());
            pstm.setString(10, f.getCep());
            pstm.setString(11, f.getEstado());
            pstm.setString(12, f.getSexo());
            pstm.setDate(13, new java.sql.Date(f.getDataNascimento().getTime()));
            pstm.setString(14, f.getCargo());
            pstm.setDouble(15, f.getCargaHoraria());
            pstm.setDouble(16, f.getSalario());
            pstm.setString(17, f.getCtps());
            pstm.setDate(18, new java.sql.Date(f.getDataAdmissao().getTime()));
            pstm.setString(19, f.getLogin());
            pstm.setString(20, f.getSenha());
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

    @Override
    public boolean remove(int codigo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Funcionario> listAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Funcionario listById(int codigo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Funcionario> listByNome(String nome) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
