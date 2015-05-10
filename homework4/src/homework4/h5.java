package homework4;
import java.util.Scanner;
public class h5 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in,"UTF-8");
		System.out.println("Enter 2 number (second must be bigger):");
		int a=input.nextInt();
		int b=input.nextInt();
		if(a>b){
			System.out.println("Error! First number is bigger than second!");
			
		}
		else{
			int i;
			for(i=a;i<b;i++){
				if(i%3==0){
					System.out.println(i);
				}
			}
		}

	}

}
