package br.com.univag.calculadordeidade;

import java.time.LocalDate;
import java.time.chrono.ChronoPeriod;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class CalculadorDeIdadeApp {

    public static void main(String[] args) {
        System.out.println("Bem vindo ao calculador de idade\n");

        // Pegar a entrada do usuário
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a sua data de nascimento (YYYY-MM-DD): ");
        String stringDataDeNascimento = sc.nextLine();
        LocalDate dataNascimento = LocalDate.parse(stringDataDeNascimento);
        System.out.println();

        DateTimeFormatter dtf = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
        
        // Pegar e mostrar a data de nascimento do usuário
        System.out.println("Sua data de nascimento é " + dtf.format(dataNascimento));

        // Pegar e mostrar a data atual
        LocalDate hoje = LocalDate.now();
        System.out.println("A data atual é " + dtf.format(hoje));

        // Calcular a idade do usuário
        ChronoPeriod p = ChronoPeriod.between(dataNascimento, hoje);


        // Mostrar a idade do usuário
        System.out.println("Sua idade é " + p.get(ChronoUnit.YEARS) + " anos");
        sc.close();
    }
}