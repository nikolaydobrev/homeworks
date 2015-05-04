import java.util.Scanner;

public class sixth {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in,"UTF-8");
		
		System.out.println("Enter radius of your circle:");
		double r=input.nextDouble();
		System.out.print("S= ");
		
		System.out.println(3.14*(r*r));
		System.out.print("P= ");
		
		System.out.println(3.14*r*2);
		

	}

}
