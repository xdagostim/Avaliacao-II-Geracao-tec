package br.com.model;

public class Game extends Produto {

    private int id_jogo;
    private Genero tipoGenero;
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

    public Genero getTipoGenero() {
        return tipoGenero;
    }

    public void setTipoGenero(Genero tipoGenero) {
        this.tipoGenero = tipoGenero;
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
        return "Game{" + "id_jogo=" + id_jogo + ", tipoGenero=" + tipoGenero + ", classificacaoEtaria=" + classificacaoEtaria + ", tipoMidia=" + tipoMidia + '}';
    }
}
