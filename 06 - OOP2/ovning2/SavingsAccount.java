package ovningar;

class SavingsAccount extends BankAccount{
	private double interest;
	
	SavingsAccount(int saldo, double interest){
		super(saldo);
		this.interest = interest;
	}
	
	
	void depositInterest(double deposit) {
		int newSaldo = (int) (getSaldo() + deposit + (deposit*interest));	
		
		//Saldo som tillhör klassen BankAccount uppdateras med hjälp av settern
		setSaldo(newSaldo);
	}
}
