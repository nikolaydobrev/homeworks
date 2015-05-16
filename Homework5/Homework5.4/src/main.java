import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in,"UTF-8");
		System.out.println("Enter degrees in Celsius:");
		double cel=input.nextDouble();
		Celsius newCel=new Celsius();
		double far=newCel.Convert(cel);
		System.out.println(cel+" degrees in C are equals to "+far+" degrees in Fahrenheit.");
		
		

	}

}
