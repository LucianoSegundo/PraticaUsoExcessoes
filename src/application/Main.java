package application;

import java.util.Scanner;

import entities.Conta;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);

		try {
			System.out.print("Numero da Conta: ");
			int numero = entrada.nextInt();
			entrada.nextLine();
			System.out.print("Proprietário: ");
			String nome = entrada.nextLine();
			System.out.print("Deposito inicial: ");
			double valor = entrada.nextDouble();
			entrada.nextLine();
			System.out.print("Limite de Saque: ");
			double limite = entrada.nextDouble();
			entrada.nextLine();
			
			Conta novaConta = new Conta(numero, nome, valor, limite);
			
			System.out.print("Valor do deposito: ");
			valor = entrada.nextDouble();
			entrada.nextLine();
			
			novaConta.deposito(valor);
			
			System.out.print("Valor do saque: ");
			valor = entrada.nextDouble();
			entrada.nextLine();
			
			novaConta.saque(valor);
		} catch (IllegalArgumentException e) {
			System.out.print("Erro: " + e.getMessage());
		} finally {
			entrada.close();
		}
	}

}
