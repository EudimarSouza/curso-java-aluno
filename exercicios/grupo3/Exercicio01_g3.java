/*Calcule o fatorial de um número.  
Pergunte o número, faça o loop e exiba o resultado no final. Exemplo: Fatorial de 5 => 5 * 4 * 
3 * 2 * 1 = 120  */

package exercicios.grupo3;

import java.util.Scanner;

public class Exercicio01_g3 {
    public static void main (String[] args){
        // Variaveis
        int fatorial = 1;
        int numero = 0;
        

        //Imprime na tela 
        System.out.println("Informe o numero para calculo do fatorial:" );
        // Scanner Classe que realiza leitura de entrada de dados
        Scanner scanner = new Scanner(System.in);
        numero = scanner.nextInt();       

        for(int contador = numero; contador >=1; contador--){
            fatorial = fatorial *contador;
            

        }
        System.out.println(fatorial);

        scanner.close();

    }

}
