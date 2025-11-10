/*
Pergunte um número.  
Some todos os números de 1 até esse número.  
Atenção, utilize um loop WHILE. 
 */

package exercicios.grupo3;

import java.util.Scanner;

public class Exercicio12_g3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in); //Scanner é uma classe para ler dados 
        System.out.println("Informe um número: "); // Irá imprimir mensagem

        int num = scanner.nextInt(); //
        int contador = 1;
        int soma = 0;

        while (contador <= num  ) {            
            soma = soma + contador; 
            contador = contador +1;                    
        }
        System.out.printf("a soma é %d", soma);

        // System.out.printf("O numero digitado é %d", num);

        scanner.close();
    }    

}
