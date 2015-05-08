import java.util.Scanner;
import java.lang.ArithmeticException;
public class h4 {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in, "UTF-8");
		System.out.println("Enter N: ");
		int n=input.nextInt();
		System.out.println("Enter M: ");
		int m=input.nextInt();
		int n1=1;
		int m1=1;
		int f=1;
		int y=1;
		if(n>m){
		for(int i=1;i<=n;i++){
			n1*=i;			
		}
		for(int i=1;i<=m;i++){
			m1*=i;			
		}
		f=n-m;
	
		for(int i=1; i<f+1;i++){
			y*=f;
		}
		int k=(n1*m1)/y;
		System.out.print("N!*M!/(N-M)!= ");
		System.out.println(k);
		//N!*K!/(N-K)!
		}
		else{
			System.out.println("Incorrect input!");
			System.out.println("N must be bigger than M!");
		}
		
		
	}

}

