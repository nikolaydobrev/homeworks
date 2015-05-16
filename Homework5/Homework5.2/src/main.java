
public class main {

	public static void main(String[] args) {
		Car []arr=new Car[10];
		
		arr[0]=new SUV(32000,true);
		arr[1]=new SUV(75000,true);
		arr[2]=new SUV(54000,false);
		arr[3]=new SUV(40000, false);
		arr[4]=new SUV(270000,true);
		arr[5]=new Automobile(34000,8.4);
		arr[6]=new Automobile(64000,7.1);
		arr[7]=new Automobile(78000,6.9);
		arr[8]=new Automobile(29000,3.4);
		arr[9]=new Automobile(111000,14.6);
		for(int i=0;i<arr.length/2;i++){
			arr[i].print();
		}
		for(int i=arr.length/2;i<arr.length;i++){
			arr[i].print1();
		}
		
		
		

	}

}
