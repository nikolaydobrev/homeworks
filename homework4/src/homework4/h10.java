package homework4;
import java.util.Scanner;
public class h10 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in, "UTF-8");
		System.out.println("Enter size of matrix");
		int n=input.nextInt();
		int[][] matrix= new int[n][n];
		int rx=0,cx=0, i=1,cy=n-1,ry=n-1;
		while(i<=n*n){
			for(cx=0;cx<=ry;cx++){
				matrix[rx][cx]=i++;
			}
			for(rx=0;rx<=cy;rx++){
				matrix[rx][cy]=i++;
			}
			for(;cy>=cx;cy--){
				matrix[ry][cy]=i++;
			}
			for(cx=0;ry>=rx+1;ry--){
				matrix[ry][cx]=i++;
			}
			rx++;
			cx++;
			cy--;
			ry--;	
			
		}
		for(rx=0;rx<n;rx++){
			for(cx=0;cx<n;cx++){
				System.out.print(matrix[rx][cx]+ " ");
			}
			System.out.println();
		}

	}

}
