import java.util.Scanner;

public class eighth {

	public static void main(String[] args) {
		
	Scanner input=new Scanner(System.in,"UTF-8");
	System.out.println("Enter number:");
	int num=input.nextInt();
	boolean a=num%2==0;
	System.out.print("Your number is even: ");
	System.out.println(a);
		
	}

}
