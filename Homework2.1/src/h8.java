import java.util.Scanner;
public class h8 {

	public static void main(String[] args) {
		
		Scanner input= new Scanner(System.in,"UTF-8");
		System.out.println("Enter first number: ");
		int num1=input.nextInt();
        
        System.out.println("Enter second number: ");
        int num2=input.nextInt();
        
        System.out.println("Enter third number: ");
        int num3=input.nextInt();
        
        System.out.println("Enter fourth number: ");
        int num4=input.nextInt();
        
        System.out.println("Enter fift number: ");
        int num5=input.nextInt();

        int i=num1;
        
        if(i<num2){
        	i=num2;
        }
        if(i<num3){
        	i=num3;
        }
        if(i<num4){
        	i=num4;
        }
        if(i<num5){
        	i=num5;
        }
        System.out.println("Biggest is:"+i);
       
		

	}

}
