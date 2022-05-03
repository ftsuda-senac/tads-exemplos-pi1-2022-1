package br.senac.tads.pi1b.exemplosgit;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class ExemplosCalculaIdade {

    /**
     * Objetivo: Dado a data de nascimento, calcular a idade
     * @param args 
     */
    public static void main(String[] args) {

        try (Scanner entrada = new Scanner(System.in)) {
            // Entrada: Data de nascimento
            System.out.println("Digite a data de nascimento no formato aaaa-MM-dd");
            String dataNascimentoStr = entrada.nextLine();
            
            // Processo: Converter texto de entrada para LocalDate
            LocalDate dataNascimento = LocalDate.parse(dataNascimentoStr);

            // Processo: Calcular a idade
            long idade1 = ChronoUnit.YEARS.between(dataNascimento, LocalDate.now());
            
            // Saída: Mostrar idade
            System.out.println("Idade: " + idade1);
        } catch (Exception ex) {
            // Bloco executado caso ocorra erro na conversão do texto para Local Date
            System.out.println("ERRO: DATA DE NASCIMENTO INVÁLIDA");
            ex.printStackTrace();
        } finally {
            // Bloco executado ao término dos blocos acima, independentemente se
            // foi executado com sucesso ou houve erro.
            System.out.println("==== Programa finalizado");
        }
    }

}
