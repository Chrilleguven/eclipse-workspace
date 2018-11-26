package ovn4;
import java.util.Scanner;
public class ovn4 {

	public static void main(String[] args) {
		employee t = new employee();
		t.setName("Chrille");
		t.setPnr("970110");
		t.setHours(40);
		t.setSalary(100);
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println(t.getName() + "\n" + t.getPnr() + "\n" + t.monthpay());
		

	}

}
