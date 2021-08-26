import java.util.Scanner;

public class AvoFeliz{  
    public static void main (String args[]){
        Scanner teclado = new Scanner(System.in);
        Integer escala;
        String resposta;
        Boolean encontro, felizComigo;


        System.out.println("Em uma escala de 0 a 10, quão feliz sua vó está com você?");
        escala = teclado.nextInt();
        System.out.println("Você encontra sua avó ao menos uma vez por mês?");
        resposta = teclado.next();

        encontro = resposta.equals("sim");

        felizComigo = ((escala > 7) && (encontro));
        System.out.println("Vocês estão felizes: " + felizComigo);
        teclado.close();
    }
}