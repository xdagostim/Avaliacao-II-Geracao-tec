package br.com.model;

public class Game extends Produto {

    private int id_game;
    private String tipoGenero;
    private int classificacaoEtaria;
    private String tipoMidia;
    private String nome;
    private String descricao;
    private int quantidade;
    private double preco;

    public Game() {
    }

    public int getId_game() {
        return id_game;
    }

    public void setId_game(int id_game) {
        this.id_game = id_game;
    }

    public String getTipoGenero() {
        return tipoGenero;
    }

    public void setTipoGenero(String tipoGenero) {
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

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Game{" + "id_game=" + id_game + ", tipoGenero=" + tipoGenero + ", classificacaoEtaria=" + classificacaoEtaria + ", tipoMidia=" + tipoMidia + ", nome=" + nome + ", descricao=" + descricao + ", quantidade=" + quantidade + ", preco=" + preco + '}';
    }
}
