package aulaSemana2;

import bankapp.model.Conta;
import bankapp.service.ContaService;

public class BankApplication {

	public static void main(String[] args){
		Conta conta = new Conta ();//criei o objeto
		
		ContaService terminal = new ContaService();
		
		terminal.depositar(conta, 50.0); //setando contaService
		
		//conta.setSaldo(10.0);//setando conta saldo
	
		System.out.println(conta.getSaldo()); //get
			
	}
}
