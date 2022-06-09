package br.senac.tads.pi1b.exemplos;

import java.util.Random;
import java.util.Scanner;

/*
Notar que no exemplo VetorV1, os valores de entrada e os gerados via random já correspondem aos valores das posições do vetor.
Assim, dá para simplificar e usar diretamente estes valores para pegar os dados do vetor (tanto para jogador quanto para inimigos).
*/
public class ExemploVetorV2 {

    static int[] jogadorPoderes = new int[]{100, 200, 300, 400};

    static int[] inimigo0Poderes = new int[]{20, 30};

    static int[] inimigo1Poderes = new int[]{40, 50};

    static int[] chefePoderes = new int[]{100, 200};

    static void mostrarAtaqueInimigo(int qualInimigo, int poderInimigo) {
        switch (qualInimigo) {
            case 0:
                System.out.println("inimigo0 causou " + inimigo0Poderes[poderInimigo] + " de dano usando poder " + poderInimigo + ".");
                break;
            case 1:
                System.out.println("inimigo1 causou " + inimigo1Poderes[poderInimigo] + " de dano usando poder " + poderInimigo + ".");
                break;
            case 2:
                System.out.println("chefe causou " + chefePoderes[poderInimigo] + " de dano usando poder " + poderInimigo + ".");
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
        System.out.println("Você causou " + jogadorPoderes[poderEscolhido] + " de dano usando poder " + poderEscolhido + ".");
        
        int poderInimigo = random.nextInt(2); // Random pode gerar 0 ou 1.
        mostrarAtaqueInimigo(qualInimigo, poderInimigo);
    }

}
