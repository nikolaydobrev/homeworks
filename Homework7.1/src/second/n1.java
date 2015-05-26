package second;
import java.util.Scanner;
public class n1 {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter name: ");
	String name=s.next();
	sayHello(name);
	s.close();
	}
	public static void sayHello(String str){
		System.out.println("Greeting, "+str+"!");
	}
	
}
