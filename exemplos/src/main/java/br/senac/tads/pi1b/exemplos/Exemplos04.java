package br.senac.tads.pi1b.exemplos;

public class Exemplos04 {

    public static void main(String[] args) {
        int v1;
        v1 = 33;
        int v2 = 5;
        System.out.println("Valor v1=" + v1 + ", Valor v2=" + v2);

        int v3 = 40, v4 = 7;
        System.out.println("Valor v3=" + v3 + ", Valor v4=" + v4);
        
        int r1 = v1 + v2;
        int r2 = v1 - v2;
        int produto = v1 * v2;
        int divisao = v1 / v2;
        int resto = v1 % v2;
        
        System.out.println("Resultados das operações:");
        System.out.println("Soma: " + v1 + "+" + v2 + "=" + r1);
        System.out.println("Subtração: " + v1 + "-" + v2 + "=" + r2);
        System.out.println("Multiplicação: " + v1 + "*" + v2 + "=" + produto);
        System.out.println("Divisão: " + v1 + "/" + v2 + "=" + divisao);
        System.out.println("Resto: " + v1 + "%" + v2 + "=" + resto);
    }

}
