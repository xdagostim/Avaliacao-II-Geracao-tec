package br.com.model;

public class Genero {

    private int id_genero;
    private String tipoGenero;

    public Genero() {
    }

    public int getId_genero() {
        return id_genero;
    }

    public void setId_genero(int id_genero) {
        this.id_genero = id_genero;
    }

    public String getTipoGenero() {
        return tipoGenero;
    }

    public void setTipoGenero(String tipoGenero) {
        this.tipoGenero = tipoGenero;
    }

    @Override
    public String toString() {
        return "Genero{" + "id_genero=" + id_genero + ", tipoGenero=" + tipoGenero + '}';
    }
}
