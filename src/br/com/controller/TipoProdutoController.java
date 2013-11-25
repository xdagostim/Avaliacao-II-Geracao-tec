package br.com.controller;

import br.com.model.TipoProduto;
import br.com.persistencia.TipoProdutoDAOImplements;
import br.com.persistencia.dao.TipoProdutoDAO;
import java.util.List;

public class TipoProdutoController {

    public int salvar(TipoProduto tp) {
        TipoProdutoDAO dao =
                new TipoProdutoDAOImplements();
        return dao.salve(tp);
    }

    public List<TipoProduto> listarTodos() {
        TipoProdutoDAO dao = new TipoProdutoDAOImplements();
        return dao.listAll();
    }

    public List<TipoProduto> listByNome(String nome) {
        TipoProdutoDAO dao = new TipoProdutoDAOImplements();
        return dao.listByNome(nome);
    }

    public TipoProduto listById(int id_tipoProduto) {
        TipoProdutoDAO dao = new TipoProdutoDAOImplements();
        return dao.listById(id_tipoProduto);
    }

    public boolean remove(int id) {
        TipoProdutoDAO dao = new TipoProdutoDAOImplements();
        return dao.remove(id);
    }
}
