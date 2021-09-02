import java.util.Scanner;

import static java.lang.System.out;

public class InscricaoNaUniversidade {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int nota;

        out.println("Bem vindo à interface de inscrições na Universidade!");
        out.print("Por favor digite a sua nota do ENEM (0-1000): ");
        nota = teclado.nextInt();

        out.print("Probabilidade da inscrição ser efetivada: ");

        if (nota >= 790)
            out.print("CERTEZA ");
        else if (nota >= 710)
            out.print("SEGURO ");
        else if (nota >= 580)
            out.print("PROVÁVEL ");
        else if (nota >= 500)
            out.print("INCERTO ");
        else if (nota >= 390)
            out.print("NÃO PROVÁVEL ");
        else // below 390
            out.print("NENHUMA ");
        out.println();

        teclado.close();
    }
}