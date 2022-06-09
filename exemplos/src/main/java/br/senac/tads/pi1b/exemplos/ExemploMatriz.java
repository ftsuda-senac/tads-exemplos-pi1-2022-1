package br.senac.tads.pi1b.exemplos;

import java.util.Random;
import java.util.Scanner;

/*
Nesta última alteração, todas as informações dos inimigos serão mantidas em uma matriz, onde
a primeira posição indica qual o inimigo e a segunda o poder dele.
Notar que abstraimos que o chefe é o inimigo 2.
*/
public class ExemploMatriz {

    static int[] jogadorPoderes = new int[]{100, 200, 300, 400};

    static int[][] inimigosPoderes = new int[][]{
        {20, 30}, // inimigo0
        {40, 50}, // inimigo1
        {100, 200} // chefe (no caso, o chefe passa a ser o inimigo2)
    };

    static void mostrarAtaqueInimigo(int qualInimigo, int poderInimigo) {
        switch (qualInimigo) {
            case 2:
                System.out.println("chefe causou " + inimigosPoderes[qualInimigo][poderInimigo] + " de dano usando poder " + poderInimigo + ".");
                break;
            default:
                System.out.println("inimigo" + qualInimigo + " causou " + inimigosPoderes[qualInimigo][poderInimigo] + " de dano usando poder " + poderInimigo + ".");
                break;
        }
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Random random = new Random();

        int qualInimigo = random.nextInt(3); // Random pode gerar 0, 1 ou 2 (chefe);
        switch (qualInimigo) {
            case 2:
                System.out.println("Você enfrentará chefe.");
                break;
            default:
                System.out.println("Você enfrentará inimigo" + qualInimigo + ".");
                break;
        }

        System.out.println("Escolha um poder de 0 a 3 para usar:");
        int poderEscolhido = entrada.nextInt(); // valores de 0 a 3 são válidos
        System.out.println("Você causou " + jogadorPoderes[poderEscolhido] + " de dano usando poder " + poderEscolhido + ".");
        
        int poderInimigo = random.nextInt(2); // Random pode gerar 0 ou 1.
        mostrarAtaqueInimigo(qualInimigo, poderInimigo);
    }

}
