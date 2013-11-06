package br.com.persistencia.dao;

import br.com.model.TipoProduto;
import java.util.List;

public interface TipoProdutoDAO {

    int salve(TipoProduto tp);

    boolean remove(int codigo);

    List<TipoProduto> listAll();

    TipoProduto listById(int codigo);

    List<TipoProduto> listByNome(String nome);
}