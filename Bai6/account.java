package Bai6;


public class account {
	private long accountNumber ;
	private String name;
	private double balance;
	private double amount;
	private double fee;
	public static final double Rate = 0.035;
	public account() {
	}
	public account(long accountNumber, String name, double balance) {
		if (accountNumber !=(long)accountNumber && name == "" && balance < 50000) {
			this.accountNumber = 9999999;
			this.name = "";
			this.balance = 50000;
			this.amount = amount;
			this.fee = fee;
		}
		else {
			this.accountNumber = accountNumber;
			this.name = name;
			this.balance = balance;
			this.amount = amount;
			this.fee = fee;
		}
	}
	public account(long accountNumber, String name) {
		this.accountNumber = accountNumber;
		this.name = name;
	}
	public boolean deposit() {
		if (amount > 0) {
			balance = amount + balance;
			return true;
		}
		else {
			return false;
		}	
	}
	public boolean fee() {
		if (amount > 0 &&  amount + fee <= balance) {
			balance = balance - fee;
			return true;
		}
		else {
			return false;
		}
	}
	public double addInterest() {
		return balance = balance + balance * Rate;
	}
	 public static boolean transferMoney(account fromAccount, account toAccount, double amount) {
	        if (amount <= 0) {
	            System.out.println("Invalid amount. Transfer cannot be completed.");
	            return false;
	        }
	        if (fromAccount.getBalance() < amount) {
	            System.out.println("Insufficient balance. Transfer cannot be completed.");
	            return false;
	        }
	        fromAccount.setBalance(fromAccount.getBalance() - amount);
	        toAccount.setBalance(toAccount.getBalance() + amount);

	        System.out.println("Transfer successful. $" + amount + " has been transferred from Account "
	                + fromAccount.getAccountNumber() + " to Account " + toAccount.getAccountNumber());
	        return true;
	    }
	 public String toString() {
			return "[STK :" + accountNumber +"\n"+ "Họ Tên " + name + "\n" + "Số Dư :" + balance ;
		}


	public long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}



}
