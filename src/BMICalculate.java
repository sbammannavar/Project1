import java.util.Scanner;

public class BMICalculate extends BMIInput {

	float bmi1;
	float bmi2;
	float bmi3;
	float weight;
	float height;
	int constant = 10000;
    	
	public void bmiCalculation() {

		System.out.println("Enter your weight in kilograms");
		Scanner reader2 = new Scanner(System.in);
		int weight = reader2.nextInt();
		//reader2.close();
		System.out.println("Enter your height in centimeter");
		Scanner reader3 = new Scanner(System.in);
		int height = reader3.nextInt();
		//reader3.close();
		float bmi1 = (float) weight / (float) height;
		float bmi2 = (float) bmi1 / (float) height;
		float bmi3 = bmi2 * constant;

		System.out.printf(name + " your BMI is = " + bmi3);
		
		if (bmi3 <= 18.5) {
			System.out.printf(" and you are underweight");
		}
		else if (bmi3 > 18.5 && bmi3 <= 24.9) {
			System.out.printf(" and it is normal");
		}
			else if (bmi3 > 25.0 && bmi3 <= 29.9) {
				System.out.printf(" and you are overweight");
			}
				else if (bmi3 > 30) {
				System.out.printf(" and you are obase");
				}
	}
}
