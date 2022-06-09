package br.senac.tads.pi1b.exemplos;

import java.util.Random;
import java.util.Scanner;

/*
Considerações importantes deste exemplo:
- Contagem dos poderes e inimigos começa em 0 para facilitar entendimento
- Jogador tem 4 poderes disponíveis (numerados de 0 a 3)
- Existem 3 inimigos, com poderes diferentes (inimigos numerados de 0 a 2, poderes de 0 a 1)
- O terceiro inimigo é o chefe.
- Todos os poderes são fixos, então as variáveis correspondentes estão declaradas como globais
- Cada variável representa uma combinação do jogador ou inimigo com os respectivos poderes
 */
public class ExemploInicialInadequadoV1 {

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
        int poderInimigo = random.nextInt(2); // Random pode gerar 0 ou 1.

        switch (poderEscolhido) {
            case 0:
                System.out.println("Você causou " + jogadorPoder0 + " de dano usando poder 0.");
                // Notar que o switch abaixo está se repetindo nos demais cases do poder do jogador
                // Daqui podemos melhorar de duas maneiras:
                // 1) Entender que, neste caso, o ataque do inimigo não depende do poder escolhido pelo jogador.
                //    Dessa forma, podemos mover essa lógica para fora do switch do poder do jogador (ExemploInicialV2)
                // 2) Converter em uma função (ExemploInicialV3)
                // 3) Usar em conjunto os dois caminhos anteriores.
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
                break;
            case 1:
                System.out.println("Você causou " + jogadorPoder1 + " de dano usando poder 1.");
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
                break;
            case 2:
                System.out.println("Você causou " + jogadorPoder2 + " de dano usando poder 2.");
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
                break;
            case 3:
                System.out.println("Você causou " + jogadorPoder3 + " de dano usando poder 3.");
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
                break;
        }
    }

}
