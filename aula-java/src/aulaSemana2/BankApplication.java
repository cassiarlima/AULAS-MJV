package aulaSemana2;

import bankapp.model.Conta;
import bankapp.service.ContaService;

import java.util.Scanner;

public class BankApplication {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		int escolha, deposito, saque, transferencia;
		Conta conta = new Conta();
		Conta contaDestino = new Conta();
		ContaService conta1 = new ContaService();

		System.out.println("O que deseja fazer?\n 1 - Deposito \n 2 - Saque \n 3 - Transferência");

		escolha = ler.nextInt();
		if (escolha == 1) {
			System.out.println("Qual valor deseja depositar? \n");
			deposito = ler.nextInt();
			if (deposito > 0) {
				conta1.depositar(conta, deposito);
				System.out.println("O valor atual do saldo é: " + conta.getSaldo());
			} else {
				System.out.println("Valor inválido! ");
			}

		}
		if (escolha == 2) {
			System.out.println("Qual valor deseja sacar? \n");
			saque = ler.nextInt();
			if (saque <= conta.getSaldo()) {
				conta1.sacar(conta, saque);
				System.out.println("O valor atual do saldo é: " + conta.getSaldo());
			} else {
				System.out.println("Valor inválido! ");
			}
		}
		if (escolha == 3) {
			System.out.println("Qual valor deseja transferir? \n");
			transferencia = ler.nextInt();
			if (transferencia <= conta.getSaldo()) {
				conta1.transferir(conta, transferencia, contaDestino);
			} else {
				System.out.println("Valor inválido! ");
			}
		} else {
			System.out.println("Operação cancelada pelo usuário! ");
		}
	}
}
