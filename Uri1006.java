import java.util.Scanner;
public class Uri1006{
    public static void main (String arg []){
    Scanner teclado = new Scanner (System.in);

// variaveis
double A, B, C, MEDIA;

// entrada
A = teclado.nextDouble();
B = teclado.nextDouble();
C = teclado.nextDouble();

// processamento

MEDIA = (A*2+B*3+C*5) / 10;

// saida
System.out.printf("MEDIA = %.1f\n",MEDIA);
}
}