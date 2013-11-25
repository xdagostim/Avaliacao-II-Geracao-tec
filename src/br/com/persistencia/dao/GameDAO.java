package br.com.persistencia.dao;

import br.com.model.Game;
import java.util.List;

public interface GameDAO {

    int salve(Game g);

    boolean remove(int codigo);

    List<Game> listAll();

    Game listById(int codigo);

    List<Game> listByNome(String nome);
}
