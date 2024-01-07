package task10;

public class Account {
	
	double balance;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Initial Balance: Rs.2000");
		
		Account obj = new Account(2000);
		
		System.out.println("Deposit amount: 1000");
		
		obj.deposit(1000);
		
		System.out.println("The balance after depositing: Rs."+obj.getBalance());
		
		System.out.println("Withdraw the amount Rs.700 from this account");
		
		obj.withdraw(700);
		
		System.out.println("The balance after withdrawing: Rs."+obj.getBalance());
		
		
	}

public Account(double balance) {
		
		this.balance=balance;
	}
	
	public void deposit(double amount) {
		balance += amount;
	}
	
	public void withdraw(double amount) {
		if(balance >= amount) {
			balance -= amount;
		}
		else
			System.out.println("Insufficient balance");
	}
	
	public double getBalance() {
		return balance;
	}
}
