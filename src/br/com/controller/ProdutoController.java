package br.com.controller;

import br.com.model.Produto;
import br.com.persistencia.ProdutoDAOImplements;
import br.com.persistencia.dao.ProdutoDAO;
import java.util.List;

public class ProdutoController {

    public int salvar(Produto p) {
        ProdutoDAO dao = new ProdutoDAOImplements();
        return dao.salve(p);
    }

    public List<Produto> listarTodos() {
        ProdutoDAO dao = new ProdutoDAOImplements();
        return dao.listAll();
    }

    public List<Produto> listByNome(String nome) {
        ProdutoDAO dao = new ProdutoDAOImplements();
        return dao.listByNome(nome);
    }

    public Produto listById(int id_Produto) {
        ProdutoDAO dao = new ProdutoDAOImplements();
        return dao.listById(id_Produto);
    }

    public boolean remove(int id) {
        ProdutoDAO dao = new ProdutoDAOImplements();
        return dao.remove(id);
    }
}
