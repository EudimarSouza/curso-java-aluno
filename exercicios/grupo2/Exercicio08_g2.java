/*Pergunte a nota de um aluno (de 0 a 10).  
Diga se o aluno está reprovado (nota < 5), em recuperação (nota entre 5 e 6.9) ou aprovado 
(nota ≥ 7)  */

package exercicios.grupo2;

import java.util.Scanner;

public class Exercicio08_g2 {
    
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        double nota1, nota2, nota3, nota4, media;
       
        System.out.println("Calcule a media do Aluno");
        System.out.print("Nota1: ");
        nota1 = scanner.nextDouble();
        System.out.print("Nota2: ");
        nota2 = scanner.nextDouble();
        System.out.print("Nota3: ");
        nota3 = scanner.nextDouble();
        System.out.print("Nota4: ");
        nota4 = scanner.nextDouble();
        media = (nota1 + nota2 + nota3 + nota4)/4;

        if(media < 5){
            System.out.printf("A media é %.2f  - aluno Reprovado ", media);
        }
        else if(media < 6.9){
            System.out.printf("A media é %.2f - aluno em Recuperacao ", media);
        }
        else{
            System.out.printf("A media é %.2f  - aluno Aprovado ", media);
        }

        System.out.printf("media: %.2f%n", media);
        
        scanner.close();
    }
}