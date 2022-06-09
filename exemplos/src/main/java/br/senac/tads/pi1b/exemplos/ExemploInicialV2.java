package br.senac.tads.pi1b.exemplos;

import java.util.Random;
import java.util.Scanner;

/*
Notar que o código dentro do switch do ataque do jogador pode ser movido para fora
e não precisa ser repetido dentro de cada case do ataque do jogador.
 */
public class ExemploInicialV2 {

    static int jogadorPoder0 = 100;
    static int jogadorPoder1 = 200;
    static int jogadorPoder2 = 300;
    static int jogadorPoder3 = 400;

    static int inimigo0Poder0 = 20;
    static int inimigo0Poder1 = 30;

    static int inimigo1Poder0 = 30;
    static int inimigo1Poder1 = 50;

    static int chefePoder0 = 100;
    static int chefePoder1 = 200;

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Random random = new Random();

        int qualInimigo = random.nextInt(3); // Random pode gerar 0, 1 ou 2 (chefe);
        switch (qualInimigo) {
            case 0:
                System.out.println("Você enfrentará inimigo0.");
                break;
            case 1:
                System.out.println("Você enfrentará inimigo1.");
                break;
            case 2:
                System.out.println("Você enfrentará chefe.");
                break;
        }

        System.out.println("Escolha um poder de 0 a 3 para usar:");
        int poderEscolhido = entrada.nextInt(); // valores de 0 a 3 são válidos
        switch (poderEscolhido) {
            case 0:
                System.out.println("Você causou " + jogadorPoder0 + " de dano usando poder 0.");
                break;
            case 1:
                System.out.println("Você causou " + jogadorPoder1 + " de dano usando poder 1.");
                break;
            case 2:
                System.out.println("Você causou " + jogadorPoder2 + " de dano usando poder 2.");
                break;
            case 3:
                System.out.println("Você causou " + jogadorPoder3 + " de dano usando poder 3.");
                break;
        }

        int poderInimigo = random.nextInt(2); // Random pode gerar 0 ou 1.
        switch (qualInimigo) {
            case 0:
                if (poderInimigo == 0) {
                    System.out.println("inimigo0 causou " + inimigo0Poder0 + " de dano usando poder 0.");
                } else if (poderInimigo == 1) {
                    System.out.println("inimigo0 causou " + inimigo0Poder1 + " de dano usando poder 1.");
                }
                break;
            case 1:
                if (poderInimigo == 0) {
                    System.out.println("inimigo1 causou " + inimigo1Poder0 + " de dano usando poder 0.");
                } else if (poderInimigo == 1) {
                    System.out.println("inimigo1 causou " + inimigo1Poder1 + " de dano usando poder 1.");
                }
                break;
            case 2:
                if (poderInimigo == 0) {
                    System.out.println("chefe causou " + chefePoder0 + " de dano usando poder 0.");
                } else if (poderInimigo == 1) {
                    System.out.println("chefe causou " + chefePoder1 + " de dano usando poder 1.");
                }
                break;
        }
    }

}
