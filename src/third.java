import java.util.Scanner;
public class third {

	public static void main(String[] args) {
     String name;
     String fname;
     byte years;
     String sex; //В метода input не намирам тип char
     long egn;
     long number;
     
     Scanner input=new Scanner(System.in, "UTF-8");
     
     System.out.print("Enter your name:");
     name=input.nextLine();
     System.out.print("Enter your second name:");
     fname=input.nextLine();
     System.out.print("How old are you?");
     years=input.nextByte();
     System.out.print("Sex:");
     sex=input.next();
     System.out.print("Enter your Personal number:");
     egn=input.nextLong();
     System.out.print("Enter your phone number:");
     number=input.nextLong();
     
     System.out.print("Hello, ");
     System.out.print(name);
     System.out.print(" ");
     System.out.print(fname);
     System.out.println("!");
     System.out.print("You are ");
     System.out.print(years);
     System.out.println(" years old!");
     System.out.print("Sex:"); System.out.println(sex);
     System.out.print("Your Personal number is: "); System.out.println(egn);
     System.out.print("Your phone number is 0"); System.out.println(number); //защо не може да прочете 0лата?
          
     
     
	}

}
