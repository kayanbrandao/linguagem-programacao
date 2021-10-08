import java.util.Scanner;

public class Sequencia {
    public static void main(String[] args) {
        // ESTE CÓDIGO ESTARÁ QUEBRADO ATÉ VOCÊ CONSERTÁ-LO

        Scanner teclado = new Scanner(System.in);
        double preco, imposto, total;

        System.out.print("Qual é o preço da compra? ");
        preco = teclado.nextDouble();

        imposto = preco * 0.0825;
        total = preco + imposto;

        System.out.println("Preço do item:\t" + preco);
        System.out.println("Imposto:\t" + imposto);
        System.out.println("Total:\t" + total);
        teclado.close();
    }
}