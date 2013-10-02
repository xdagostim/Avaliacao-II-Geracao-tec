package br.com.model;

import java.util.Date;

public class SaidaProduto {

    private int id_saidaProduto;
    private Produto produto;
    private String motivo;
    private Date dataSaida;
    private int quantidadeSaida;

    public SaidaProduto() {
    }

    public int getId_saidaProduto() {
        return id_saidaProduto;
    }

    public void setId_saidaProduto(int id_saidaProduto) {
        this.id_saidaProduto = id_saidaProduto;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public Date getDataSaida() {
        return dataSaida;
    }

    public void setDataSaida(Date dataSaida) {
        this.dataSaida = dataSaida;
    }

    public int getQuantidadeSaida() {
        return quantidadeSaida;
    }

    public void setQuantidadeSaida(int quantidadeSaida) {
        this.quantidadeSaida = quantidadeSaida;
    }

    @Override
    public String toString() {
        return "SaidaProduto{" + "id_saidaProduto=" + id_saidaProduto + ", produto=" + produto + ", motivo=" + motivo + ", dataSaida=" + dataSaida + ", quantidadeSaida=" + quantidadeSaida + '}';
    }
}
