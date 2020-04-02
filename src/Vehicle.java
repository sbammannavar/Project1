import java.util.Scanner;

public class Vehicle {

	String make;
	String model;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car obj = new Car();
		System.out.println("Please enter the Model");
		Scanner reader = new Scanner(System.in);
		obj.model = reader.next();
		obj.findmake(obj.model);
	}

}

class Car extends Vehicle {

	public void findmake(String model) {
		if (model.equalsIgnoreCase("Innova")) {
			make = "Toyota";
			System.out.println("Make of the car is " + make);
		} else if (model.equalsIgnoreCase("Indica")) {
			make = "TATA Motors";
			System.out.println("Make of the car is " + make);
		} else {
			System.out.println("Dont know Make");
		}

	}
}