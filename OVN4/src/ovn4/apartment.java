package ovn4;

public class apartment {
	
	private int idnumber;
	private int rent;
	private int area;
	
	public int getIdnumber() {
		return idnumber;
	}
	
	public void setIdnumber(int newIdnumber) {
		idnumber = newIdnumber;
	}
	
	public int getRent() {
		return rent;
	}
	
	public void setRent(int newRent) {
		rent = newRent;
	}

	public int getArea() {
		return area;
	}
	
	public void setArea(int newArea) {
		area = newArea;
	}
	
	public float prisPerKvmPerAr() {
		return (this.getRent() * 12) / this.getArea();
	}
	
	public float prisPerKvm() {
		return this.getRent() / this.getArea();
	}
	
	public float prisPerÅr( ) {
		return this.getRent() * 12;
	}
	
}
