package br.com.persistencia.dao;

import br.com.model.Funcionario;
import java.util.List;

public interface FuncionarioDAO {

    int salve(Funcionario f);

    boolean remove(int codigo);

    List<Funcionario> listAll();

    Funcionario listById(int codigo);

    List<Funcionario> listByNome(String nome);

    public boolean validaLogin(String login, String senha);
}
