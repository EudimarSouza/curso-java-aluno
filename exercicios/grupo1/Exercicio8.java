/******************************************************************************
Você está montando um cadastro para uma empresa de vendas na internet, e precisa fornecer 
este "formulário de dados de clientes".  
Não se preocupe neste momento se irá ou não guardar  
este dado em algum lugar.  
Pergunte e obtenha os seguintes dados e depois exiba todos na tela: 
 - Nome Completo
 - Data de Nascimento
 - Cidade/País de Origem(Nascimento)
 - Endereço completo de onde mora 
 - País onde reside 
 - Data do Cadastro
 - Escolaridade: (Ensino Básico/Ensino Fundamental/Ensino Superior)
*******************************************************************************/

import java.util.Scanner;
import java.time.LocalDate;

public class Exercicio8
{
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    
	    // Variaveis
	    String nomeCompleto, dataNasc, cidade, paisOrigem, paisResidencia, escolaridade;
	    LocalDate dataCadastro = LocalDate.now();    
	    	    
	    // Inicio do Formulario
		System.out.println("----------------------");	    
		System.out.println("Formulário de Cadastro");
		System.out.println("----------------------");
		
		System.out.print("Nome Completo: ");
        nomeCompleto = scanner.nextLine();        
        System.out.print("Data de Nascimento: : ");
        dataNasc = scanner.nextLine();        
        System.out.print("Cidade: ");
        cidade = scanner.nextLine();        
        System.out.print("Pais de Nascimento: ");
        paisOrigem = scanner.nextLine();        
        System.out.print("País de Residencia: ");
        paisResidencia = scanner.nextLine();        
        System.out.print("Escolaridade: (Ensino Básico/Ensino Fundamental/Ensino Superior): ");
        escolaridade = scanner.nextLine();
        
	    // Imprimir do Formulario
		System.out.println("|-----------------------|");	    
		System.out.println("|----Cadastro Efetivo---|");
		System.out.println("|-----------------------|");
        System.out.println("Nome Completo: " + nomeCompleto);
        System.out.println("Data de Nascimento: " + dataNasc);
        System.out.println("Cidade(Nascimento): " + cidade);
        System.out.println("País de Origem(Nascimento): " + paisOrigem);
        System.out.println("Endereço atual: " + nomeCompleto);
        System.out.println("País onde reside : " + paisResidencia);
        System.out.println("Escolaridade: " + escolaridade);
        System.out.println("Data do Cadastro: " + dataCadastro);
		scanner.close();
	}
}
