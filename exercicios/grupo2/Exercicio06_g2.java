/*-----------------------------------------------------------------------------------
/-------------------------------------------------------------------------------------
/   Pergunte a idade de uma pessoa. Diga se essa pessoa é uma criança (até 12 anos), um 
/   adolescente (13 a 17 anos), uma adulta (18 a 59 anos) ou idosa (60 anos ou mais) 
/-------------------------------------------------------------------------------------
/-------------------------------------------------------------------------------------*/

package exercicios.grupo2;

import java.util.Scanner;

public class Exercicio06_g2 {
    
    public static void main (String[] args){

        //variaveis
        int idade;
        String crc = "criança", adls = "adolescente", adlt = "adulto", ids = "idoso"; // String Segmentacao faixa etaria para classificacao

        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe sua idade: ");
        idade = scanner.nextInt();
        if(idade <= 12){
            System.out.println("Sua idade é " + idade + ", voce é " + crc);
        }
        else if(idade <= 17){
            System.out.println("Sua idade é " + idade + ", voce é " + adls);
        }
        else if(idade <= 59){
            System.out.println("Sua idade é " + idade + ", voce é " + adlt);
        }
        else{
            System.out.println("Sua idade é " + idade + ", voce é " + ids);
        }
        scanner.close();
    }

}
