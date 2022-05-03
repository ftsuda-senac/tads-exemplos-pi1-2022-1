package br.senac.tads.pi1b.exemplos;

import java.util.Scanner;

public class ExemploScanner {

    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            String valorString = entrada.nextLine();
            int valorInt = entrada.nextInt();
            //float valorFloat = entrada.nextFloat();
            float valorFloat = 0.0f;

            System.out.println("Valores: " + valorString + "," + valorInt + "," + valorFloat);
        }

    }

}
