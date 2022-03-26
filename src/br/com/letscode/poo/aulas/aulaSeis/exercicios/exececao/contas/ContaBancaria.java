package br.com.letscode.poo.aulas.aulaSeis.exercicios.exececao.contas;

public class ContaBancaria {
    private double saldo;
    private double limite;
    private final double LIMITE_SAQUE = 500d;
    private final double LIMITE_DEPOSITO = 1000d;
    private final double LIMITE_CONTA;

    public ContaBancaria(double valorSaldo, double valorLimite){
        this.saldo = valorSaldo;
        this.limite = valorLimite;
        this.LIMITE_CONTA = valorLimite;
    }

    public double getSaldo(){ return this.saldo; }

    protected double getLimite(){ return this.limite; }

    public double getSaldoComLimite(){ return (this.saldo + this.limite); }

       public boolean sacar(double valor) throws ContaException {
        if (valor > LIMITE_SAQUE){
            throw new ContaException("Valor máximo permitido para saque é de R$ " + LIMITE_SAQUE);
        } else if (valor > (this.saldo + this.limite)) {
            throw new ContaException("Limite insuficiente para o saque!");
        } else {
            double resto = this.saldo - valor;
            if (resto >= 0d){
                this.saldo -= valor;
            } else {
                this.saldo = 0d;
                resto *= -1;
                System.out.printf("Você está usando R$ %.2f do seu limite total!\n",resto);
                this.limite -= resto;
            }
            System.out.println("Saque realizado com sucesso.");
        }
        return true;
    }

    public void depositar(double valor) throws ContaException {
        if (valor > LIMITE_DEPOSITO) {
            throw new ContaException("Valor máximo permitido para depósito é de R$ " + LIMITE_DEPOSITO);
        } else if (this.limite < this.LIMITE_CONTA) {
            if ((this.LIMITE_CONTA - this.limite) >= valor) {
                this.limite += valor;
            } else {
                this.saldo += valor - (this.LIMITE_CONTA - this.limite);
                this.limite = this.LIMITE_CONTA;
            }
        } else {
            this.saldo += valor;
        }
        System.out.printf("Depósito de R$ %.2f Realizado com sucesso.",valor);
    }
}

