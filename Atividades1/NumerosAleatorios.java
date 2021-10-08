public class NumerosAleatorios {
    public static void main(String[] args) {
        int a, b, c, d;
        double r, ppt;

        ppt = Math.random();
        if (ppt < 0.3333333) { // será verdade 1/3 das vezes
            System.out.println("PEDRA");
        } else if (ppt < 0.6666667) {
            System.out.println("PAPEL");
        } else {
            System.out.println("TESOURA");
        }

        // escolha quatro inteiros aleatórios dentro de 1 a 10
        a = 1 + (int) (10 * Math.random());
        b = 1 + (int) (10 * Math.random());
        c = 1 + (int) (10 * Math.random());
        d = 1 + (int) (10 * Math.random());
        System.out.println("1-10:\t" + a + "\t" + b + "\t" + c + "\t" + d);

        // escolha quatro inteiros aleatórios dentro de 1 a 6
        a = 1 + (int) (6 * Math.random());
        b = 1 + (int) (6 * Math.random());
        c = 1 + (int) (6 * Math.random());
        d = 1 + (int) (6 * Math.random());
        System.out.println("1-6:\t" + a + "\t" + b + "\t" + c + "\t" + d);

        // escolha um inteiro aleatórios dentro de 1 a 100
        a = 1 + (int) (100 * Math.random());
        System.out.println("1-100:\t" + a + "\t" + a + "\t" + a + "\t" + a);

        // escolha quatro inteiros aleatórios dentro de 1 a 100
        a = 1 + (int) (100 * Math.random());
        b = 1 + (int) (100 * Math.random());
        c = 1 + (int) (100 * Math.random());
        d = 1 + (int) (100 * Math.random());
        System.out.println("1-100:\t" + a + "\t" + b + "\t" + c + "\t" + d);

        // escolha quatro inteiros aleatórios dentro de 0 a 99
        a = 0 + (int) (100 * Math.random());
        b = 0 + (int) (100 * Math.random());
        c = (int) (100 * Math.random());
        d = (int) (100 * Math.random());
        System.out.println("0-99:\t" + a + "\t" + b + "\t" + c + "\t" + d);

        // escolha quatro inteiros aleatórios dentro de 10 a 20
        a = 10 + (int) (11 * Math.random());
        b = 10 + (int) (11 * Math.random());
        c = 10 + (int) (11 * Math.random());
        d = 10 + (int) (11 * Math.random());
        System.out.println("10-20:\t" + a + "\t" + b + "\t" + c + "\t" + d);

        // escolha quatro doubles aleatórios dentro de 0 a quase 1
        System.out.println("0-1:\t" + Math.random() + "\t" + Math.random());
        System.out.println("0-1:\t" + Math.random() + "\t" + Math.random());

        r = 10 * Math.random();
        System.out.println("0-9.99:\t" + r);
        System.out.println("0-9:\t" + (int) r);
        System.out.println("1-10:\t" + (1 + (int) r));

        a = 1 + (int) (3 * Math.random());
        b = 1 + (int) (3 * Math.random());
        c = 1 + (int) (3 * Math.random());

        System.out.println("1-3:\t" + a + "\t" + b + "\t" + c);

        a = 6 + (int) (5 * Math.random());
        b = 6 + (int) (5 * Math.random());
        c = 6 + (int) (5 * Math.random());

        System.out.println("5-10:\t" + a + "\t" + b + "\t" + c);
    }
}