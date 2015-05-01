import java.util.Scanner;
public class home5 {

	public static void main(String[] args) {
		
		Scanner input= new Scanner(System.in,"UTF-8");
		int i;
		do{
		System.out.println("Enter your score: ");
		i=input.nextInt();
		if(i>=1 && i<4){
			int b=i*5;
			System.out.println("Your score + bonus points is  "+b);	
		}
		if(i>=4 && i<7){
			int b=i*10;
			System.out.println("Your score + bonus points is  "+b);	
			
		}
		if(i>=7 && i<10){
			int b=i*50;
			System.out.println("Your score + bonus points is  "+b);	
			
		}

		}while(!(i>=1 && i<10));
	}

}
