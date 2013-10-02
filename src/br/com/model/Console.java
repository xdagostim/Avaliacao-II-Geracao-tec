package br.com.model;

public class Console extends Produto {

    private int id_console;
    private String tipoConsole;

    public Console() {
    }

    public int getId_console() {
        return id_console;
    }

    public void setId_console(int id_console) {
        this.id_console = id_console;
    }

    public String getTipoConsole() {
        return tipoConsole;
    }

    public void setTipoConsole(String tipoConsole) {
        this.tipoConsole = tipoConsole;
    }

    @Override
    public String toString() {
        return "Console{" + "id_console=" + id_console + ", tipoConsole=" + tipoConsole + '}';
    }
}
