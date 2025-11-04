
/*Faça um programa que exiba de 0 a 100, somente os números ímpares e não divísiveis por 5, 
e exiba o resultado.*/

package exercicios.grupo3;
// import java.util.Scanner;;

public class Exercicio03_g3 {
    public static void main(String[] args) {
        int quantidadeItenSoma = 100;
        
        for(int contador = 0;  contador <= quantidadeItenSoma; contador ++ ){
            boolean numImpar = false;
            boolean numDivivelPorCinco = false;
            if(contador % 2 != 0){
                numImpar = true;
            }
            if(contador % 5 !=0){
                numDivivelPorCinco = true;
            }              
            
            if (numImpar && numDivivelPorCinco) {
            System.out.println("Este numero " + contador + " é impar e nao divisivel por 5");
            
            }        
        
        }
    
    }
}
