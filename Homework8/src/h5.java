import java.util.Scanner;
public class h5 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter mathematics expression: ");
		String mat=input.nextLine();
		
	//	int pos=mat.indexOf('(');
		int flag=1;
		int count1=0,count2=0;
		for(int i=0;i<mat.length();i++){
			if(mat.charAt(i)=='('){
				flag=1;
				count1++;
				continue;
			}
		
			if(mat.charAt(i)==')'){
				flag=0;
				count2++;
			}
		}
		if(flag==0 && count1==count2){
			System.out.println("OK!");
		}
		else{
			System.out.println("Mistake");
		}
		
		
		input.close();
	}

}
