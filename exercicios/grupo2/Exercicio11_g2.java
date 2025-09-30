// - Pergunte uma letra (V, A, B).  
// Diga a cor correspondente (Vermelho, Azul, Branco).  
// Atenção, utilize a estrutura CASE. 

package exercicios.grupo2;

import java.util.Scanner;

public class Exercicio11_g2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        
        String letter;

        System.out.println("Digite as Letras V, A ou B para saber a cor relacianada: ");
        letter = scanner.next();

        switch (letter) {
            case "v":
                System.err.printf("V letra %s é correspondente a cor Verde ", letter);
                break;
            case "a":
                System.err.printf("A letra %s é correspondente a cor Azul ", letter);
                break;
            case "b":
                System.err.printf("B letra %s é correspondente a cor Branco ", letter);
                break;
            default:
            System.err.printf("o numero %f é invalido", letter);      

        scanner.close();
        }

    }
}
