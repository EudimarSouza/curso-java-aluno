/*Pergunte um número. Diga se esse número é positivo, negativo ou zero. */

package exercicios.grupo2;

import java.util.Scanner;

public class Exercicio5_g2 {

    int numero;
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe um numero: ");
        int numero = scanner.nextInt();
        if(numero < 0){
            System.out.print(" O numero " + numero + " é Negativo");
        }
        else if(numero >  0){
            System.out.print(" O numero " + numero + " é positivo");
        }
        else{
            System.out.println("O numero informado é 0(Zero)");
        }
        
        scanner.close();
    }

}
