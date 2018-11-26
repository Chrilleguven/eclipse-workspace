package inl5;

public class test {

	public static void main(String[] args) {
	Person p1 = new Person();
	Account a1 = new Account();
	Account a2 = new Account();
	
	p1.setName("chrille");
	a1.setNbr("1111");
	a2.setNbr("2222");
	
	p1.ownAccount(a1);
	a1.setOwner(p1);
	p1.ownAccount(a2);
	a2.setOwner(p1);
	
	
	
	
	System.out.println(p1.getName() + "Äger följande konton:");
	for (Account t : p1.getOwnAccount()) {
		System.out.println(t.getNbr() + ":" + t.getOwner().getName());
		
	}
    System.out.println(p1.getName());
    for (PersonRegister b : p1.getaPerson()) {
    	System.out.println(b.Pnbr);
	}

}
}