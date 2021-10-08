import java.util.Scanner;

public class PerguntasRudes {
    public static void main(String[] args) {
        String nome;
        int idade;
        double peso, renda;

        String sobrenome;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Olá. Qual é o seu nome? ");
        nome = teclado.next();
        // a function next() engloba apenas valores do type string

        System.out.print("Qual é o seu sobrenome? ");
        sobrenome = teclado.next();

        System.out.print("Oi, " + nome + "! Quantos anos você tem? ");
        idade = teclado.nextInt();
        // a function nextInt() engloba apenas valores do type int

        System.out.println("Então você tem " + idade + " anos, né? Não é muito velho(a).");
        System.out.print("Qual é o seu peso, " + nome + "? ");
        peso = teclado.nextDouble();
        // não da problema colocar um valor INT, porque, o type DOUBLE engloba todos os
        // valores (inteiros e flutuantes)

        System.out.println(peso + "! Melhor não contar para mais ninguém!!");
        System.out.print("Última pergunta, qual é a sua renda, " + nome + " " + sobrenome + "? ");
        renda = teclado.nextDouble();
        // a function nextDouble() engloba apenas valores do type double

        System.out.print("Espero que seja " + renda + " por hora");
        System.out.println(" e não por ano!");
        System.out.print("Bem, obrigado por responder essas perguntas indiscretas, ");
        System.out.println(nome + " " + sobrenome + ".");
        teclado.close();
    }
}
