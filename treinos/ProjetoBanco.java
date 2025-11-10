package treinos;

import java.util.Scanner;

public class ProjetoBanco {
    public static void main(String[] args){
        Scanner menu = new Scanner(System.in);
        int opcao;    
        while (true) {

            System.out.print("##-----Banco Gringotes-----##\n\n");
            System.out.print("|-----------------------------|\n");
            System.out.print("| Opção 1 - Cadastro Cliente  |\n");
            System.out.print("| Opção 2 - Login             |\n");
            System.out.print("| Opção 3 - Sair              |\n");
            System.out.print("|-----------------------------|\n");
            System.out.print("Digite uma opção: ");  
        
            opcao = menu.nextInt();
            if(opcao == 3) {
                System.out.println("Processo encerrado");
                menu.close();
            }

            switch (opcao) {
                case 1:
                    System.out.println("Cadastrar");                    
                    break;
                case 2:
                    System.out.println("Login Cliente");                    
                    break;
            
                default:
                    System.out.println("Ivalida");
                    break;
            }
           
        }
    
        
    }

}
