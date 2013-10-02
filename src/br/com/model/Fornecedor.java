package br.com.model;

public class Fornecedor extends Pessoa {

    private int id_fornecedor;
    private String nomeEmpresa;
    private int id_produto;
    private String cnpj;
    private String nomeRepresentante;

    public Fornecedor() {
    }

    public int getId_fornecedor() {
        return id_fornecedor;
    }

    public void setId_fornecedor(int id_fornecedor) {
        this.id_fornecedor = id_fornecedor;
    }

    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }

    public int getId_produto() {
        return id_produto;
    }

    public void setId_produto(int id_produto) {
        this.id_produto = id_produto;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getNomeRepresentante() {
        return nomeRepresentante;
    }

    public void setNomeRepresentante(String nomeRepresentante) {
        this.nomeRepresentante = nomeRepresentante;
    }

    @Override
    public String toString() {
        return "Fornecedor{" + "id_fornecedor=" + id_fornecedor + ", nomeEmpresa=" + nomeEmpresa + ", id_produto=" + id_produto + ", cnpj=" + cnpj + ", nomeRepresentante=" + nomeRepresentante + '}';
    }
}
