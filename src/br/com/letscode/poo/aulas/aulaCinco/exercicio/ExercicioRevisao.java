package br.com.letscode.poo.aulas.aulaCinco.exercicio;

import br.com.letscode.poo.entity.Carro;
import br.com.letscode.poo.entity.Moto;
import br.com.letscode.poo.entity.Concessionaria;
import br.com.letscode.poo.enums.TipoCombustaoEnum;

public class ExercicioRevisao {

    public static void main(String[] args) {

        Carro carro1 = new Carro("Volkswagem", "Gol", 2010,
                TipoCombustaoEnum.FLEX.getDescricao(), 42000, 5, Boolean.TRUE);
        Carro carro2 = new Carro("Volkswagem", "Polo", 2012,
                TipoCombustaoEnum.GASOLINA.getDescricao(), 45000, 5, Boolean.TRUE);
        Carro carro3 = new Carro("Volkswagem", "Voyage", 2014,
                TipoCombustaoEnum.FLEX.getDescricao(), 39000, 5, Boolean.TRUE);
        Moto moto = new Moto("Yamaha", "Falcon", 2019,
                TipoCombustaoEnum.FLEX.getDescricao(), 12000, 125);

        Carro[] carros = new Carro[]{carro1, carro2, carro3};

        Moto[] motos = new Moto[]{moto};

        Concessionaria concessionaria = new Concessionaria(carros, motos);
        concessionaria.imprimeCarros();

    }
}
