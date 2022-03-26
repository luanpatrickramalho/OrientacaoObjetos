package br.com.letscode.poo.entity;

import java.util.ArrayList;

public class Calculadora {
    private final ArrayList<Float> valores = new ArrayList<>();
    private final ArrayList<String> operacoes = new ArrayList<>();
    private float resultado;

    public float getResultado() {return resultado;}

    public void setResultado(float resultado) {
        this.resultado = resultado;
        valores.add(resultado);
    }

    public float soma(float valor){
        resultado += valor;
        valores.add(valor);
        operacoes.add(String.valueOf('+'));
        return resultado;
    }
    public float subtrai(float valor){
        resultado -= valor;
        valores.add(valor);
        operacoes.add(String.valueOf('-'));
        return resultado;
    }
    public float multiplica(float valor){
        resultado *= valor;
        valores.add(valor);
        operacoes.add(String.valueOf('*'));
        return resultado;
    }
    public float divide(float valor) throws ArithmeticException{
        if (valor == 0f){
            throw new ArithmeticException("Divisão por zero não permitida.");
        } else {
            resultado /= valor;
            valores.add(valor);
            operacoes.add(String.valueOf('/'));
        }
        return resultado;
    }

    public void historico(){
        System.out.println("Historico:");
        System.out.print(" " + valores.get(0));
        for (int i=0; i < operacoes.size(); i++){
            System.out.print(" " + operacoes.get(i));
            System.out.print(" " + valores.get(i+1));
        }
        System.out.print(" ");
    }

    public void limpaHistorico(){
        valores.clear();
        operacoes.clear();
        resultado = 0;
    }
}
