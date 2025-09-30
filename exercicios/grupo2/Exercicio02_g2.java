/*--------------------------------------------------------------------------
Pergunte um número. Diga se este numero é primo ou não, escrevendo na tela. 
-------------------------------------------------------------------------- */


package exercicios.grupo2;

import java.util.Scanner;

public class Exercicio2_g2{

        public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um número e saiba se ele é primo: " );
        int numero = scanner.nextInt();
        boolean isPrimo = false;

        if (numero < 4){
            isPrimo = (numero < 4);
        }
        else{
            isPrimo = (numero % 2 !=0) && (numero % 3 !=0);
        }
        if (isPrimo){
            System.out.printf("O numero %d é primo!", numero);
        }
        else{            
            System.out.printf("O numero %d não é primo!", numero);
        }   
        scanner.close();     
    }
}
