package ovn4;

public class ovn4_1 {

	public static void main(String[] args) {
		
		
		
	}
		class employee {
			private String name;
			private String pnr;
			private int salary;
			private int hours;
			
			
			public String getName() {
				return name;
			}
			
			public void setName(String newName) {
				name = newName;
			}
			
			public String getPnr() {
				return pnr;
			}
			
			public void setPnr(String newPnr) {
				pnr = newPnr;
			}
			
			public int getSalary() {
				return salary;
			}
			
			public void setSalary(int newSalary) {
				salary = newSalary;
			}
			
			public int getHours() {
				return hours;
			}
			
			public void setHours(int newHours) {
				hours = newHours;
			}
			
			public float monthpay() {
				return this.getHours() * this.getSalary();
			}
			
		}
	}

