package br.com.persistencia;

import br.com.model.Funcionario;
import br.com.persistencia.dao.FuncionarioDAO;
import java.util.List;

public class FuncionarioDAOImplements implements FuncionarioDAO {
    
    private static final String INSERT = "insert into funcionario (nome, rg, cpf, telefone, rua, numero, complemento, bairro, cidade, cep, estado, sexo, dataNascimento, cargo, cargahoraria, salario, ctps, dataAdmissao, login, senha) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";
    private static final String LIST = "select * from usuario;";
    private static final String REMOVE = "delete from usuario where codigo = ?;";
    private static final String UPDATE = "update usuario set nome = ?, login = ?, senha = ?, cpf = ?, telefone = ?, data_nascimento = ?, sexo = ? where codigo = ?;";
    private static final String LISTBYID = "select * from usuario where codigo = ?;";
    private static final String LISTBYNOME = "select * from usuario where nome like ?;";

    @Override
    public int salve(Funcionario f) {
        
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
