package br.com.model;

import java.util.Date;

public class Funcionario extends Pessoa {

    private int id_funcionario;
    private String cargo;
    private double cargaHoraria;
    private double salario;
    private String ctps;
    private Date dataAdmissao;
    private String login;
    private String senha;

    public Funcionario() {
    }

    public int getId_funcionario() {
        return id_funcionario;
    }

    public void setId_funcionario(int id_funcionario) {
        this.id_funcionario = id_funcionario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(double cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getCtps() {
        return ctps;
    }

    public void setCtps(String ctps) {
        this.ctps = ctps;
    }

    public Date getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(Date dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public String toString() {
        return "Funcionario{" + "id_funcionario=" + id_funcionario + ", cargo=" + cargo + ", cargaHoraria=" + cargaHoraria + ", salario=" + salario + ", ctps=" + ctps + ", dataAdmissao=" + dataAdmissao + ", login=" + login + ", senha=" + senha + '}';
    }
}
