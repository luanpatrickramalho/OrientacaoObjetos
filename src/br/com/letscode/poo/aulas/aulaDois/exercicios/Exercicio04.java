package br.com.letscode.poo.aulas.aulaDois.exercicios;

import br.com.letscode.poo.entity.Administrador;

import java.util.Scanner;
/*
   4. Implemente a classe Administrador como subclasse da classe Empregado. Um determinado administrador tem
   como atributos, para além dos atributos da classe Pessoa e da classe Empregado, o atributo:
       ajudaDeCusto (ajudas referentes a viagens, estadias, ...).

   Note que deverá redefinir na classe Administrador o método herdado calcularSalario (o salário de um administrador
   é equivalente ao salário de um empregado usual acrescido das ajuda de custo).
   Escreva um programa de teste adequado para esta classe.
   */
public class Exercicio04 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Quantos administradores deseja cadastrar?");
        Administrador[] administrador = new Administrador[teclado.nextInt()];
        teclado.nextLine();

        for (int i = 0; i < administrador.length; i++){
            administrador[i] = new Administrador();
            System.out.println("\nInforme os dados do "+(i+1)+"º administrador:");
            System.out.println("Nome:");
            administrador[i].setNome(teclado.nextLine());
            System.out.println("Endereço:");
            administrador[i].setEndereco(teclado.nextLine());
            System.out.println("Telefone:");
            administrador[i].setTelefone(teclado.nextLine());
            System.out.println("Codigo de Setor:");
            administrador[i].setCodigoSetor(teclado.nextInt());
            teclado.nextLine();
            System.out.println("Salário Base (R$):");
            administrador[i].setSalarioBase(teclado.nextDouble());
            teclado.nextLine();
            System.out.println("Imposto sobre salario (%): Ex: '10'");
            administrador[i].setImposto(teclado.nextFloat());
            teclado.nextLine();
            System.out.println("Total de dias trabalhados: ('30' para todos)");
            int diasTrab = (teclado.nextInt());
            teclado.nextLine();
            System.out.println("Total de descontos (R$):");
            double descontos = (teclado.nextDouble());
            teclado.nextLine();
            System.out.println("Total Ajuda de Custo (R$):");
            administrador[i].setAjudaDeCusto(teclado.nextDouble());
            teclado.nextLine();

            System.out.printf("Salario Final do funcionario %s: \nR$ %.2f%n",
                    administrador[i].getNome(),
                    administrador[i].calcularSalario(diasTrab,descontos));
        }
    }
}
