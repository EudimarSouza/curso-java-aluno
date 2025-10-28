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

        // for, vai repetir até que qdtNum seja menor ou igual a 5, quando encerrar vai cacular media linha 24
        for(int qdtNum = 1; qdtNum <= 5 ; qdtNum ++){
            System.out.println("Numemro " + qdtNum); //imprime pergunta do numero, e usa o qdtNum para enumerar as vezes 
            double num = scanner.nextDouble(); //usuario digira o numero
            somaNum += num; //num é guardado e somado na varialvel somaNum
        }
        media = somaNum /5; //calcular media

        System.out.printf("A média é de %.2f", media);


        scanner.close();           
       

    }

}
