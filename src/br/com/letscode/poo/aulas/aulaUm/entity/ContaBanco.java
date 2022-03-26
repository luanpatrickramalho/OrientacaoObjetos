package br.com.letscode.poo.aulas.aulaUm.entity;

public class ContaBanco {
    public String numeroConta;
    public String agencia;
    public String banco;
    public String titular;
    public double saldo;
    public double limite;

    public void depositar(double valor){
        this.saldo += valor;
    }

    public void sacar(double valor){
        this.saldo += valor;
    }
}
