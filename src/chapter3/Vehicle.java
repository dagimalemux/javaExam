package chapter3;


 class Main{
	protected int numberOfSeat;
	protected int numberOfwheels;
	
	public Main(int numberOfSeat, int numberOfwheels) {
		this.numberOfSeat = numberOfSeat;
		this.numberOfwheels = numberOfwheels;
	}
}

 class Car extends Main{
	 Car(int numberOfseat, int numberOfwheels){
		 super(numberOfseat, numberOfwheels);
	 }
 }
 
 class Motor extends Main{
	 Motor(int numberOfseat, int numberOfwheels){
		 super(numberOfseat, numberOfwheels);
	 }
 }


public class Vehicle{
	public static void main(String[] args) {
		//  For the car class
		
		Car c = new Car(3,4);
		System.out.println("Car seat : " + c.numberOfSeat);
		System.out.println("Car wheels : " + c.numberOfwheels);
		
		// For the Motor class
		
		Motor m = new Motor(1,2);
		
		System.out.println("Motor seat  : " + m.numberOfSeat);
		System.out.println("Motor wheels : " + m.numberOfwheels);
		
	}
}
