import java.util.Scanner;
public class h5 {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in, "UTF-8");
		System.out.println("Enter N: ");
		int n=input.nextInt();
		System.out.println("Enter M: ");
		int m=input.nextInt();
		int n1=n;
		int m1=m;
		for(int i=0; i<n;i++){
			n1*=n;
		}
		for(int i=0; i<m; i++){
			m1*=m;
		}
		System.out.print("n!/m!= ");
		System.out.println(n1/m1);
	}

}
