package br.com.letscode.poo.aulas.aulaUm.exercicios;
import br.com.letscode.poo.entity.Veiculo;
import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {

    Scanner teclado = new Scanner(System.in);
        Veiculo carro = new Veiculo();

        carro.setModelo("Fusca");
        carro.setMarca("Volkswagen");
        carro.setCor("Azul");
        carro.setAnoFab(1986);
        carro.setVlrFipe(25000);
        carro.setVelMax(120);

        boolean continuar = true;
        while(continuar) {
            carro.printInfo();
            System.out.println();
            System.out.println("Escolha: " +
                    "\n1 - Acelerar" +
                    "\n2 - Frear");
            int opcao = teclado.nextInt();
            teclado.nextLine();

            switch (opcao){
                case 1 :
                    System.out.println("Informe a velocidade:");
                    int velAumenta = teclado.nextInt();
                    teclado.nextLine();
                    carro.acelerar(velAumenta);
                    break;
                case 2 :
                    System.out.println("Informe a velocidade:");
                    int velDiminui = teclado.nextInt();
                    teclado.nextLine();
                    carro.frear(velDiminui);
                    break;
                default :
                    System.out.println("Opção inválida!");
            }

            System.out.println("\nDeseja continuar? S/N");
            String resp = teclado.nextLine();
            if (!resp.equalsIgnoreCase("S")){
                continuar = false;
            }
        }
}
}
