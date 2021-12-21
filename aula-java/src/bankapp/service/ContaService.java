package bankapp.service;

import bankapp.model.Conta;

public class ContaService {
	private double saldo;

	public void depositar(Conta conta, double valorDepositado) {
		double valorSaldo = conta.getSaldo();
		conta.setSaldo(valorDepositado + valorSaldo);
	}

	public boolean sacar(Conta conta, double sacar) {
		if (conta.getSaldo() >= sacar) {
			conta.setSaldo(conta.getSaldo() - sacar); // saldo - valor sacado(caso tiver dinheiro na conta, retorna um true)
			return true;
		} else {
			return false;
		}

	}

	public boolean transferir(Conta conta, double valorTransferido, Conta destino) {
		if (conta.getSaldo() >= valorTransferido) {
			conta.setSaldo(conta.getSaldo() - valorTransferido);
			destino.setDepositar(valorTransferido);
			return true;
		} else {
			return false;
		}
	}
}
