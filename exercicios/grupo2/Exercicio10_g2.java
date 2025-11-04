/*Pergunte três números.  
Diga qual é o maior entre eles.  
Atenção, utilize a estrutura IF.  */

package exercicios.grupo2;

import java.util.Scanner;

public class Exercicio10_g2 {
    public static void main (String[] args){
        // Scanner eh usado para entreda de informacao
        Scanner scanner = new Scanner(System.in);

        int num1, num2, num3;

        //Syste.out.print, imprimi informaçoes
        System.out.println("Informe 3 numero: ");
        System.out.println("Digite numero 1: ");
        num1 = scanner.nextInt();
        System.out.println("Digite numeto 2: ");
        num2 = scanner.nextInt();
        System.err.println("Digite ");
        num3 = scanner.nextInt();

        if (num1 > num2 && num1 > num3){
            System.out.println("Numero 1 é o maior");
        }
        else if (num2 > num1 && num2 > num3) {
            System.out.println("Numero 2 é o maior");
        }
        else{
            System.out.println("Numero 3 é o maior");
        }
        scanner.close();

    }


}
