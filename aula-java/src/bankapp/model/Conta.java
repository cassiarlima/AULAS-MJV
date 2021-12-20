package bankapp.model;

public class Conta {
	
	//conceitos de POO, modificadores de acesso e padrão Java Beans.
	//padrão Java Beans diz que todos os atributos devem ser privados, assim eu crio os getters and setters

		private double saldo;
		
		//todo metodo é composto por tipo de retorno, nome declarativo e parametros
		public void setSaldo(double saldo) {
			this.saldo = saldo; //aponta para o set
		}
		
		public double getSaldo() {
			return saldo;
		}
		
	}



