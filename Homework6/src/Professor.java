
public class Professor extends Lecture{
	String title;
	public Professor(){

	}

	public Professor(String name, String fname, int years, String university, String title){
		super(name,fname,years,university);
		this.title=title;
	}
	public void present(){
		System.out.println("My name is "+this.name+" "+ this.fname+ "! I have "+this.years+" working experience and I am "+ this.title);
	}
	public void homework(){
		System.out.println("Homework");
	}
	public void exams(){
		System.out.println("I can make exams.");
	}

}
