public class ComentariosSequenciaEscape {
	public static void main( String[] args ) {
		// Este exercício demostra sequências de escape e comentários (como este!)
		System.out.print( "Aprender\tJava\n\tnão\né\tdifícil\n\n" );
		System.out.print( "\tAprender Java não \"é\" difícil\n" );
		// System.out.frimp( "Aprender java não é difícil" );
		System.out.print( "Olá\n" ); // Esta linha imprime olá.
		System.out.print( "Aho\by\n" ); // Esta linha imprime Ahoy.
		/* The quick brown fox jumped over a lazy dog.
		Quick wafting zephyrs vex bold Jim. */
		System.out /* testando */ .println( "Difícil de acreditar, né?" );
		System.out.println( "Supreso? /* abcde */ O que você esperava?" );
		System.out.println( "\\ //  -=- \\ //" );
		System.out.println( "\\\\ \\\\\\ \\\\\\\\" ); // usa 2 para fazer 1
		System.out.print( "Espero que você tenha entendido \"sequências de escape\" agora.\n" );
		// comentários. :)
	}
    // não vai funcionar
}
