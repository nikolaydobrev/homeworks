package homework4;

public class h6 {

	public static void main(String[] args) {
		int[][] arr=new int[5][6];
		int row;
		int col;
		int i=30;
		while(!(i<=0)){
		for(row=0;row<arr.length;row++){
			for(col=0;col<arr[row].length;col++){
				arr[row][col]=i;
				i--;
			}
		}
	}
		for(row=0;row<5;row++){
			for(col=0;col<6;col++){
				System.out.print(arr[row][col]+ "	 ");
			}
			System.out.printf("\n\n");
		}
		
	
	}

}
