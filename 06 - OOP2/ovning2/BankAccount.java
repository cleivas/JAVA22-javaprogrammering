package ovningar;

class BankAccount {
	//Saldo är endast tillgänglig inom klassen BankAccount
	private int saldo;
	
	BankAccount(int saldo){
		this.saldo = saldo;
	}
	
	void deposit(int cash) {
		saldo = saldo+cash;
//		saldo+=cash
	}
	
	void withdraw(int cash) {
		saldo-=cash;
	}
	
	void checkBalance() {
		System.out.println("Your balance is: " + saldo);
	}
	
	//Vi lägger till en getter så att saldot kan ses utanför klassen
	int getSaldo() {
		return saldo;
	}

	//Vi lägger till en setter så att saldot kan uppdateras även från klassen SavingsAccount
	void setSaldo(int saldo) {
		this.saldo = saldo;
	}
}

