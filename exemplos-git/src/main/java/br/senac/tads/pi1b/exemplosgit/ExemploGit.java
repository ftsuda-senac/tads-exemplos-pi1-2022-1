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

    }
}