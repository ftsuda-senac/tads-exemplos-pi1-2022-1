package br.senac.tads.pi1b.exemplos;

import java.util.Random;
import java.util.Scanner;

/*
Aqui será feita uma alteração para agrupar os poderes de cada personagem em um vetor
Lembrar que nos vetores, as posições são contadas a partir do 0
*/
public class ExemploVetorV1 {

    static int[] jogadorPoderes = new int[]{100, 200, 300, 400};

    static int[] inimigo0Poderes = new int[]{20, 30};

    static int[] inimigo1Poderes = new int[]{40, 50};

    static int[] chefePoderes = new int[]{100, 200};

    static void mostrarAtaqueInimigo(int qualInimigo, int poderInimigo) {
        switch (qualInimigo) {
            case 0:
                if (poderInimigo == 0) {
                    System.out.println("inimigo0 causou " + inimigo0Poderes[0] + " de dano usando poder 0.");
                } else if (poderInimigo == 1) {
                    System.out.println("inimigo0 causou " + inimigo0Poderes[1] + " de dano usando poder 1.");
                }
                break;
            case 1:
                if (poderInimigo == 0) {
                    System.out.println("inimigo1 causou " + inimigo1Poderes[0] + " de dano usando poder 0.");
                } else if (poderInimigo == 1) {
                    System.out.println("inimigo1 causou " + inimigo1Poderes[1] + " de dano usando poder 1.");
                }
                break;
            case 2:
                if (poderInimigo == 0) {
                    System.out.println("chefe causou " + chefePoderes[0] + " de dano usando poder 0.");
                } else if (poderInimigo == 1) {
                    System.out.println("chefe causou " + chefePoderes[1] + " de dano usando poder 1.");
                }
                break;
        }
    }

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
        int poderInimigo = random.nextInt(2); // Random pode gerar 0 ou 1.

        switch (poderEscolhido) {
            case 0:
                System.out.println("Você causou " + jogadorPoderes[0] + " de dano usando poder 0.");
                mostrarAtaqueInimigo(qualInimigo, poderInimigo);
                break;
            case 1:
                System.out.println("Você causou " + jogadorPoderes[1] + " de dano usando poder 1.");
                mostrarAtaqueInimigo(qualInimigo, poderInimigo);
                break;
            case 2:
                System.out.println("Você causou " + jogadorPoderes[2] + " de dano usando poder 2.");
                mostrarAtaqueInimigo(qualInimigo, poderInimigo);
                break;
            case 3:
                System.out.println("Você causou " + jogadorPoderes[3] + " de dano usando poder 3.");
                mostrarAtaqueInimigo(qualInimigo, poderInimigo);
                break;
        }
    }

}
