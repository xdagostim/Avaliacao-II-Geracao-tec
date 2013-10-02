package br.com.model;

public class Vendas {

    private int id_vendas;
    private Cliente cliente;
    private Produto produto;
    private Funcionario funcionario;
    private double precovenda;
    private int quantidade;

    public Vendas() {
    }

    public int getId_vendas() {
        return id_vendas;
    }

    public void setId_vendas(int id_vendas) {
        this.id_vendas = id_vendas;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public double getPrecovenda() {
        return precovenda;
    }

    public void setPrecovenda(double precovenda) {
        this.precovenda = precovenda;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "Vendas{" + "id_vendas=" + id_vendas + ", cliente=" + cliente + ", produto=" + produto + ", funcionario=" + funcionario + ", precovenda=" + precovenda + ", quantidade=" + quantidade + '}';
    }
}
