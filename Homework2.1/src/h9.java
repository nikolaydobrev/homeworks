import java.util.Scanner;
public class h9 {

	public static void main(String[] args) {
		
		Scanner input= new Scanner(System.in, "UTF-8");
		
		System.out.print("Enter your number: ");
		int a=input.nextInt();
		if(a>=1 && a<6){
			if(a%2==0){
				System.out.println("Even number!");
			}
			else{
				System.out.println("Odd number!");
			}
		}
		else if(a>=6 && a<16){
			if(a%3==0){
				System.out.print(a);
				System.out.print("%3= 0");
			}
			else{
				System.out.print(a);
				System.out.print("%3!=0");
			}
		}
		else{
			if(a==0){
				System.out.print("Your number is zero!");
			}
			else if(a>0){
				System.out.print("Your number is positive!");
			}
			else if(a<0){
				System.out.print("Your number is negative!");
			}
		}

	}

}
