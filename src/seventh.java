import java.util.Scanner;

public class seventh {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in,"UTF-8");
		System.out.print("Enter number:");
		int num=input.nextInt();
		System.out.print("5 is devisior for your number: ");
		boolean a5=num%5==0;
		System.out.println(a5);
		boolean a7=num%7==0;
		System.out.print("7 is devisior for your number: ");
		System.out.println(a7);

	}

}
