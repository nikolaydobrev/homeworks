import java.util.Scanner;
public class h1 {
	public static void main(String[] args){
		
		Scanner input=new Scanner(System.in, "UTF-8");
		
		System.out.println("Enter your limit number: ");
		int num=input.nextInt();
		for(int i=0; i<num+1; i++){
			System.out.print(i);
			System.out.print(" ");
		}
		input.close();
		
	}

}
