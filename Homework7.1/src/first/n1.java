package first;
import java.util.Scanner;
public class n1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Compare 2 or 3 numbers (Enter 2 or 3)");
		int choice=s.nextInt();
		if(choice==2){
			System.out.println("Enter 2 numbers: ");
			int first=s.nextInt();
			int second=s.nextInt();
			int result=maxNumber(first,second);
			System.out.println("Bigger is "+result);			
		}else if(choice==3){
			System.out.println("Enter 3 numbers: ");
			int first=s.nextInt();
			int second=s.nextInt();
			int third=s.nextInt();
			int result=maxNumber(first,second,third);
			System.out.println("Biggest is "+result);			
		}else{
			System.out.println("Incorrect input");
		
		}
		

	}
	public static int  maxNumber(int a, int b){
		if(a>b){
			return a;
		}else if(b>a){
			return b;
		}
		else{
			return a;
		}
	}
	public static int maxNumber(int a, int b, int c){
		int i;
		i=a;
	
		if(i<b){
        	i=b;
        	if(i<c){
        		i=c;
        	return i;
        	}
        }
        if(i<c){
        	i=c;
        	return i;
        }
        return i;
     
	}
	}