package homework4;
import java.util.Scanner;
import java.util.Arrays;
public class h7 {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in,"UTF-8");
		int[] arr={1,3,4,5,7,34,21,324,554,453,32,54,67,34,23,21,45,67,57,32,46,72,71,13};
		Arrays.sort(arr);
		System.out.println("Enter number to search: ");
		int num=input.nextInt();
		int value=Arrays.binarySearch(arr, num);
		
		System.out.print(num);
		System.out.print(" is in position "+value);

	}

}
