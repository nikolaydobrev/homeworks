package six;
import java.util.Scanner;
public class facturial {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter N!: ");
		int a=scan.nextInt();
		int	result=fact(a);
	//	System.out.println(a);
		System.out.println(result);
		scan.close();
	}
	public static int fact(int a){
		if(a==0){
			return 1;
		}
		else{
			
			return a * fact(a-1);
			
		}
	}

}
