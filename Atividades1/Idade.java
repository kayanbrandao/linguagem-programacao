import java.util.Scanner;

public class Idade {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int idade;

        System.out.print("Qual é a sua idade? ");
        idade = teclado.nextInt();

        System.out.println("Você é: ");
        if (idade < 13) {
            System.out.println("\tmuito novo para ter uma conta no facebook");
        } else {
            System.out.println("idade suficiente para criar uma conta no Facebook");
        }
        if (idade < 18) {
            System.out.println("\tmuito novo para dirigir");
        } else {
            System.out.println("idade suficiente para dirigir");
        }
        if (idade < 18) {
            System.out.println("\tmuito novo para fazer tatuagem");
        } else {
            System.out.println("idade suficiente para fazer tatuagem");
        }
        if (idade < 18) {
            System.out.println("\tmuito novo para beber bebidas alcoólicas");
        } else {
            System.out.println("idade suficiente para beber bebidas alcoólicas");
        }
        if (idade < 35) {
            System.out.println("\tmuito novo para ser presidente do Brasil");
        } else {
            System.out.println("idade suficiente para ser presidente do Brasil");
        }
        if (idade >= 65) {
            System.out.println("Você tem idade suficiente para se aposentar!");
        } else {
            System.out.println("muito novo para se aposentar");
        }

        teclado.close();
    }
}