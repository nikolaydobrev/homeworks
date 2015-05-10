package homework4;
import java.util.Scanner;
public class h9 {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in,"UTF-8");
		System.out.println("Enter number of rows/colons:");
		int n=input.nextInt();
		int [][]arr=new int[n][n];
		int col=0,k=0,max=1,row=0;
		while(max<n*n){
			
			for(col=0;col<n;col++){
				
				for(row=0;row<n;row++){
					
					arr[row][col]=max++;
				
				}
			}
		}
		for(row=0;row<n;row++){
			for(col=0;col<n;col++){
				
			System.out.print(arr[row][col]+ " ");
			}
			System.out.println("");
		}
		
	}

}
