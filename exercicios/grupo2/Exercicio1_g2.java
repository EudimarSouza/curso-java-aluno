/*
--------------------------------------------------------------------------
Pergunte um número. Diga se este numero é par ou ímpar, escrevendo na tela.
-------------------------------------------------------------------------- 

*/
package exercicios.grupo2;
import java.util.Scanner;

public class Exercicio1_g2 {    
    
    //Variaveis

    int numero;
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Imforme número para saber se ele é par ou ímpar: ");
        System.out.print("Número: ");
        int numero = scanner.nextInt();

        if (numero % 2 == 0){
            System.out.println("o numero " + numero + " é par" );
        }else{
            System.out.println("o numero " + numero + " é ímpar");
        }

        scanner.close();
    }
}
