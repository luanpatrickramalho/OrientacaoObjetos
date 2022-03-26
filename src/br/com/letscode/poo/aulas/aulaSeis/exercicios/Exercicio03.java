package br.com.letscode.poo.aulas.aulaSeis.exercicios;

import br.com.letscode.poo.entity.Calculadora;
import br.com.letscode.poo.entity.Senhas;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) throws UnsupportedEncodingException, NoSuchAlgorithmException {
        Scanner teclado = new Scanner(System.in);
        Senhas senha = new Senhas();
        Calculadora calculadora = new Calculadora();
        boolean temContinuidade = true;

        while (temContinuidade) {
            System.out.println("Cadastre uma senha:");
            String senhaNova = teclado.next();
            System.out.println("Confirme a senha:");
            String senhaConfirma = teclado.next();

            if (senhaNova.equals(senhaConfirma)) {
                System.out.println("Senha cadastrada com sucesso!");
                senha.setSenhaSHA2hex(senhaNova);
                temContinuidade = false;
                System.out.println();
            } else {
                System.out.println("As senhas digitadas não são iguais.\n" +
                        "Repita o processo!\n");
            }
        }

        temContinuidade = true;
        while (temContinuidade){
            // Teste de senha
            System.out.println("Digite um número:");
            float dividendo = teclado.nextFloat(); teclado.nextLine();
            System.out.println("Digite outro número (diferente de zero):");
            float divisor = teclado.nextFloat(); teclado.nextLine();
            try {
                calculadora.setResultado(dividendo);
                float resultado = calculadora.divide(divisor);
                System.out.println("Digite sua senha:");
                if (senha.isSenha(teclado.next())) {
                    System.out.println("Senha validada com sucesso!");
                    System.out.printf("O resultado da divisão é: %.2f",resultado);
                    temContinuidade = false;
                } else {
                    System.out.println("Senha incorreta! Processo não autorizado.");
                }
            } catch (ArithmeticException e){
                System.out.println(e.getMessage());
            }
            System.out.println();
        }
    }
}
