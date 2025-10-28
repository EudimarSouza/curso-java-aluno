/*Pergunte 5 números e calcule a média.  
Atenção, utilize um loop FOR. */


package exercicios.grupo3;

import java.util.Scanner;

public class Exercicio14_g3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in); //Scanner é uma classe para ler dados                       
        System.out.println("Informe 5 numeros para calcular media: "); //imprime enuciado 
        
        // variaveis  
        double somaNum = 0;
        double media = 0; 

        for(int qdtNum = 1; qdtNum <= 5 ; qdtNum ++){
            System.out.println("Numemro " + qdtNum); //imprime pergunta do numero 
            double num = scanner.nextDouble();
            somaNum += num;
        }
        media = somaNum /5;

        System.out.printf("A média é de %.2f", media);


        scanner.close();           
       

    }

}
