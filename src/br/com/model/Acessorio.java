package br.com.model;

public class Acessorio extends Produto {

    private int id_acessorio;
    private Console tipoConsole;

    public Acessorio() {
    }

    public int getId_acessorio() {
        return id_acessorio;
    }

    public void setId_acessorio(int id_acessorio) {
        this.id_acessorio = id_acessorio;
    }

    public Console getTipoConsole() {
        return tipoConsole;
    }

    public void setTipoConsole(Console tipoConsole) {
        this.tipoConsole = tipoConsole;
    }

    @Override
    public String toString() {
        return "Acessorio{" + "id_acessorio=" + id_acessorio + ", tipoConsole=" + tipoConsole + '}';
    }
}
