
public class Lecture extends Person {
	String university;
	final int lectures=10;
	public Lecture(){
		
	}
	public Lecture(String name, String fname, int years, String university){
		 super(name,fname,years);
		 this.university=university;
	}
	public void homeWork(boolean home){
		 if(home==true){
			 System.out.println("I have homeworks for check.");
		 }
		 else{
			 System.out.println("I have NO homeworks for check.");
		 }
	 }
	public void exercises(){
		System.out.println("Не знам какво да напиша тук.");
	}
	public void exercises(boolean a){
		if(a==true){
			System.out.println("Ще има упражнения");
			}
		else{
			System.out.println("Няма да има упражнения");
		}
	}
	public void exercises(int b){
		System.out.println("Упражненията за този месец са "+b);
	}
	

}
