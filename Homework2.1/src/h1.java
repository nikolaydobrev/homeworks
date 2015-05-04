import java.util.Scanner;
public class h1 {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in, "UTF-8");
		
		System.out.println("Enter first number: ");
		int a=input.nextInt();
		System.out.println("Enter second number: ");
		int b=input.nextInt();
		
		
		if(a<0 && b<0){
			System.out.println("+");
		}
		else if(a<0 && b>0){
			System.out.println("-");
		}
		else if(a>0 && b<0){
			System.out.println("-");
		}
		else if(a>0 && b>0){
			System.out.println("+");
		}

	}

}
