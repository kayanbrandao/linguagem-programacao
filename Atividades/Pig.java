import java.util.Scanner;

public class Pig {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int jogada, totalJogador, totalComputador, totalTurno;
        String escolha = "";

        totalJogador = 0;
        totalComputador = 0;

        do {
            totalTurno = 0;
            System.out.println("Você tem " + totalJogador + " pontos.");

            do {
                jogada = 1 + (int) (Math.random() * 6);
                System.out.println("\tVocê tirou um " + jogada + ".");
                if (jogada == 1) {
                    System.out.println("\tSeu turno terminou.");
                    totalTurno = 0;
                } else {
                    totalTurno += jogada;
                    System.out.print("\tVocê tem " + totalTurno + " pontos");
                    System.out.print(" até agora nesta rodada.\n");
                    System.out.print("\tVocê quer \"jogar o dado\" novamente");
                    System.out.print(" ou \"passar a vez\"? (jogar/passar)");
                    escolha = teclado.next();
                }
            } while (jogada != 1 && escolha.equals("jogar"));

            totalJogador += totalTurno;
            System.out.println("\tVocê terminou sua rodada com " + totalJogador + " pontos.");

            if (totalJogador < 100) {
                totalTurno = 0;
                System.out.println("O computador tem " + totalComputador + " pontos.");

                do {
                    jogada = 1 + (int) (Math.random() * 6);
                    System.out.println("\tO computador tirou um " + jogada + ".");
                    if (jogada == 1) {
                        System.out.println("\tRodada do computador encerrada.");
                        totalTurno = 0;
                    } else {
                        totalTurno += jogada;
                        System.out.print("\tO computador tem " + totalTurno);
                        System.out.print(" pontos até agora nesta rodada.\n");

                        if ((totalComputador + totalTurno) >= 100)
                            break;
                            
                        if (totalTurno < 20) {
                            System.out.println("\tO computador irá jogar novamente.");
                        }
                    }
                } while (jogada != 1 && totalTurno < 20);

                totalComputador += totalTurno;
                System.out.print("\tO computador terminou a rodada com ");
                System.out.print(totalComputador + " pontos.\n");
            }

        } while (totalJogador < 100 && totalComputador < 100);

        if (totalJogador > totalComputador) {
            System.out.println("O jogador ganhou!");
        } else {
            System.out.println("O computador venceu.");
        }
        teclado.close();
    }
}
