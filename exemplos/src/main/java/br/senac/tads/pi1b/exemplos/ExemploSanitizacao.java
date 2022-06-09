package br.senac.tads.pi1b.exemplos;

import java.text.Normalizer;

public class ExemploSanitizacao {
    
    static String sanitizarString(String original) {
        // 1) Remove espaços em branco no começo e final da string
        original = original.trim(); 
        
        // 2) Converte as letras para minúsculas
        original = original.toLowerCase(); 
        
        // 3) Normaliza os caracteres acentuados e converte para versão sem acento
        original = Normalizer
                .normalize(original, Normalizer.Form.NFD)
                .replaceAll("[\\p{InCombiningDiacriticalMarks}]", ""); // Ou "[^\\p{ASCII}]" 
        return original;
    }
    
    public static void main(String[] args) {
        String valor = sanitizarString("  ÁgÜã   ");
        switch(valor) {
            case "agua":
                System.out.println("Você digitou \"Água\"");
                break;
            default:
                System.out.println("Você digitou \"Água\"");
                System.out.println("Valor inválido");
        }
    }
    
}
