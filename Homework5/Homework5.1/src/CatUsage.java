
public class CatUsage {

	public static void main(String[] args) {
		Cat []arr=new Cat[10];
		arr[0]=new Cat(3, "Ivan");
		arr[1]=new Cat(4, "Petur");
		arr[2]=new Cat(6, "Ganio");
		arr[3]=new Cat(7, "Ivan1");
		arr[4]=new Cat(1, "IVan2");
		arr[5]=new Cat(2, "Ivan3");
		arr[6]=new Cat(8, "Dimitur");
		arr[7]=new Cat(9, "Dimitur4");
		arr[8]=new Cat(12, "Stanislav4");
		arr[9]=new Cat(10, "Ivan6");
		for(int i=0;i<arr.length;i++){
			arr[i].Say();
		}
		

	}

}
