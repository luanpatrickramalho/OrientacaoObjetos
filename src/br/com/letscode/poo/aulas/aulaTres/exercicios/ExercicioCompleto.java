package br.com.letscode.poo.aulas.aulaTres.exercicios;

import br.com.letscode.poo.enums.TipoJornadaEmpregadoEnum;
import br.com.letscode.poo.entity.Empregado;
import br.com.letscode.poo.entity.Fornecedor;
public class ExercicioCompleto {

    public static void main(String[] args) {

        Fornecedor fornecedor = new Fornecedor(
                "Jose","rua R, 0", "9090990990",5500,500);
        Empregado empregado = new Empregado(
                "Tiao","rua 10, 20","995925932",3,4332,
                11, TipoJornadaEmpregadoEnum.PERIODO_COMPLETO.getDescricao());


        System.out.println("Fornecedor: "+fornecedor);
        System.out.println("Empregado: "+empregado);

        int diasTrabalhados = 28;
        double descontos = 350d;
        double salarioFinalMes = empregado.calcularSalario(diasTrabalhados, descontos);
        System.out.printf("\nO salario do mês do empregado %s é: " +
                "\n  Salário Base: R$%.2f" + "\n  Dias: %d" + "\n  Descontos: R$%.2f" + "\n  Total: R$%.2f",
                empregado.getNome(),empregado.getSalarioBase(),diasTrabalhados,descontos,salarioFinalMes);

    }
}
