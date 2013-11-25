package br.com.persistencia.dao;

import br.com.model.Produto;
import java.util.List;

public interface ProdutoDAO {

    int salve(Produto p);

    boolean remove(int codigo);

    List<Produto> listAll();

    Produto listById(int codigo);

    List<Produto> listByNome(String nome);
}