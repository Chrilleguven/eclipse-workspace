package inl5;

public class Account {

	private String nbr;
	private double balance;
	private Person owner;
	
	public String getNbr() {
		return nbr;
	}
	
	public void setNbr(String newNbr) {
		nbr = newNbr;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void setBalance(double newBalance) {
		balance = newBalance;
	}
	
	public void credit(double amount) {
		balance = balance + amount;
	}
	
	public void withdraw(double amount) {
		balance = balance - amount;
	}
	
	public Person getOwner() {
		return owner;
	}
	
	public void setOwner(Person newOwner) {
		owner = newOwner;
	}
	
}
