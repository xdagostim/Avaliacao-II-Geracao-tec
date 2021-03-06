package br.com.model;

import java.util.Date;

public class EntradaProduto {

    private int id_entraProduto;
    private Produto produto;
    private Date dataEntrada;
    private Transportador transportador;

    public EntradaProduto() {
    }

    public int getId_entraProduto() {
        return id_entraProduto;
    }

    public void setId_entraProduto(int id_entraProduto) {
        this.id_entraProduto = id_entraProduto;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Date getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(Date dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public Transportador getTransportador() {
        return transportador;
    }

    public void setTransportador(Transportador transportador) {
        this.transportador = transportador;
    }

    @Override
    public String toString() {
        return "EntradaProduto{" + "id_entraProduto=" + id_entraProduto + ", produto=" + produto + ", dataEntrada=" + dataEntrada + ", transportador=" + transportador + '}';
    }
}
