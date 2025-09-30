/*Pergunte um número de 1 a 7.  
Diga a qual dia da semana esse número é correspondente (1 = Domingo, 2 = Segunda, ..., 7 = 
Sábado).  
Atenção, utilize a estrutura CASE. */

package exercicios.grupo2;
import java.util.Scanner;

public class Exercicio07_g2 {
    public static void main (String[] args){

        int numeberDay;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe um numero de 1 a 7 para saber o dia da semana correspondente:");
        numeberDay = scanner.nextInt();

        switch (numeberDay) {
            case 1:
                System.err.printf("o numero %d é Domingo", numeberDay);
                break;
            case 2:
                System.err.printf("o numero %d é Segunda", numeberDay);
                break;            
            case 3:
                System.err.printf("o numero %d é Terça", numeberDay);
                break;
            case 4:
                System.err.printf("o numero %d é Quarta", numeberDay);
                break;
            case 5:
                System.err.printf("o numero %d é Quinta", numeberDay);
                break;
            case 6:
                System.err.printf("o numero %d é Sexta", numeberDay);
                break;
            case 7:
                System.err.printf("o numero %d é Sábado", numeberDay);
                break;

        }
        
        scanner.close();
    }

}
