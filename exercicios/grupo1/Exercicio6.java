/******************************************************************************
Calcule a área de um círculo com base no raio informado.  
Como calcular: A = PI . R ao quadrado 
*******************************************************************************/

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double a, r;
        final double pi = 3.141592654;
        System.out.print("Para calcular a área de um circulo, informe o Raio: ");
        r = scanner.nextDouble();
        a = pi * r * r;

        System.out.printf("A área do Circulo é %.2f%n", a);
        scanner.close();
    }
}
