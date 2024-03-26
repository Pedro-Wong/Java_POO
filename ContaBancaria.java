package com.br.aula43ExerciciosHeranca;
import java.util.Scanner;

public class ContaBancaria {
	Scanner scan = new Scanner(System.in);
	
	
	private String nomeCliente;
	private int numConta;
	private int saldo;
	
	
	ContaBancaria(){
		this.saldo = 1000;
	}
	
	
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	
	public String getNomeCliente() {
		return this.nomeCliente;
	}
	
	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}
	
	public int getNumConta() {
		return this.numConta;
	}
	
	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}
	
	public int getSaldo() {
		return this.saldo;
	}
	
	
	
	void criarConta () {
		System.out.println("Criar nova conta ");
		System.out.println("-----------------");
		System.out.println("Digite seu nome:");
		this.nomeCliente = scan.nextLine();
	}
	
	
	void sacar() {
		if(saldo <= 0) {
			System.out.println("Não é possível sacar, saldo negativo");
		}else {
			System.out.println("Quantia do saque:");
			int saque = scan.nextInt();
			if(saque > this.saldo) {
				System.out.println("Valor do saque maior que o saldo da conta");
			}else {
				System.out.println("Saque de " + saque);
				this.saldo -= saque;
			}
			
			
		}
	}
	
	void depositar() {
		System.out.println("Quantia do deposito:");
		int deposito = scan.nextInt();
		if(deposito < 0) {
			System.out.println("Valor de deposito negativo");
		}else {
			this.saldo += deposito;
			System.out.println("Deposito de " + deposito + " confirmado");
		}
	}
	
}
