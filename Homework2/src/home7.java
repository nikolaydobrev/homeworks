import java.util.Scanner;
public class home7 {

	public static void main(String[] args) {
		
		Scanner input= new Scanner(System.in, "UTF-8");
		
		System.out.println("Enter coefficients of your square equation:");
		input.nextLine();
		System.out.print("a=");
		double a=input.nextDouble();
		System.out.print("b=");
		double b=input.nextDouble();
		System.out.print("c=");
		double c=input.nextDouble();
	
		if(c==0)
		{
			System.out.println("Your square equation is: ");
			System.out.print(a);
			System.out.print("x^2 + (");
			System.out.print(b);
			System.out.print("x)");
			System.out.println("=0");
			int x1=0;
			double x2=(-b)/a;
			System.out.println("x1= "+x1);
			System.out.println("x2= "+x2);
		}
		else if(b==0){
			
			System.out.println("Your square equation is: ");
			System.out.print(a);
			System.out.print("x^2 + ");
			System.out.print("("+c);
			System.out.print(")");
			System.out.println("=0");
			
			double x1=(-c)/a;
			double x2=-((-c)/a);
			System.out.println("x1= "+x1);
			System.out.println("x2= "+x2);
		}
		else if(a==0){
			
			System.out.println("Your equation is linear now:");
			System.out.print(b);
			System.out.print("x)+");
			System.out.print("("+c);
			System.out.print(")");
			System.out.println("=0");
			
			
		}else{
			
			System.out.println("Your square equation is: ");
			System.out.print(a);
			System.out.print("x^2 + (");
			System.out.print(b);
			System.out.print("x)+");
			System.out.print("("+c);
			System.out.print(")");
			System.out.println("=0");
			double d=Math.sqrt(b*b - 4*a*c);
			if(d>0){
			
			double x1=(-b) - Math.sqrt(b*b - 4*a*c);
			double x2=(-b) + Math.sqrt(b*b - 4*a*c);
			System.out.println("x1= "+x1);
			System.out.println("x2= "+x2);
			
			}
			else if(d==0){
				double x=(-b)/2*a;
				System.out.println("x= "+x);
			
			}
			else if(d<0){
				System.out.println("There is only imaginary solutions");
				
			}
			
		}
			
		
	
		

	}

}
