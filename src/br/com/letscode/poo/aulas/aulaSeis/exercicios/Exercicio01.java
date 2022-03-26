package br.com.letscode.poo.aulas.aulaSeis.exercicios;

import br.com.letscode.poo.entity.Calculadora;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();
        boolean temCalc = true;
        boolean isStarted = false;
        char operacao;

        while (temCalc){
            try {
                if (!isStarted) {System.out.println("\nInforme o primeiro valor para cálculo:");
                    calculadora.setResultado(teclado.nextFloat());
                    isStarted = true;
                } else {
                    System.out.println("\n" +
                            "Informe a operação: ( + - * / = C )\n" +
                            " + Soma\n" +
                            " - Subtração\n" +
                            " * Multiplicação\n" +
                            " C Zerar / Reiniciar\n" +
                            " E Sair da Calculadora");
                    System.out.print("= " + calculadora.getResultado() + " ");
                    operacao = teclado.next().charAt(0);
                    switch (operacao) {
                        case '+':
                            calculadora.historico();
                            System.out.print("+ ");
                            calculadora.soma(teclado.nextFloat());
                            teclado.nextLine();
                            break;
                        case '-':
                            calculadora.historico();
                            System.out.print("- ");
                            calculadora.subtrai(teclado.nextFloat());
                            teclado.nextLine();
                            break;
                        case '*':
                            calculadora.historico();
                            System.out.print("* ");
                            calculadora.multiplica(teclado.nextFloat());
                            teclado.nextLine();
                            break;
                        case '/':
                            calculadora.historico();
                            System.out.print("/ ");
                            try {
                                calculadora.divide(teclado.nextFloat());
                            } catch (Exception e) {
                                System.out.println(e.getMessage());
                            }
                            teclado.nextLine();
                            break;
                        case 'c':
                        case 'C':
                            calculadora.limpaHistorico();
                            isStarted = false;
                            break;
                        case 'e':
                        case 'E':
                            System.out.print("\nResultado Final = " + calculadora.getResultado());
                            System.out.print("\nTem certeza de que deseja sair? S/N ");
                            if (teclado.next().equalsIgnoreCase("S")) {
                                calculadora.limpaHistorico();
                                temCalc = false;
                            }
                            break;
                        default:
                            System.out.println("Operação '" + operacao + "' não existe.");
                    }
                }
            } catch (InputMismatchException e){
                System.out.println("Valor não numérico informado. " + e.getLocalizedMessage());
                teclado.nextLine();
            }
        }
    }
}
