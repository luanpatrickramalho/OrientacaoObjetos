package br.com.letscode.projetoCantina;

import br.com.letscode.projetoCantina.entity.Cardapio;
import br.com.letscode.projetoCantina.entity.Pedido;

import java.util.Scanner;

public class CantinaApp {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        boolean temPedido = false;
        boolean menuPrincipal = true;
        Pedido pedido = new Pedido();
        Cardapio cardapio = new Cardapio();

        System.out.println("Seja Bem Vindo À Cantina Codifichiamo");
        System.out.println();

        do {
            if (temPedido){
                System.out.println();
                System.out.println("Menu Pedido:\n" +
                        " 1 - Adicionar Itens ao Pedido\n" +
                        " 2 - Lista Pedido Aberto\n" +
                        " 3 - Excluir Itens do Pedido\n" +
                        " 4 - Fecha Pedido Aberto (pagar)\n" +
                        " 0 - Cancelar Pedido Aberto (sair)");
                switch (teclado.nextInt()){
                    case 1:
                        temPedido = false;
                        break;
                    case 2:
                        pedido.listaPedido();
                        System.out.println();
                        break;
                    case 3:
                        pedido.listaPedido();
                        System.out.println();
                        System.out.println("Qual item deseja excluir?");
                        pedido.removeProduto(teclado.nextInt()); teclado.nextLine();
                        break;
                    case 4:
                        pedido.listaPedido();
                        System.out.println();
                        System.out.println("Confirma fechamento do pedido acima? S/N");
                        if (teclado.next().equalsIgnoreCase("S")){
                            pedido.removePedido();
                            menuPrincipal = false;
                        }
                        break;
                    case 0:
                        pedido.listaPedido();
                        System.out.println("Cancelar o pedido acima? S/N");
                        if (teclado.next().equalsIgnoreCase("S")){
                            pedido.removePedido();
                            menuPrincipal = false;
                        }
                        break;
                    default:
                        System.out.println("Operação inválida. Tente novamente!");
                }
            }
            System.out.println();
            while (!temPedido) {
                cardapio.opcoesCardapio();
                int opt = teclado.nextInt(); teclado.nextLine();
                String tipoProduto = cardapio.listaCardapio(opt);
                while (tipoProduto.equalsIgnoreCase("ERRO")) {
                    System.out.printf("Operação %d inválida. Tente novamente!\n", opt);
                    cardapio.opcoesCardapio();
                    opt = teclado.nextInt(); teclado.nextLine();
                    tipoProduto = cardapio.listaCardapio(opt);
                }
                System.out.printf("Valor adicional do Delivery: R$ %.2f\n", pedido.getVlrDeliveryProduto(tipoProduto));
                int idProduto = (teclado.nextInt() - 1); teclado.nextLine();
                try {
                    pedido.insereProduto(tipoProduto, cardapio.getProdutoCardapio(tipoProduto, idProduto),
                            cardapio.getVlrProdutoCardapio(tipoProduto, idProduto));
                    pedido.insereDelivery(tipoProduto);
                    System.out.printf("Adicionado o produto %s ao seu pedido.\n",cardapio.getProdutoCardapio(tipoProduto,idProduto));
                } catch (IndexOutOfBoundsException exception){
                    System.out.println("Operação inválida! " + exception.getMessage());
                }
                System.out.println("Deseja adicionar mais algum item em seu pedido? S/N");
                if (teclado.next().equalsIgnoreCase("N")){
                    temPedido = true;
                }
            }
        } while (menuPrincipal);

        System.out.println("Obrigado!");
    }
}
