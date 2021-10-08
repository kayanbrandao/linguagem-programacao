public class ComputadorJogadorDePig {
	public static void main(String[] args) {
		int jogada, total;
		total = 0;

		do {
			jogada = 1 + (int) (Math.random() * 6);
			System.out.println("O computador tirou um " + jogada + ".");
			if (jogada == 1) {
				System.out.println("\tTurno encerrado.");
				total = 0;
			}
			else {
				total += jogada;
				System.out.print("\tO computador tem " + total);
				System.out.print(" pontos até agora neste turno.\n");
				if (total < 20) {
					System.out.println("\tO computador irá jogar novamente.");
				}
			}
		} while (jogada != 1 && total < 20);

		System.out.println("O computador terminou o turno com " + total + " pontos.");
	}
}