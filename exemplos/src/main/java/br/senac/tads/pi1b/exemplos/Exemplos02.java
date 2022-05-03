package br.senac.tads.pi1b.exemplos;

/*
Obsservações diversas sobre Java:
- Lembrar de usar "ponto-e-virgula" ao final de cada sentença
- Lembrar que letras maiúsculas e minúsculas são diferentes no Java
- Usar aspas duplas para delimitar o texto de uma String
- Cuidado ao copiar/colar código do Word - Normalmente o Word converte as aspas duplas para caracteres diferentes que não são reconhecidos como aspas duplas
*/
/**
 * Exemplos de uso de variáveis do tipo String
 * @author ftsuda
 */
public class Exemplos02 {

    public static void main(String[] args) {
        String mensagem; // Declaração da variável "mensagem"
        mensagem = "Pão de queijo"; // Atribuição do valor "Pão de queijo" à variável "mensagem"
        System.out.println(mensagem); // Apresenta na saída o valor da variável "mensagem"
        
        String mensagem2 = "Coxinha"; // Declaração + atribuição de valor na mesma linha
        System.out.println(mensagem2);
        
        String x = mensagem + ", " + mensagem2; // Concatenação dos valores das variáveis "mensagem" e "mensagem2"
        System.out.println(x);
        
        String mensagem3, mensagem4, mensagem5;
        mensagem3 = "Pizza";
        mensagem4 = "Kibe";
        mensagem5 = "Esfiha";
        x = mensagem3 + ", " + mensagem4 + ", " + mensagem5;
        System.out.println(x);
        
        char letra1 = 'a';
        System.out.println(letra1);
    }
    
}
