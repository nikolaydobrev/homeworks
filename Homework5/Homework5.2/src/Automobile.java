
public class Automobile extends Car {
	double fuel;
	
	public Automobile(int price,double fuel){
		//super();
		super(price);
		this.fuel=fuel;
	}
	public void print1(){
		System.out.println("This car cost "+this.price+".");
		System.out.println("Consumation is:  "+this.fuel);
		System.out.println();
	}
}
