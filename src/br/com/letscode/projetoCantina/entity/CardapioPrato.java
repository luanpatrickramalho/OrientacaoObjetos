package br.com.letscode.projetoCantina.entity;

import br.com.letscode.projetoCantina.enums.PratosPrecosEnum;
import br.com.letscode.projetoCantina.enums.PratosProdutosEnum;
import br.com.letscode.projetoCantina.interfaces.ICardapio;

import java.util.ArrayList;

public class CardapioPrato implements ICardapio {
    private final ArrayList<String> listaProdutos = new ArrayList<>();
    private final ArrayList<Double> listaPrecos = new ArrayList<>();

    @Override
    public void iniciaCardapio(){
        for (PratosProdutosEnum pratosProdutos : PratosProdutosEnum.values()) {
            this.listaProdutos.add(pratosProdutos.getDescricao());
        }
        for (PratosPrecosEnum pratosPrecos : PratosPrecosEnum.values()) {
            this.listaPrecos.add(pratosPrecos.getValor());
        }
    }

    @Override
    public void listaProdutos() {
        System.out.println("Pratos:");
        for (int i = 0; i < this.listaProdutos.size(); i++){
            System.out.printf("%d - %s - R$ %.2f", i+1, this.listaProdutos.get(i), this.listaPrecos.get(i));
            System.out.println();
        }
    }

    @Override
    public double getPreco(int idProduto) {
        return listaPrecos.get(idProduto);
    }

    @Override
    public String getProduto(int idProduto) {
        return listaProdutos.get(idProduto);
    }
}
