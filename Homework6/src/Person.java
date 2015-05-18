
abstract class Person {
	protected String name;
	protected String fname;
	protected int years;
	static int count;
	Person(){

	}

	Person(String name, String fname, int years){
		this.name=name;
		this.fname=fname;
		setYears(years);
		count++;
	}

	public int getYears(){
		return years;
	}
	public void setYears(int years){
		if(this.years > 0){
			this.years = years;
		}
	}

	public void homeWork(boolean home){

	}

}
