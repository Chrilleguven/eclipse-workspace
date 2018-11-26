 package inl5;
import java.util.LinkedList;
public class Person {
 
	private String pNbr;
	private String name;
	private LinkedList<Account> ownAccount;
	private LinkedList<PersonRegister> aPerson;
	
	
	
	
	
	public Person() {
		this.setOwnAccount(new LinkedList<Account>());
		this.setAPerson(new LinkedList<PersonRegister>());
	}
	
	public String getName() {
		return name;

	}
	
	public void setName(String newName) {
		name = newName;
	}
	
	public String getPNbr() {
		return pNbr;
	}
	
	public void setPNbr(String newPNbr) {
		pNbr = newPNbr;
	}
	
	public LinkedList<Account> getOwnAccount(){
		return ownAccount;
	}
	
	public void setOwnAccount(LinkedList<Account> newOwnAccount) {
		ownAccount = newOwnAccount;
	}
	
	public void ownAccount(Account a) {
		this.getOwnAccount().add(a);
	}
	
	public LinkedList<PersonRegister> getaPerson(){
		return aPerson;
	}
	
	public void setAPerson(LinkedList<PersonRegister> newAPerson) {
		aPerson = newAPerson;
	}
	
	public void aPerson(Person p) {
		this.getaPerson().add(p);
	}
	
	
	
	
}
