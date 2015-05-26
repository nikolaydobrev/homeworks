import java.util.Scanner;

public class h1 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter string: ");
		String str=scan.nextLine();
		String reverse=new StringBuilder(str).reverse().toString();
		StringBuilder sb=new StringBuilder(str);
		sb.reverse();
		System.out.println(reverse);
		
		scan.close();

	}

}
