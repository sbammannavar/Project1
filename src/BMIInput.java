import java.util.Scanner;

abstract public class BMIInput {
    public String name;
    
	public void receiveInputs() {
		System.out.println("Hello, Welcome to BMI Calculator");
		System.out.println("Please Enter your name");
		Scanner reader1 = new Scanner(System.in);
		name = reader1.next();
		
				
	}

	public abstract void bmiCalculation();

}
