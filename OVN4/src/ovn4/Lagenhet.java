package ovn4;
import java.util.Scanner;
public class Lagenhet {

	public static void main(String[] args) {
		
		apartment t = new apartment();
		
		t.setIdnumber(2256);
		t.setArea(10);
		t.setRent(2000);
		
		System.out.println(t.getIdnumber() + "\n" + t.prisPerKvmPerAr() + "\n" + t.prisPerKvm() + "\n" + t.prisPerÅr());

	}

}
