import java.util.Scanner;

public class DigitePin {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int pin, entrada;
        String senhaDigitada;
        pin = 12345;

        System.out.println("BEM VINDO AO JAVA BANCO.");
        System.out.print("DIGITE SUA SENHA: ");
        senhaDigitada = teclado.nextLine();

        while (!senhaDigitada.equals("Pa$$w0rD")){
            System.out.println("\nSENHA INCORRETA. TENTE NOVAMENTE.");
            System.out.print("DIGITE SUA SENHA: ");
            senhaDigitada = teclado.nextLine();
        }

        System.out.print("DIGITE SEU PIN: ");
        entrada = teclado.nextInt();

        while (entrada != pin) {
            System.out.println("\nPIN INCORRETO. TENTE NOVAMENTE.");
            System.out.print("DIGITE SEU PIN: ");
            entrada = teclado.nextInt();
        }

        System.out.println("\nPIN ACEITO. O BALANÇO DA SUA CONTA CORRENTE É R$425.17");

        teclado.close();
    }
}