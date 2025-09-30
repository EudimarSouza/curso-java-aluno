/* Pergunte o número do mês (1 a 12).  
Diga quantos dias ele tem (ano não bissexto).  
Atenção, utilize a estrutura CASE.  */

package exercicios.grupo2;

import java.util.Scanner;

// import java.util.Scanner;;

public class Exercicio09_g2 {
    public static void main (String[] args){

        int numeberMonth;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe um numero de 1 a 12 para saber o mês e quando dias ele possui:");
        numeberMonth = scanner.nextInt();

        switch (numeberMonth) {
            case 1:
                System.err.printf("o numero %d é Janeiro ", numeberMonth);
                break;
            case 2:
                System.err.printf("o numero %d é Fevereiro ", numeberMonth);
                break;            
            case 3:
                System.err.printf("o numero %d é Março ", numeberMonth);
                break;
            case 4:
                System.err.printf("o numero %d é Abril ", numeberMonth);
                break;
            case 5:
                System.err.printf("o numero %d é Maio", numeberMonth);
                break;
            case 6:
                System.err.printf("o numero %d é Junho", numeberMonth);
                break;
            case 7:
                System.err.printf("o numero %d é Julho", numeberMonth);
                break;
            case 8:
                System.err.printf("o numero %d é Agosto", numeberMonth);
                break;
            case 9:
                System.err.printf("o numero %d é Setembro", numeberMonth);
                break;
            case 10:
                System.err.printf("o numero %d é Outubro", numeberMonth);
                break;
            case 11:
                System.err.printf("o numero %d é Novembro", numeberMonth);
                break;
            case 12:
                System.err.printf("o numero %d é Dezembro", numeberMonth);
                break;           
            default:
            System.err.printf("o numero %d é invalido", numeberMonth);    

        }
        
        scanner.close();
    }

}
