
public class SchoolTeacher extends Teacher{
	String[]arr=new String[5];

	public SchoolTeacher(String name, String fname, int years, String subject, String arr){
		super(name,fname,years,subject);
		this.arr=new String[5];
	}
	public void print(){
		System.out.println(this.name+" "+this.fname+" has 5 classes, and they are: ");
		for(int i=0;i<arr.length;i++){
			System.out.print( arr[i]+" ");
		}
	}
	public void kids(){
		System.out.println("I can entertain kids!");
	}
	public void homeWork(boolean home){
		super.homeWork(boolean home);
	}

}
