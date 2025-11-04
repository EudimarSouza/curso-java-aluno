/* Tabuada de um Número: Peça ao usuário para digitar um número inteiro e, 
em seguida, imprima a tabuada desse número (de 1 a 10).*/

package exercicios.grupo3;
// import java.util.Scanner;;

import java.util.Scanner;

public class Exercicio03_g4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //aqui inicia a interacao com o usuario, fazendo a pergunta abaixo
        System.out.println("Qual numero quer calcular a tabuada: ");
        
        //captura informacao do teclao e guarda na variavel
        int numTabuada = scanner.nextInt();          

        for(int i = 1; i <= 10; i++){
            int elemento = numTabuada * i;
            System.out.print(elemento + " ");

        } 
        scanner.close();
        
    }
    
}
