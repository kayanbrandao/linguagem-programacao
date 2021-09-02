import java.util.Scanner;

public class TrintaDias {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int mes, dias;
        String nomeDoMes;

        System.out.print("Qual mês? (1-12) ");
        mes = teclado.nextInt();

        switch (mes) {
            case 1:
                nomeDoMes = "Janeiro";
                break;
            case 2:
                nomeDoMes = "Fevereiro";
                break;
            case 3:
                nomeDoMes = "Março";
                break;
            case 4:
                nomeDoMes = "Abril";
                break;
            case 5:
                nomeDoMes = "Maio";
                break;
            case 6:
                nomeDoMes = "Junho";
                break;
            case 7:
                nomeDoMes = "Julho";
                break;
            case 8:
                nomeDoMes = "Agosto";
                break;
            case 9:
                nomeDoMes = "Setembro";
                break;
            case 10:
                nomeDoMes = "Outubro";
                break;
            case 11:
                nomeDoMes = "Novembro";
                break;
            case 12:
                nomeDoMes = "Dezembro";
                break;
            default:
                nomeDoMes = "erro";
        }

        /*
         * Trinta dias tem setembro Abril, junho e novembro Todo o resto tem trinta e um
         * Exceto no segundo mês sozinho ....
         */

        switch (mes) {
            case 9:
            case 4:
            case 6:
            case 11:
                dias = 30;
                break;
            case 2:
                dias = 28;
                break;
            default:
                dias = 31;
        }

        System.out.println(dias + " dias tem " + nomeDoMes);
        teclado.close();
    }
}