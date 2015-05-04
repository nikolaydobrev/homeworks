import java.util.Scanner;
public class h8 {

	public static void main(String[] args) {
		
		Scanner input= new Scanner(System.in, "UTF-8");
		
		System.out.print("Enter first number: ");
		int a1=input.nextInt();
		System.out.print("Enter second number: ");
		int a2=input.nextInt();
		System.out.print("Enter third number: ");
		int a3=input.nextInt();
		System.out.print("Enter fourth number: ");
		int a4=input.nextInt();
		System.out.print("Enter fifth number: ");
		int a5=input.nextInt();
		
		if(a1>a2){
			if(a1>a3){
				if(a1>a4){
					if(a1>a5){
						System.out.println("The biggest is "+a1);
					}
					else{
							System.out.println("The biggest is "+a5);
						}
						
					}
				else{
					if(a4>a5){
						System.out.println("The biggest is "+a4);
					}
					else{
						System.out.println("The biggest is "+a3);
					}
				}
			}
			else{
				if(a3>a4){
					if(a3>a5){
						System.out.println("The biggest is "+a3);
					}
					else{
						System.out.println("The biggest is "+a5);
					}
				}
				if(a4>a5){
					System.out.println("The biggest is "+a4);
				}
				else{
					System.out.println("The biggest is "+a5);
				}
			}
			
			
		}
		else{
			if(a2>a3){
				if(a2>a4){
					if(a2>a5){
						System.out.println("The biggest is "+a2);
					}
					else{
						System.out.println("The biggest is "+a5);
					}
				}
				else{
					if(a4>a5)
					{
						System.out.println("The biggest is "+a4);
					
					}
					else{
						System.out.println("The biggest is "+a5);
					}
				}
				
			}
			else{
				if(a3>a4){
					if(a3>a5){
						System.out.println("The biggest is "+a3);
					}
					else{
						System.out.println("The biggest is "+a5);
					}
					
				}
				else{
					if(a4>a5){
						System.out.println("The biggest is "+a4);
					}
					else{
						System.out.println("The biggest is "+a5);
					}
				}
			}
		}
		

	}

}
