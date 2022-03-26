package br.com.letscode.poo.aulas.aulaDois.exercicios;

import br.com.letscode.poo.entity.Operario;

import java.util.Scanner;

public class Exercicio05 {
    /*
    5. Implemente a classe Operário como subclasse da classe Empregado. Um determinado operário tem como
    atributos, para além dos atributos da classe Pessoa e da classe Empregado, o atributo:
        * valorProducao (que corresponde ao valor monetário dos artigos efetivamente produzidos pelo operário)
        * comissao (que corresponde à porcentagem do valorProducao que será adicionado ao vencimento base do operário).

    Note que deverá redefinir nesta subclasse o método herdado calcularSalario (o salário de um operário é equivalente
    ao salário de um empregado usual acrescido da referida comissão).
    Escreva um programa de teste adequado para esta classe.
    */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Obtem o total de cadastros.
        System.out.println("Quantos operários deseja cadastrar?");
        Operario[] operario = new Operario[teclado.nextInt()];
        teclado.nextLine();

        for (int i = 0; i < operario.length; i++){
            operario[i] = new Operario();
            System.out.println("\nInforme os dados do "+(i+1)+"º operario:");
            System.out.println("Nome:");
            operario[i].setNome(teclado.nextLine());
            System.out.println("Endereço:");
            operario[i].setEndereco(teclado.nextLine());
            System.out.println("Telefone:");
            operario[i].setTelefone(teclado.nextLine());
            System.out.println("Codigo de Setor:");
            operario[i].setCodigoSetor(teclado.nextInt());
            teclado.nextLine();
            System.out.println("Salário Base (R$):");
            operario[i].setSalarioBase(teclado.nextDouble());
            teclado.nextLine();
            System.out.println("Imposto sobre salario (%): Ex: '10'");
            operario[i].setImposto(teclado.nextFloat());
            teclado.nextLine();
            System.out.println("Total de dias trabalhados: ('30' para todos)");
            int diasTrab = (teclado.nextInt());
            teclado.nextLine();
            System.out.println("Total de descontos (R$):");
            double descontos = (teclado.nextDouble());
            teclado.nextLine();
            System.out.println("Total Valor Produção (R$):");
            operario[i].setVlrProd(teclado.nextDouble());
            teclado.nextLine();
            System.out.println("Percentual comissão (%):");
            operario[i].setComissao(teclado.nextDouble());
            teclado.nextLine();

            System.out.printf("Salario Final do funcionario %s: \nR$ %.2f%n",
                    operario[i].getNome(),
                    operario[i].calcularSalario(diasTrab,descontos));
        }
    }
}
