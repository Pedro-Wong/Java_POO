package com.br.aula43ExerciciosHeranca;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String pulaLinha = System.getProperty("line.separator");
		
		boolean condicao = true;
		boolean condicao2 = true;
		
		ContaBancaria contaBancaria = new ContaBancaria();
		
		while(condicao) {
			
			System.out.println(
					"Seja Bem vindo!" + pulaLinha +
					"---------------" + pulaLinha +
					"Qual operação deseja realizar?" + pulaLinha +
					"1 - Criar conta" + pulaLinha +
					"2 - Sacar" + pulaLinha +
					"3 - Depositar " + pulaLinha +
					"4 - Mostrar rendimentos" + pulaLinha +
					"5 - Dados da conta"	
			);
			
			int resposta = scan.nextInt();
			
			
			while(condicao2) {
				if(resposta < 0 || resposta > 5) {
					System.out.println("numero de opção inválido");
				}else {
					condicao2 = false;
				}
			}
			
			switch(resposta) {
				case 1:
				contaBancaria.criarConta();
				break;
				case 2:
				contaBancaria.sacar();
				break;
				case 3:
				contaBancaria.depositar();
				break;
			}
			System.out.println(" ");
			System.out.println(contaBancaria.getSaldo());
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		
			
			
			
			
			
			
			
			
			
			
			
			
		}

	}

}
