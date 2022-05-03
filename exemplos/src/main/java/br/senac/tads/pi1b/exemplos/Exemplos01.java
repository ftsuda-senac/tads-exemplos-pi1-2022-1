package br.senac.tads.pi1b.exemplos;

import java.time.LocalDateTime;

public class Exemplos01 {

    public static void main(String[] args) {

        System.out.print("mensagem 1");
        System.out.print("mensagem 2");

        System.out.println("mensagem 3");
        System.out.println("mensagem 4");

        System.out.printf("Data e hora: %s\n", LocalDateTime.now());
        System.out.print("Data e hora: " + LocalDateTime.now() + "\n");
        
        System.out.print("mensagem 5\n\n\n");
        System.out.print("mensagem 6");

    }

} 