/*Pergunte um número. Diga se este numero faz parte da tabuada do 3, escrevendo na tela. */

package exercicios.grupo2;

import java.util.Scanner;

public class Exercicio03_g2 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Descubra se o numero faz parte da tabuado do 3:");
        System.out.print("Informe o númro: ");
        
        int numero;

        numero = scanner.nextInt();

        if(numero % 3 == 0){
            System.out.printf("o numero %d pertence a tabuda do 3", numero);
        }
        else{
            System.out.printf("Nao pertence");
        }
        scanner.close(); 
    }
}
