
public class Cat {
	int years;
	String name;
	
	public Cat(int years, String name){
		this.years=years;
		this.name=name;
	}
	 public void Say(){
		 System.out.println("I am cat and my name is "+this.name+"!");
		 System.out.println("I am "+this.years+" years old!");
	 }
}
