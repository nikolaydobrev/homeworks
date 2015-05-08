import java.util.Scanner;
public class nm {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in, "UTF-8");
		System.out.println("Enter N: ");
		int n=input.nextInt();
		System.out.println("Enter M: ");
		int m=input.nextInt();
		int num=n;
		if(m!=0){
			for(int i=1;i<m;i++){
			num=n*num;
		
			
			}
			System.out.print("N^M = "+num);
		}
		else if(m==0){
			System.out.print("N^M = 1");
		}
		

	}

}
