package Last;
import java.util.Scanner;
public class permutation {

	public static void main(String[] args) {
//		StringBuilder str=new StringBuilder();
		Scanner input=new Scanner(System.in);
		System.out.println("Enter number: ");
		String num=input.next();
		if(num.length()>5){
			System.out.println("Too big");
			System.exit(0);
		}
		makePermutation("",num);
		
		input.close();
	}
	public static void makePermutation(String first, String num){
		int n=num.length();
		if(n==0){
			System.out.println(first);
			//	return;
		}
		else{
			for(int i=0; i<n;i++){
				makePermutation(first+num.charAt(i),num.substring(0,i)+num.substring(i+1));
			}
		}
	}

}
