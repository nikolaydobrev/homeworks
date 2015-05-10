package homework4;

public class h8 {

	public static void main(String[] args) {
		int []arr={1,3,5,7,8,2,4,56,23,56,-3,13,-56,-71};
		int swap, i, k=0;
		for(i=0;i<arr.length-1;i++){
			for(k=0;k<arr.length-1-i;k++){
				if(arr[k]>arr[k+1]){
					swap=arr[k];
					arr[k]=arr[k+1];
					arr[k+1]=swap;
					}
			}
		}
		for(i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}

	}

}
