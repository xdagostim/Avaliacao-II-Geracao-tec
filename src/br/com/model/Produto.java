package br.com.model;

public abstract class Produto {

    private int id_produto;
    private double preco;
    private Fornecedor fornecedor;
    private String descricao;
    private String nome;
    private TipoProduto tipoProduto;

    public Produto() {
    }

    public int getId_produto() {
        return id_produto;
    }

    public void setId_produto(int id_produto) {
        this.id_produto = id_produto;
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

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public TipoProduto getTipoProduto() {
        return tipoProduto;
    }

    public void setTipoProduto(TipoProduto tipoProduto) {
        this.tipoProduto = tipoProduto;
    }

    @Override
    public String toString() {
        return "Produto{" + "id_produto=" + id_produto + ", preco=" + preco + ", fornecedor=" + fornecedor + ", descricao=" + descricao + ", nome=" + nome + ", tipoProduto=" + tipoProduto + '}';
    }
}
