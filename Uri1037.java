import java.util.Scanner;
public class Uri1037{
    public static void main(String arg[]){
        Scanner teclado = new Scanner (System.in);

        // variaveis
        float intervalo;

        // entradas
        intervalo = teclado.nextFloat();

        // condicoes
        if ((intervalo >= 0) && (intervalo <= 25)){
            System.out.println("Intervalo (0,25]");
        }
        else if ((intervalo > 25) && (intervalo <= 50)){
            System.out.println("Intervalo (25,50]");
        }
        else if ((intervalo > 50) && (intervalo <= 70)){
            System.out.println("Intervalo (50,75]");
        }
        else if ((intervalo > 70) && (intervalo <= 100)){
            System.out.println("Intervalo (75,100]");
        }
        else {
            System.out.println("Fora de intervalo");
        }

    }
}