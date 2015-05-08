import java.util.Scanner;
public class end0 {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in, "UTF-8");
		
		System.out.println("Enter numbers (press 0 to stop)");
	int num;	
	int sum=0;
		while(true){
			num=input.nextInt();
			if(num==0){
				System.out.println(sum);
				break;
			}
			if(sum==0)sum=num;
			else{
				sum+=num;
				System.out.println(sum);
			}
			}
		
		}
	}


