package treinos;

import java.util.Scanner;

public class ProjetoBanco {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int opcao;
        String nomeCompleto, cpf;

        while (true) {
            
            System.out.print("##-----Banco Gringotes-----##\n\n");
            System.out.print("|-----------------------------|\n");
            System.out.print("| Opção 1 - Cadastro Cliente  |\n");
            System.out.print("| Opção 2 - Login             |\n");
            System.out.print("| Opção 3 - Sair              |\n");
            System.out.print("|-----------------------------|\n");
            System.out.print("Digite uma opção: ");
    
            opcao = scanner.nextInt();
            scanner.nextLine();

            if(opcao == 3){
                System.out.println("Tchau");
                break;
            }

            switch (opcao) {
                case 1: //Opcao 1 cadastra o cliente
                    System.out.print("Nome Completo: "); 
                    nomeCompleto = scanner.nextLine();
                    System.out.print("CPF: ");
                    cpf = scanner.nextLine();
                    System.out.printf("Cliente Cadastrado \nNome: %s | CPF: %s \n\n", nomeCompleto, cpf);
                break;

                case 2:
                    System.out.println("Login Cliente");
                    System.out.println("Informe CPF: ");
                    cpf = scanner.nextLine();
                break;
            
                default:
                    System.out.println("Ivalida");
                break;
            }            

        }

        scanner.close();        
    }
    
}