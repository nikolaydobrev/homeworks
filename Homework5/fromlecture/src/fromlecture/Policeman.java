package fromlecture;

public class Policeman extends Employee{
	String rang;
	public Policeman(int hours, int profit, String rang){
		super(hours,profit);
		this.rang=rang;
	}
	public void print1(){
		System.out.println(this.hours);
		System.out.println(this.profit);
		System.out.println(this.rang);
	}
}
