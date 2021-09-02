public class SegurancaDaBalada {
    public static void main(String[] args) {
        int idade = 22;
        boolean naListaDeConvidados = false;
        double atratividade = 7.5;
        String genero = "F";

        if (naListaDeConvidados || idade >= 21 || (genero.equals("F") && atratividade >= 8)) {
            System.out.println("Você está autorizada a entrar na balada.");
        } else {
            System.out.println("Você não está autorizada a entrar na balada.");
        }
    }
}