package homework4;
import java.util.Scanner;
public class h3 {

	public static void main(String[] args) {
		int num=10;
		int i;
		Scanner input=new Scanner(System.in, "UTF-8");
		int[]arr=new int[num];
		System.out.println("Enter 10 numbers: ");
		
		for(i=0;i<num;i++)
			arr[i]=input.nextInt();
		for(i=0; i<num;i++){
			arr[i]*=10;
		}
		for(i=0;i<num;i++){
			System.out.print(arr[i] +" ");
		}
	}

}
