import java.util.Scanner;
public class h3 {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in, "UTF-8");
		
		System.out.println("Enter 5 numbers");
		int num=5;
		int[] arr=new int[num];
		
		int i=0, swap=0;
		int k=0; 
		for(i=0;i<num;i++)
		arr[i]=input.nextInt();
		for(i=0;i<num-1;i++){
			for(k=0;k<(num-1)-i;k++){
				if(arr[k]>arr[k+1]){
					swap=arr[k];
					arr[k]=arr[k+1];
					arr[k+1]=swap;
				}
			}
		}
		System.out.println(arr[0]);
		System.out.println(arr[num-1]);
		
	}
}


