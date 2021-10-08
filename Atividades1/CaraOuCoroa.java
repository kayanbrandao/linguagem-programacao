import java.util.Scanner;

public class CaraOuCoroa {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String moeda, novamente = "s";
        int sequenciaAcertos = 0;
        boolean tirouCara;

        while(novamente.equals("s")){
            tirouCara = Math.random() < 0.5;

            if (tirouCara)
                moeda = "CARA";
            else
                moeda = "COROA";

            System.out.println("Você jogou a moeda e deu... " + moeda);

            if (tirouCara) {
                sequenciaAcertos++;
                System.out.println("\tSão " + sequenciaAcertos + " acertos em sequência....");
                System.out.print("\tQuer jogar novamente (s/n)? ");
                novamente = teclado.next();
            }
            else {
                System.out.println("\tVocê perdeu sua sequência!");
                System.out.println("\tDeveria ter parado quando estava ganhando....");
                sequenciaAcertos = 0;
                novamente = "n";
            }
        }


        do {
            tirouCara = Math.random() < 0.5;

            if (tirouCara)
                moeda = "CARA";
            else
                moeda = "COROA";

            System.out.println("Você jogou a moeda e deu... " + moeda);

            if (tirouCara) {
                sequenciaAcertos++;
                System.out.println("\tSão " + sequenciaAcertos + " acertos em sequência....");
                System.out.print("\tQuer jogar novamente (s/n)? ");
                novamente = teclado.next();
            }
            else {
                System.out.println("\tVocê perdeu sua sequência!");
                System.out.println("\tDeveria ter parado quando estava ganhando....");
                sequenciaAcertos = 0;
                novamente = "n";
            }
        } while (novamente.equals("s"));

        System.out.println("Pontuação final: " + sequenciaAcertos);
        teclado.close();
    }
}