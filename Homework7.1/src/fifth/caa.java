package fifth;
import java.util.Scanner;
public class caa {

	public static void main(String[] args) {
//		Scanner scan=new Scanner(System.in);
//		System.out.println("Enter number (10:999): ");
//		int num=scan.nextInt();
//		if(num<10 || num>999){
//			System.out.println("Incorrect input.");
//		}
//		else{
//			print(num);
//		}
		int num=999;
		print(num);
//		String a="101";
//		if(a.subSequence(0,1).equals(a.subSequence(2, 3))){
//			System.out.println("Da");
//		}
//		else{
//			System.out.println("ne");
//		}
//		
	}
	public static void print(Integer num){
		String str=num.toString();
		if(num==0){
			return;
		}
		else{
			
			if(str.subSequence(0,1).equals(str.subSequence(2, 3))){
				System.out.println(num);
			}
			print(--num);
			
			
				
			}
		}
	}
		
	


