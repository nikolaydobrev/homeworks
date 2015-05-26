import java.util.Scanner;
public class h2 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter word: ");
		String word=input.next();
		System.out.println("Enter sentence: ");
		String line=input.next();
		input.close();
		String new1=line.replace(word,word.toUpperCase());
		System.out.println(new1);
		
		

	}

}
