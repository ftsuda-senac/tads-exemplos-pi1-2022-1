package br.senac.tads.pi1b.exemplosgit;

import java.util.Random;

public class ExemploGit {

    public static void main(String[] args) {
        
        int[] vetor = new int[15];

        for (int i = 0; i < vetor.length; i++) {

            int random = new Random().nextInt(9);
            vetor[i] = random;
        }

        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }

        int soma = 1 + 199;
        System.out.println("Resultado soma: " + soma);
        
        int numero = 10;
        if (numero % 2 == 0) {
            System.out.println("Número par");
        } else {
            System.out.println("Número ímpar");
        }
        
    }
}
