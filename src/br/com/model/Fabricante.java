package br.com.model;

public class Fabricante {

    private int id_fabricante;
    private String nome;

    public int getId_fabricante() {
        return id_fabricante;
    }

    public void setId_fabricante(int id_fabricante) {
        this.id_fabricante = id_fabricante;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Fabricante{" + "id_fabricante=" + id_fabricante + ", nome=" + nome + '}';
    }
}
