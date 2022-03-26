package br.com.letscode.poo.aulas.aulaQuatro.exercicios;

import br.com.letscode.poo.entity.Empregado;
/* 2. Crie um Enum para representar chamado TipoJornadaEmpregado, que será usado na classe Empregado para representar se ele trabalha PERIODO_COMPLETO ou em MEIO_PERIODO.
 A exibição destes valores em console deve ser “Período Completo” e “Meio Período”, respectivamente.*/
public class Exercicio02 {


    public static void main(String[] args) {

        Empregado empregadoMeioPeriodo = new Empregado(
                "Pedro Tulio",
                "Rua Barra, 123",
                "045999994499",
                4,
                3600.15d,
                11f,
                "Meio Período"
        );
        Empregado empregadoPeriodoCompleto = new Empregado(
                "Joana Gisele",
                "Rua Dez, 124",
                "045998745210",
                3,
                2200.60d,
                11f,
                "Período Completo"
        );

        System.out.println(empregadoMeioPeriodo);
        System.out.println();
        System.out.println(empregadoPeriodoCompleto);
    }
}
