/******************************************************************************
Perguntar o nome de um aluno, pergunte as 4 notas e calcule a média aritmética(média 
simples), exibindo no final. 
*******************************************************************************/

import java.util.Scanner;
import java.util.Locale;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe o nome do aluno: ");
        String aluno = scanner.nextLine();
        
        double nota1, nota2, nota3, nota4, media;
        
        System.out.print("Digite a primeira: ");
        nota1 = scanner.nextDouble();
        System.out.print("Digite a segundo: ");
        nota2 = scanner.nextDouble();
        System.out.print("Digite a terceira: ");
        nota3 = scanner.nextDouble();
        System.out.print("Digite a quarta: ");
        nota4 = scanner.nextDouble();
        media = (nota1+nota2+nota3+nota4)/4;

        System.out.printf("%s a sua média é: %.2f%n", aluno, media);
        scanner.close();
    }
}
