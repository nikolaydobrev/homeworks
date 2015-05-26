import java.util.Scanner;
public class h4 {

	public static void main(String[] args) {
		
			Scanner input=new Scanner(System.in);
			System.out.println("Enter text ");
			String text=input.nextLine();
			System.out.println("Enter word: ");
			String word=input.next();
			String[] splited=text.split("\\.");
			for(int i=0; i<splited.length; i++){
                if(splited[i].contains(word)){
        System.out.print(splited[i] + ".");
                }
        }
			input.close();
			
			
	}

}
