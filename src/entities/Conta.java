package entities;

import java.lang.IllegalArgumentException;
public class Conta {
	
	private int numeroConta;
	private String proprietario;
	private double saldo;
	private double limiteSaque;
	public Conta(int numeroConta, String proprietario, double saldo, double limiteSaque) {
		if(numeroConta <=0) throw new IllegalArgumentException("Numero da conta desse ser maior que zero.");
		if(saldo <0) throw new IllegalArgumentException("O valor do deposito deve ser maior que zero.");
		if(limiteSaque <=0) throw new IllegalArgumentException("O Limite de saque deve ser maior que zero.");
		
		this.numeroConta = numeroConta;
		this.proprietario = proprietario;
		this.saldo = saldo;
		this.limiteSaque = limiteSaque;
	
	}
	
	
	public void deposito(double valor) {
		if(valor <=0) throw new IllegalArgumentException("O valor do deposito deve ser maior que zero.");
		this.saldo += valor;
	};
	
	public void saque(double valor) {
		if(saldo <= 0) throw new IllegalArgumentException("Saldo insuficiente");
		if(valor > saldo) throw new IllegalArgumentException("Saldo induficiente");
		if(valor > limiteSaque) throw new IllegalArgumentException("Saque excede o limite permitido");
		this.saldo -= valor;
		System.out.println("Saldo Atualizado: " + saldo);
	};
	
}
