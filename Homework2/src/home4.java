import java.util.Scanner;
public class home4 {
	
	public static void main(String[] args){
		
		Scanner input= new Scanner(System.in, "UTF-8");
		
		System.out.println("Enter first side of the triangle: ");
		int a=input.nextInt();
		System.out.println("Enter second side of the triangle: ");
		int b=input.nextInt();
		System.out.println("Enter third side of the triangle: ");
		int c=input.nextInt();
		
		if((a+b)<c){
			System.out.println("There is no triangle with these sides! ");	
		}
		else if((a+c)<b){
			System.out.println("There is no triangle with these sides! ");	
		}
		else if((b+c)<a){
			System.out.println("There is no triangle with these sides! ");	
		}
		else{
			System.out.println("Yes! It's triangle!");	
		}
	}
}
