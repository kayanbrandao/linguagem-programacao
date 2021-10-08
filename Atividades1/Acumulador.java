import java.util.Scanner;

public class Acumulador {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int atual, total = 0;

        System.out.print("Digite um monte de valores que irei somá-los. ");
        System.out.println("Pararei quando você digitar 0.");

        do {
            System.out.print("valor: ");
            atual = teclado.nextInt();
            total += atual;
            if (atual != 0)
                System.out.println("O total até agora é: " + total);
        } while (atual != 0);

        System.out.println("O total final é: " + total);
        teclado.close();
    }
}