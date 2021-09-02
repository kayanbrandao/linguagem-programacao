import java.util.Scanner;

public class CategoriasImc {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double imc, altura, peso;

        System.out.print("Digite sua altura: ");
        altura = teclado.nextDouble();
        System.out.print("Digite seu peso: ");
        peso = teclado.nextDouble();

        imc = peso / (altura * altura);

        System.out.print("Categoria IMC: ");
        if (imc < 15.0) {
            System.out.println("Peso severamente abaixo do normal");
        } else if (imc <= 16.0) {
            System.out.println("Peso muito abaixo do normal");
        } else if (imc < 18.5) {
            System.out.println("Peso abaixo do normal");
        } else if (imc < 25.0) {
            System.out.println("Normal");
        } else if (imc < 30.0) {
            System.out.println("Pré-obeso");
        } else if (imc < 35.0) {
            System.out.println("Obesidade classe I");
        } else if (imc < 40.0) {
            System.out.println("Obesidade classe II");
        } else {
            System.out.println("Obesidade classe III");
        }

        teclado.close();
    }
}