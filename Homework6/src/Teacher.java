
public class Teacher extends Person {
	String subject;
	 Teacher(){
		 
	 }
	 Teacher(String name, String fname, int years, String subject){
		 super(name,fname,years);
		 this.subject=subject;
		 
	 }
	 
	 public void sayHello(){
		 System.out.println("Hello! Have a nice day!");
	 }
	 public void sayBye(){
		 System.out.println("GoodBye!");
	 }
	 public void homeWork(boolean home){
		 if(home==true){
			 System.out.println("I have homeworks for check.");
		 }
		 else{
			 System.out.println("I have NO homeworks for check.");
		 }
	 }
	 
	
	

}
