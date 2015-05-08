import java.util.Scanner;
public class h2 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in, "UTF-8");
		System.out.println("Enter your limit number: ");
		int num=input.nextInt();
		int a;
		for(int i=0;i<num+1;i++){
			
			if(i%3!=0 && i%7!=0){
				a=i;
				System.out.print(a);
				System.out.print(" ");
			}
			
		}

	}

}
