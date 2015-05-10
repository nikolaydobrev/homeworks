package homework4;
import java.util.Scanner;
public class h4 {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in,"UTF-8");
		int[]arr={1,2,3,4,5,6,7,8,2,4,53,123,42,5,34,32,51,67,87,98,65,69};
		System.out.println("Enter number for search: ");
		int num=input.nextInt();
		int i;
		for(i=0;i<arr.length;i++){
			if(arr[i]==num){
				System.out.printf("%d is in position %d",num,i);
				break;
			}
			
		}
		
		

	}

}
