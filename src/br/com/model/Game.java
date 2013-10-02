package br.com.model;

public class Game extends Produto {

    private int id_jogo;
    private int id_tipoGenero;
    private int classificacaoEtaria;
    private String tipoMidia;

    public Game() {
    }

    public int getId_jogo() {
        return id_jogo;
    }

    public void setId_jogo(int id_jogo) {
        this.id_jogo = id_jogo;
    }

    public int getId_tipoGenero() {
        return id_tipoGenero;
    }

    public void setId_tipoGenero(int id_genero) {
        this.id_tipoGenero = id_tipoGenero;
    }

    public int getClassificacaoEtaria() {
        return classificacaoEtaria;
    }

    public void setClassificacaoEtaria(int classificacaoEtaria) {
        this.classificacaoEtaria = classificacaoEtaria;
    }

    public String getTipoMidia() {
        return tipoMidia;
    }

    public void setTipoMidia(String tipoMidia) {
        this.tipoMidia = tipoMidia;
    }

    @Override
    public String toString() {
        return "Game{" + "id_jogo=" + id_jogo + ", id_tipoGenero=" + id_tipoGenero + ", classificacaoEtaria=" + classificacaoEtaria + ", tipoMidia=" + tipoMidia + '}';
    }
}
