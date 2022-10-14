package ovningar;

public class Main {

	public static void main(String[] args) {
		BankAccount bc = new BankAccount(2000000);
		bc.checkBalance();
		bc.withdraw(1000000);
		bc.checkBalance();
		bc.setSaldo(10);
		
		BankAccount bc2 = new BankAccount(20);
		bc2.checkBalance();
		bc2.deposit(1000000);
		bc2.checkBalance();
		bc2.setSaldo(400);
		
		System.out.println();
		System.out.println("_____SAVINGS_____");
		SavingsAccount sa = new SavingsAccount(0, 0.1);
		sa.checkBalance();
		sa.depositInterest(100);
		sa.checkBalance();
	}

}
