package br.com.persistencia;

import br.com.model.Funcionario;
import br.com.persistencia.dao.FuncionarioDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class FuncionarioDAOImplements implements FuncionarioDAO {

    private static final String INSERT = "insert into funcionario (nome, rg, cpf, telefone, rua, numero, complemento, bairro, cidade, cep, estado, sexo, "
            + "dataNascimento, cargo, cargahoraria, salario, ctps, dataAdmissao, login, senha) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";
    private static final String LIST = "select * from funcionario;";
    private static final String REMOVE = "delete from funcionario where id_funcionario = ?;";
    private static final String UPDATE = "update funcionario set nome = ?, rg = ?, cpf = ?, telefone = ?, rua = ?, numero = ?, complemento =?, bairro = ?, "
            + "cidade = ?, cep = ?, estado = ?, sexo = ?, dataNascimento = ?, cargo = ?, cargahoraria = ?, salario = ?, ctps = ?, dataAdmissao = ?, login = ?, "
            + "senha = ?  where id_funcionario = ?;";
    private static final String LISTBYID = "select * from funcionario where id_funcionario = ?;";
    private static final String LISTBYNOME = "select * from funcionario where nome like ?;";
    private final String VERIFICALOGIN = "SELECT LOGIN, SENHA FROM FUNCIONARIO WHERE LOGIN = ? AND SENHA = ? ";

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

    private int update(Funcionario f) {
        Connection con = null;
        PreparedStatement pstm = null;
        int retorno = -1;
        try {
            con = ConnectionFactory.getConnection();
            pstm = con.prepareStatement(UPDATE);
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
            pstm.setInt(21, f.getId_funcionario());
            pstm.execute();

            retorno = f.getId_funcionario();

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
    public boolean remove(int id_funcionario) {
        boolean status = false;
        Connection con = null;
        PreparedStatement pstm = null;

        try {
            con = ConnectionFactory.getConnection();
            pstm = con.prepareStatement(REMOVE);
            pstm.setInt(1, id_funcionario);
            pstm.execute();
            status = true;

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir funcionário: " + e.getMessage());
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
    public List<Funcionario> listAll() {
        Connection con = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        List<Funcionario> funcionarios = new ArrayList<>();

        try {
            con = ConnectionFactory.getConnection();
            pstm = con.prepareStatement(LIST);
            rs = pstm.executeQuery();

            while (rs.next()) {
                Funcionario f = new Funcionario();

                f.setId_funcionario(rs.getInt("id_funcionario"));
                f.setNome(rs.getString("nome"));
                f.setRg(rs.getString("rg"));
                f.setCpf(rs.getString("cpf"));
                f.setTelefone(rs.getString("telefone"));
                f.setRua(rs.getString("rua"));
                f.setNumero(rs.getInt("numero"));
                f.setComplemento(rs.getString("complemento"));
                f.setBairro(rs.getString("bairro"));
                f.setCidade(rs.getString("cidade"));
                f.setCep(rs.getString("cep"));
                f.setEstado(rs.getString("estado"));
                f.setSexo(rs.getString("sexo"));
                f.setDataNascimento(rs.getDate("dataNascimento"));
                f.setCargo(rs.getString("cargo"));
                f.setCargaHoraria(rs.getDouble("cargahoraria"));
                f.setSalario(rs.getDouble("salario"));
                f.setCtps(rs.getString("ctps"));
                f.setDataAdmissao(rs.getDate("dataAdmissao"));
                f.setLogin(rs.getString("login"));
                f.setSenha(rs.getString("senha"));
                funcionarios.add(f);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao listar os funcionários: " + e.getMessage());
        } finally {
            try {
                ConnectionFactory.closeConnection(con, pstm, rs);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro ao fechar conexão: " + e.getMessage());
            }
        }
        return funcionarios;
    }

    @Override
    public Funcionario listById(int id_funcionario) {
        Connection con = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        Funcionario f = new Funcionario();

        try {
            con = ConnectionFactory.getConnection();
            pstm = con.prepareStatement(LISTBYID);
            pstm.setInt(1, id_funcionario);
            rs = pstm.executeQuery();

            while (rs.next()) {
                f.setId_funcionario(rs.getInt("id_funcionario"));
                f.setNome(rs.getString("nome"));
                f.setRg(rs.getString("rg"));
                f.setCpf(rs.getString("cpf"));
                f.setTelefone(rs.getString("telefone"));
                f.setRua(rs.getString("rua"));
                f.setNumero(rs.getInt("numero"));
                f.setComplemento(rs.getString("complemento"));
                f.setBairro(rs.getString("bairro"));
                f.setCidade(rs.getString("cidade"));
                f.setCep(rs.getString("cep"));
                f.setEstado(rs.getString("estado"));
                f.setSexo(rs.getString("sexo"));
                f.setDataNascimento(rs.getDate("dataNascimento"));
                f.setCargo(rs.getString("cargo"));
                f.setCargaHoraria(rs.getDouble("cargahoraria"));
                f.setSalario(rs.getDouble("salario"));
                f.setCtps(rs.getString("ctps"));
                f.setDataAdmissao(rs.getDate("dataAdmissao"));
                f.setLogin(rs.getString("login"));
                f.setSenha(rs.getString("senha"));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao listar funcionário: " + e.getMessage());
        } finally {
            try {
                ConnectionFactory.closeConnection(con, pstm, rs);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro ao fechar conexão: " + e.getMessage());
            }
        }

        return f;
    }

    @Override
    public List<Funcionario> listByNome(String nome) {
        Connection con = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        List<Funcionario> funcionarios = new ArrayList<>();

        try {
            con = ConnectionFactory.getConnection();
            pstm = con.prepareStatement(LISTBYNOME);
            pstm.setString(1, "%" + nome + "%");
            rs = pstm.executeQuery();

            while (rs.next()) {
                Funcionario f = new Funcionario();
                f.setId_funcionario(rs.getInt("id_funcionario"));
                f.setNome(rs.getString("nome"));
                f.setRg(rs.getString("rg"));
                f.setCpf(rs.getString("cpf"));
                f.setTelefone(rs.getString("telefone"));
                f.setRua(rs.getString("rua"));
                f.setNumero(rs.getInt("numero"));
                f.setComplemento(rs.getString("complemento"));
                f.setBairro(rs.getString("bairro"));
                f.setCidade(rs.getString("cidade"));
                f.setCep(rs.getString("cep"));
                f.setEstado(rs.getString("estado"));
                f.setSexo(rs.getString("sexo"));
                f.setDataNascimento(rs.getDate("dataNascimento"));
                f.setCargo(rs.getString("cargo"));
                f.setCargaHoraria(rs.getDouble("cargahoraria"));
                f.setSalario(rs.getDouble("salario"));
                f.setCtps(rs.getString("ctps"));
                f.setDataAdmissao(rs.getDate("dataAdmissao"));
                f.setLogin(rs.getString("login"));
                f.setSenha(rs.getString("senha"));
                funcionarios.add(f);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao pesquisar funcionário! " + e.getMessage());
        } finally {
            try {
                ConnectionFactory.closeConnection(con, pstm, rs);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro ao fechar conexão! " + e.getMessage());
            }
        }
        return funcionarios;
    }

    public boolean validaLogin(String login, String senha) {
        boolean autenticado = false;
        //conectar com banco
        Connection conn = null;
        //pra enviar alguma coisa pro banco
        PreparedStatement pstm = null;
        //receber alguma coisa do banco
        ResultSet rs;
        Funcionario funcionario = new Funcionario();
        try {
            //conectar com banco
            conn = ConnectionFactory.getConnection();
            pstm = conn.prepareStatement(VERIFICALOGIN);
            pstm.setString(1, login);
            pstm.setString(2, senha);
            rs = pstm.executeQuery();
            while (rs.next()) {
                return true;
            }

            ConnectionFactory.closeConnection(conn, pstm, rs);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao validar login e senha: " + e.getMessage());

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao validar login e senha: " + e.getMessage());
        }
        return autenticado;
    }
}
