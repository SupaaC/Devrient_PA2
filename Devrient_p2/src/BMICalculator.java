import java.util.Scanner;

public class BMICalculator {
	
	private static int measurementSystem;
	static double personsWeight;
	static double personsHeight;
	static double bmi;
	static String bmiCategory;
	
	public static double getWeight() {
		return personsWeight;
	}
	
	private static void setWeight(double weight) {
		personsWeight = weight;
	}
	
	public static double getHeight() {
		return personsHeight;
	}
	
	private static void setHeight(double height) {
		personsHeight = height;
		
	}
	
	public String getCategory() {
		return bmiCategory;
	}
	
	private static void setbmiCategory(String category) {
		bmiCategory = category;
	}
	public void readUserData () {
		readUnitType();
		readMeasurementData();
		
	}
	
	private static int readUnitType() {
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("Please select the unit system: 1 for imperial or 2 for metric.");
		
		measurementSystem = scnr.nextInt();
		
		while(measurementSystem != 1 && measurementSystem != 2)
        {
            System.out.println("Sorry invalid entry");
            System.out.println("Please select the unit system: 1 for imperial or 2 for metric.");
            measurementSystem = scnr.nextInt();
        }
        if (measurementSystem == 1) {
            System.out.println("Imperial system selected.");
        }
        if (measurementSystem == 2){
            System.out.println("Metric selected. ");
        }
		
		return measurementSystem;
		
	}
	
	private static void readMeasurementData () {
			
			if (measurementSystem == 1) {
				readImperialData();
			}
			if (measurementSystem == 2) {
				readMetricData();
			}
		}
	
	private static void readImperialData() { //this works correctly, need to make it for metric
		Scanner scnr = new Scanner(System.in);

		double heightInches, weightPounds;
		
		System.out.println("Current height is: " + getHeight());
		
		System.out.println("Enter your height in inches: ");
		heightInches = scnr.nextDouble();
		if(heightInches < 0 ) {
			System.out.println("Invalid Entry, goodbye!");
			System.exit(0);
		}
		setHeight(heightInches);
		
		
		System.out.println("Height is now: " + getHeight());
		
		System.out.println("Current weight is: " + getWeight());
		
		System.out.println("Enter your weight in pounds: ");
		weightPounds = scnr.nextDouble();
	
		if(weightPounds < 0) {
			System.out.println("Invalid Entry, goodbye!");
			System.exit(0);
		}
		setWeight(weightPounds);
		
		
		System.out.println("Weight is now: " + getWeight());
		
		

	}
	
	private static void readMetricData() { //this works correctly, need to make it for metric
		Scanner scnr = new Scanner(System.in);

		double heightMeters, weightKilos;
		
		System.out.println("Current height is: " + getHeight());
		
		System.out.println("Enter your height in meters: ");
		heightMeters = scnr.nextDouble();
		setHeight(heightMeters);
		
		System.out.println("Height is now: " + getHeight());
		
		System.out.println("Current weight is: " + getWeight());
		
		System.out.println("Enter your weight in kilos: ");
		weightKilos = scnr.nextDouble();
		setWeight(weightKilos);
		
		System.out.println("Weight is now: " + getWeight());
		
		
		
	
	}
	
	public void calculateBmi() {
		
		String category = null;
		
		if(measurementSystem == 1) {
			bmi = ((703 * getWeight()) / (getHeight() * getHeight()));
		}else {
			
			bmi = (getWeight() / (getHeight() * getHeight()));
		}
		
		if (bmi < 18.5) {
			category = "Underweight";
			setbmiCategory(category);
	
		}
		if (bmi < 24.9 && bmi > 18.5) {
			category = "Normal";
			setbmiCategory(category);
		
		}
		if (bmi < 29.9 && bmi > 25) {
			category = "Overweight";
			setbmiCategory(category);
			
		}
		if (bmi > 30) {
			category = "Yikes!";
			setbmiCategory(category);
			
		}
		
	}
	
	public void displayBmi() {
		System.out.printf("BMI: %.2f \n", bmi);
		System.out.println("Category: " + bmiCategory);
	}
}
