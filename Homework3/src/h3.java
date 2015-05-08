import java.util.Scanner;
public class h3 {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in, "UTF-8");
		
		System.out.println("Enter 5 numbers");
		int num;	
		int sum=0;
		int count=0;
		while(true){
			num=input.nextInt();
			count++;
			sum+=num;
			if(count==5){
			
				System.out.println(sum);
				break;
			
			}
	
	}
}
}


