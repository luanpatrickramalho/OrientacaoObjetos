package br.com.letscode.poo.aulas.aulaDois.exercicios;

import br.com.letscode.poo.entity.Vendedor;

import java.util.Scanner;
/*
    6. Implemente a classe Vendedor como subclasse da classe Empregado. Um determinado vendedor tem como
    atributos, para além dos atributos da classe Pessoa e da classe Empregado, o atributo:
        * valorVendas (correspondente ao valor monetário dos artigos vendidos)
        * comissao (porcentagem do valorVendas que será adicionado ao vencimento base do Vendedor).

    Note que deverá redefinir nesta subclasse o método herdado calcularSalario (o salário de um vendedor é equivalente
    ao salário de um empregado usual acrescido da referida comissão).

    Escreva um programa de teste adequado para esta classe.
    */
public class Exercicio06 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Quantos operários deseja cadastrar?");
        Vendedor[] vendedor = new Vendedor[teclado.nextInt()];
        teclado.nextLine();

        for (int i = 0; i < vendedor.length; i++){
            vendedor[i] = new Vendedor();
            System.out.println("\nInforme os dados do "+(i+1)+"º vendedor:");
            System.out.println("Nome:");
            vendedor[i].setNome(teclado.nextLine());
            System.out.println("Endereço:");
            vendedor[i].setEndereco(teclado.nextLine());
            System.out.println("Telefone:");
            vendedor[i].setTelefone(teclado.nextLine());
            System.out.println("Codigo de Setor:");
            vendedor[i].setCodigoSetor(teclado.nextInt());
            teclado.nextLine();
            System.out.println("Salário Base (R$):");
            vendedor[i].setSalarioBase(teclado.nextDouble());
            teclado.nextLine();
            System.out.println("Imposto sobre salario (%): Ex: '10'");
            vendedor[i].setImposto(teclado.nextFloat());
            teclado.nextLine();
            System.out.println("Total de dias trabalhados: ('30' para todos)");
            int diasTrab = (teclado.nextInt());
            teclado.nextLine();
            System.out.println("Total de descontos (R$):");
            double descontos = (teclado.nextDouble());
            teclado.nextLine();
            System.out.println("Total Valor Vendas (R$):");
            vendedor[i].setVlrVend(teclado.nextDouble());
            teclado.nextLine();
            System.out.println("Percentual comissão (%):");
            vendedor[i].setComissao(teclado.nextDouble());
            teclado.nextLine();

            System.out.printf("Salario Final do funcionario %s: \nR$ %.2f%n",
                    vendedor[i].getNome(),
                    vendedor[i].calcularSalario(diasTrab,descontos));
        }
    }
}
