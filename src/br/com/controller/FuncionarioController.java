
package br.com.controller;

import br.com.model.Funcionario;
import br.com.persistencia.FuncionarioDAOImplements;
import br.com.persistencia.dao.FuncionarioDAO;
import java.util.List;

public class FuncionarioController {
    
    public int salvar(Funcionario f) {
        FuncionarioDAO dao =
                new FuncionarioDAOImplements();
        return dao.salve(f);
    }

    public List<Funcionario> listarTodos() {
        FuncionarioDAO dao = new FuncionarioDAOImplements();
        return dao.listAll();
    }
    
    public List<Funcionario> listByNome(String nome){
        FuncionarioDAO dao = new FuncionarioDAOImplements();
        return dao.listByNome(nome);
    }

    public Funcionario listById(int id_funcionario) {
        FuncionarioDAO dao = new FuncionarioDAOImplements();
        return dao.listById(id_funcionario);
    }
    
    public boolean remove(int id) {
        FuncionarioDAO dao = new FuncionarioDAOImplements();
        return dao.remove(id);
    }
    
}
