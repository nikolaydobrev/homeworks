package fromlecture;

public class Doctor extends Employee{
	int nightshifts;
	int shifts;
	public Doctor(int hours, int profit, int nightshifts,int shifts){
		super(hours, profit);
		this.nightshifts=nightshifts;
		this.shifts=shifts;
	}
	public void print(){
		System.out.println(this.hours);
		System.out.println(this.profit);
		System.out.println(this.nightshifts);
		System.out.println(this.shifts);
		
	}

}
