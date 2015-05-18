
public class CollegeTeacher extends Teacher{
	String college;
	public CollegeTeacher(String name, String fname, int years, String subject,String college){
		super(name, fname,years,subject);
		this.college=college;
	}
	public void present(){
		System.out.println("I am "+name+" "+fname+"! I work in "+college+"college!");
	}
	public void homeWork(boolean home){
		super.homeWork(boolean home);
	}

}
