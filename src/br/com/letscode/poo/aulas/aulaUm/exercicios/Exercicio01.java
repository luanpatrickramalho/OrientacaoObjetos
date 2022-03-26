package br.com.letscode.poo.aulas.aulaUm.exercicios;

import br.com.letscode.poo.aulas.aulaUm.entity.Funcionario;

import java.util.Scanner;

public class Exercicio01 {
    public static Scanner teclado = new Scanner(System.in);

        public static void main(String[] args) {

            System.out.println("Informe os dados do Funcionario: ");
            System.out.println("Nome: ");
            String nome = teclado.nextLine();
            System.out.println("Sobrenome: ");
            String sobrenome = teclado.nextLine();
            System.out.println("Cidade: ");
            String cidade = teclado.nextLine();
            System.out.println("UF: ");
            String estado = teclado.nextLine();
            System.out.println("Horas Trabalhadas: ");
            int horasTrabalhadas = teclado.nextInt();
            teclado.nextLine();
            System.out.println("Valor recebido por hora: ");
            double vlrHora = teclado.nextDouble();
            teclado.nextLine();

            Funcionario funcionario = new Funcionario(
                    nome,sobrenome,cidade,estado,horasTrabalhadas,vlrHora
            );

            boolean continuar = true;
            do{
                System.out.println("Escolha o que deseja fazer:" +
                        "\n1 - Incrementar a quantidade de horas trabalhadas" +
                        "\n2 - Substituir o valor por hora do funcionário" +
                        "\n3 - Calcular o salário do funcionário no final do mês");
                int opcao = teclado.nextInt();
                teclado.nextLine();

                switch (opcao) {
                    case 1:
                        System.out.println();
                        System.out.println("Informe a quantidade de horas a serem acrescidas");
                        funcionario.printNomeSobrenome();
                        int horas = teclado.nextInt();
                        teclado.nextLine();
                        funcionario.incrementaHora(horas);
                        break;
                    case 2:
                        System.out.println();
                        System.out.println("Informe o novo valor por hora");
                        funcionario.printNomeSobrenome();
                        funcionario.setVlrHora(teclado.nextDouble());
                        teclado.nextLine();
                        System.out.println("Novo valor por hora: R$" + funcionario.getVlrHora());
                        break;
                    case 3:
                        System.out.println();
                        funcionario.calcSalario();
                        break;
                    default:
                        System.out.println("\nOpção "+opcao+" inválida!\n");
                }

                System.out.println("\nDeseja realizar mais alguma operação? S/N");
                String resp = teclado.next();
                if (!resp.equalsIgnoreCase("S")) {continuar = false;}
            } while (continuar);
        }
    }

