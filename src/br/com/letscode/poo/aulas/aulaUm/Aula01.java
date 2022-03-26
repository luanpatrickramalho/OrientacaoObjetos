package br.com.letscode.poo.aulas.aulaUm;

import br.com.letscode.poo.aulas.aulaUm.entity.ContaBanco;
import br.com.letscode.poo.aulas.aulaUm.entity.Pessoa;

public class Aula01 {
    public static void main(String[] args) {
        Pessoa pessoa01 = new Pessoa();
        ContaBanco conta01 = new ContaBanco();

        pessoa01.nome = "Luan";
        pessoa01.sobrenome = "Patrick";
        pessoa01.idade = 25;

        conta01.titular = pessoa01.nome+" "+pessoa01.sobrenome;
        conta01.banco = "Itau";
        conta01.agencia = "123-4";
        conta01.numeroConta = "12345-6";
        conta01.saldo = 3500;
        conta01.limite = 6000;

        System.out.println();
        System.out.println("Titular: "+conta01.titular);
        System.out.println("Banco: "+conta01.banco);
        System.out.println("Ag: "+conta01.agencia);
        System.out.println("CC: "+conta01.numeroConta);
    }

}
