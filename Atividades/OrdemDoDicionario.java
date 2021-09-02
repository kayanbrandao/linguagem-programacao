import java.util.Scanner;

public class OrdemDoDicionario {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nome;

        System.out.print("Invente um nome para uma linguagem de programação: ");
        nome = teclado.nextLine();

        nome = nome.toLowerCase();

        if (nome.compareTo("c++") < 0)
            System.out.println(nome + " vem ANTES de c++");
        if (nome.compareTo("c++") == 0)
            System.out.println("c++ já existe!");
        if (nome.compareTo("c++") > 0)
            System.out.println(nome + " vem DEPOIS de c++");

        if (nome.compareTo("go") < 0)
            System.out.println(nome + " vem ANTES de go");
        if (nome.compareTo("go") == 0)
            System.out.println("go já existe!");
        if (nome.compareTo("go") > 0)
            System.out.println(nome + " vem DEPOIS de go");

        if (nome.compareTo("java") < 0)
            System.out.println(nome + " vem ANTES de java");
        if (nome.compareTo("java") == 0)
            System.out.println("java já existe!");
        if (nome.compareTo("java") > 0)
            System.out.println(nome + " vem DEPOIS de java");

        if (nome.compareTo("lisp") < 0)
            System.out.println(nome + " vem ANTES de lisp");
        if (nome.compareTo("lisp") == 0)
            System.out.println("lisp já existe!");
        if (nome.compareTo("lisp") > 0)
            System.out.println(nome + " vem DEPOIS de lisp");

        if (nome.compareTo("python") < 0)
            System.out.println(nome + " vem ANTES de python");
        if (nome.compareTo("python") == 0)
            System.out.println("python já existe!");
        if (nome.compareTo("python") > 0)
            System.out.println(nome + " vem DEPOIS de python");

        if (nome.compareTo("ruby") < 0)
            System.out.println(nome + " vem ANTES de ruby");
        if (nome.compareTo("ruby") == 0)
            System.out.println("ruby já existe!");
        if (nome.compareTo("ruby") > 0)
            System.out.println(nome + " vem DEPOIS de ruby");

        if (nome.compareTo("visualbasic") < 0)
            System.out.println(nome + " vem ANTES de visualbasic");
        if (nome.compareTo("visualbasic") == 0)
            System.out.println("visualbasic já existe!");
        if (nome.compareTo("visualbasic") > 0)
            System.out.println(nome + " vem DEPOIS de visualbasic");

        teclado.close();
    }
}