/******************************************************************************
Calcule o quadrado de um número.  
Pergunte o número, calcule e exiba no final o resultado. 
*******************************************************************************/

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int quadrado, resultado;
        System.out.print("Para calcular o quadrado, informe o valor: ");
        quadrado = scanner.nextInt();
        resultado = quadrado * quadrado;

        System.out.printf("O valor do quadro: %d%n", resultado);
        scanner.close();
    }
}
