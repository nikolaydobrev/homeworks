
public class SUV extends Car {
		boolean isitoffroad;
		
		public SUV(int price,boolean isitoffroad){
			
			super(price);

			this.isitoffroad=isitoffroad;
		}
		public void print(){
			System.out.println("This car cost "+this.price+".");
			System.out.println("This car is SUV:  "+this.isitoffroad);
			System.out.println();
		}

}
