import java.util.Scanner;

public class TituloSexo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String titulo;

        System.out.print("Nome: ");
        String nome = teclado.next();
        System.out.print("Sobrenome: ");
        String sobrenome = teclado.next();
        System.out.print("Sexo (M/F): ");
        String sexo = teclado.next();
        System.out.print("Idade: ");
        int idade = teclado.nextInt();

        if (idade < 20) {
            titulo = nome;
        } else {
            if (sexo.equals("F")) {
                System.out.print("Você é casado(a), " + nome + "? (S/N): ");
                String casado = teclado.next();
                if (casado.equals("S")) {
                    titulo = "Sra.";
                } else {
                    titulo = "Srta.";
                }
            } else {
                titulo = "Sr.";
            }
        }

        System.out.println("\n" + titulo + " " + sobrenome);
        teclado.close();
    }
}