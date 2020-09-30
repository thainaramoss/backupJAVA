import java.util.Scanner;
public class Uri1018{
    public static void main (String arg[]){
        Scanner teclado = new Scanner (System.in);

        // simular um caixa eletronico, usar para a divisão da cedula maior até a menor

        // variaveis
        int valor;
        int nota100, nota50, nota20, nota10, nota5, nota2, nota1;
        int resto;

        // entrada
        valor = teclado.nextInt();

        // processamento
        nota100 = valor / 100;      // qtde. de notas
        resto = valor % 100;    // qtde. que sobra

        nota50 = resto / 50;
        resto = resto % 50;

        nota20 = resto / 20;
        resto = resto % 20;

        nota10 = resto / 10;
        resto = resto % 10;

        nota5 = resto / 5;
        resto = resto % 5;

        nota2 = resto / 2;

        nota1 = resto % 2;

        // saida
        System.out.println(valor);
        System.out.println(nota100 +" nota (s) de R$ 100,00");
        System.out.println(nota50 +" nota (s) de R$ 50,00");
        System.out.println(nota20 +" nota (s) de R$ 20,00");
        System.out.println(nota10 +" nota (s) de R$ 10,00");
        System.out.println(nota5 +" nota (s) de R$ 5,00");
        System.out.println(nota2 +" nota (s) de R$ 2,00");
        System.out.println(nota1 +" nota (s) de R$ 1,00");
    }
}