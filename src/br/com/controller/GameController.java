package br.com.controller;

import br.com.model.Game;
import br.com.persistencia.GameDAOImplements;
import br.com.persistencia.dao.GameDAO;
import java.util.List;

public class GameController {

    public int salvar(Game g) {
        GameDAO dao =
                new GameDAOImplements();
        return dao.salve(g);
    }

    public List<Game> listarTodos() {
        GameDAO dao = new GameDAOImplements();
        return dao.listAll();
    }

    public List<Game> listByNome(String nome) {
        GameDAO dao = new GameDAOImplements();
        return dao.listByNome(nome);
    }

    public Game listById(int id_funcionario) {
        GameDAO dao = new GameDAOImplements();
        return dao.listById(id_funcionario);
    }

    public boolean remove(int id) {
        GameDAO dao = new GameDAOImplements();
        return dao.remove(id);
    }
}
