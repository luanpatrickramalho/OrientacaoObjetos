package br.com.letscode.poo.aulas.aulaUm.exercicios;
import br.com.letscode.poo.entity.Livro;
import java.util.Scanner;

public class Exercicio02 {
        public static Scanner teclado = new Scanner(System.in);

        public static void main(String[] args) {
            Livro livro1 = new Livro();
            Livro livro2 = new Livro(
                    "Luan",
                    "O Monge e a Coruja",
                    285
            );
            System.out.println("\nInforme os dados do livro1:");
            System.out.println("Nome do leitor:");
            livro1.setPessoaLeitor(teclado.nextLine());
            System.out.println("Titulo do livro:");
            livro1.setTitulo(teclado.nextLine());
            System.out.println("Total de paginas do livro:");
            livro1.setPagTotal(teclado.nextInt());
            teclado.nextLine();

            System.out.println("\nQuantas paginas lidas?");
            System.out.println("Livro1 "+ livro1.getTitulo() +": ");
            float perc1 = livro1.getProgressoLivro(teclado.nextInt());
            teclado.nextLine();
            System.out.printf("%s ja leu %.2f%% do livro %s.\n",
                    livro1.getPessoaLeitor(),
                    perc1,
                    livro1.getTitulo());
            System.out.println();
            System.out.println("Livro2 "+ livro2.getTitulo() +": ");
            float perc2 = livro2.getProgressoLivro(teclado.nextInt());
            teclado.nextLine();
            System.out.printf("%s ja leu %.2f%% do livro %s.\n",
                    livro2.getPessoaLeitor(),
                    perc2,
                    livro2.getTitulo());
            System.out.println();
        }
    }

