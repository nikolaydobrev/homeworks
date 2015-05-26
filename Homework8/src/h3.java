import java.util.Scanner;
public class h3 {

	public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	System.out.println("Enter text: ");
	String text=input.nextLine();
	System.out.println("Enter word: ");
	String word=input.next();
	int position=text.indexOf(word);
	int count=0;
	while(position>=0){
		position++;
		count++;
		position=text.indexOf(word,position);
	}
	System.out.println(count);
	
	
	input.close();
	}

}
