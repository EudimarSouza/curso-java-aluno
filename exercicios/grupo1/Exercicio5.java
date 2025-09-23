/******************************************************************************
Calcule a área de um quadrado.  
Como calcular: Area = lado * lado 
*******************************************************************************/

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int lado, area;
        
        System.out.print("Para calcular  a area de um quadrado, informe o valor: ");
        lado = scanner.nextInt();
        area = lado * lado;

        System.out.printf("A área do quadro é %d%n", area);
        scanner.close();
    }
}
