package br.com.model;

public class Genero {

    private String tipoGenero;

    public Genero() {
    }

    public String getTipoGenero() {
        return tipoGenero;
    }

    public void setTipoGenero(String tipoGenero) {
        this.tipoGenero = tipoGenero;
    }

    @Override
    public String toString() {
        return "Genero{" + "tipoGenero=" + tipoGenero + '}';
    }
}
