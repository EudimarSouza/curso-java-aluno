/******************************************************************************
Calcule a área de um retângulo. Area = comprimento * altura
*******************************************************************************/

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double area, comprimento, altura;
        System.out.println("Para calcular a área de um Retangulo, informe o comprimento e altura: ");
        System.out.print("comprimento: ");
        comprimento = scanner.nextDouble();
        System.out.print("altura: ");
        altura = scanner.nextDouble();
        area = comprimento * altura;

        System.out.printf("A área do Retangulo é %.2f%n", area);
        scanner.close();
    }
}
