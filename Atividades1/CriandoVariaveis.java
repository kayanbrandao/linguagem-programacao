public class CriandoVariaveis {
	public static void main( String[] args ) {
		int x, y, z, idade;
		double segundos, e, conta, altura;
		String nome, sobrenome, pronome, qualquer1, qualquer2;

		x = 10;
		y = 400;
        z = 27;
		idade = 39;
		segundos = 4.71;
		e = 2.71828182845904523536;
		conta = 1.89;
        altura = 1.75;

		nome = "Pedro";
		sobrenome = "Souza";
		pronome = "Sr.";
        qualquer1 = "Seu";
        qualquer2 = "Creisson";

		System.out.println("Sua idade é de: " + idade + " anos");
		System.out.println( "A variável x contém " + x );
		System.out.println( "O valor " + y + " está armazenado na variável y" );
		System.out.println( "O experimento levou " + segundos + " segundos." );
		System.out.println( "O número de Euler integra conjunto dos números irracionais: " + e );
		System.out.println( "Espero que você tenha mais de  R$" + conta + "!" );
		System.out.println( "Meu nome é " + pronome + " " + nome + " " + sobrenome );

        System.out.println("Eu sou o " + qualquer1 + " " + qualquer2 + " tenho " + z + " anos e " + altura + " de altura");
	}
}


