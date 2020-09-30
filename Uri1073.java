import java.util.Scanner;
public class Uri1073{
    public static void main (String arg[]){
        Scanner teclado = new Scanner (System.in);

        //variaveis
        int N;
        int quadrado;

        //entrada
        N = teclado.nextInt();


        //condicoes
        if ((N > 5) && (N < 2000)){
            for (int contador = 1; contador <= N;contador++){
                if (N % 2 == 0);
                quadrado = N * N;
                System.out.println(N+"^2 = "+quadrado);
            }
        }


    }
}