package fourth;
import java.util.Scanner;
public class even {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter number: ");
		int a=scan.nextInt();
		isItEven(a);
		scan.close();
	}
	public static void isItEven(int a){
		if(a%2==0){
			System.out.println("Your number is even!");
		}
		else{
			System.out.println("Your number is odd!");
		}
	}

}
