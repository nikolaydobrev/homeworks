package third;
import java.util.Random;
public class first {

	public static void main(String[] args) {
		Random r=new Random();
		int num1=r.nextInt(50);	
		int num2=r.nextInt(50);
		int num3=r.nextInt(50);
		//Ограничих ги до 50 за да не излизат много големи стойности	
		print(num1,num2,num3);
	}
	public static void print(int a, int b, int c){
		
		int count=20;
		if(count==0){
			return;
		}
		else{
			--count;
			int result=a*b*c;
			print(a,b,c);			
			System.out.println(result);
		}
		
		
	}
}
