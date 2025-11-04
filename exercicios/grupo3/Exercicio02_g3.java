/*Faça um programa que some de 0 a 100 somente os números primos, e exiba o resultado. 
Número primo é aquele que é divisível somente por ele mesmo e pelo número 1. */


package exercicios.grupo3;

import java.util.Scanner;

public class Exercicio02_g3 {
    public static void main(String[] args){

        // int numero, soma = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o numero: ");   

        for (int i = 1; i < 100; i++) {
            System.out.println("Contagem: " + i);
        }
        scanner.close();
    }
}



