
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
		System.out.println("�� ���� ����� �� ������ ���.");
	}
	public void exercises(boolean a){
		if(a==true){
			System.out.println("�� ��� ����������");
			}
		else{
			System.out.println("���� �� ��� ����������");
		}
	}
	public void exercises(int b){
		System.out.println("������������ �� ���� ����� �� "+b);
	}
	

}
