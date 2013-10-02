package br.com.model;

public class Acessorio extends Produto {

    private int id_acessorio;
    private String id_tipoConsole;

    public Acessorio() {
    }

    public int getId_acessorio() {
        return id_acessorio;
    }

    public void setId_acessorio(int id_acessorio) {
        this.id_acessorio = id_acessorio;
    }

    public String getId_tipoConsole() {
        return id_tipoConsole;
    }

    public void setId_tipoConsole(String id_console) {
        this.id_tipoConsole = id_console;
    }

    @Override
    public String toString() {
        return "Acessorio{" + "id_acessorio=" + id_acessorio + ", id_tipoConsole=" + id_tipoConsole + '}';
    }
}
