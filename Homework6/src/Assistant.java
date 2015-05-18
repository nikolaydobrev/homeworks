
public class Assistant extends Lecture{
	boolean isithead;
	public Assistant(String name, String fname,int years, String university, boolean isithead){
		super(name,fname,years,university);
		this.isithead=isithead;
		
	}
	public void present(){
		if(isithead==true){
			System.out.println("My name is "+name+" "+fname+". I am head assistant!" );			
		}
		else{
			System.out.println("My name is "+name+" "+fname+". I am assistant!");
		}
	}
	public void homework(){
		System.out.println("Home");
	}
	public void write(){
		System.out.println("I can write articles.");
	}
	public void exams(){
		System.out.println("I can check exams.");
	}
}
