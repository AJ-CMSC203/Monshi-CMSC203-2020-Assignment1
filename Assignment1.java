import java.util.Scanner;


public class Assignment1 {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		
		//constant variables
		final double NUM1 = 35.74, NUM2 = 0.6215, NUM3 = 35.75, NUM4 = 0.4275;
		
		double windChill;
		String programmerName = "Amanda Jaley"; 
		
		//header
		System.out.println("Wind Chill Calculator");
		
		//Temperature input
		double tempFahr;
		System.out.print("Please type in a temperature in Fahrenheit (must be between -45 and 40): ");
		tempFahr = userInput.nextDouble();
		while (tempFahr < -45 || tempFahr > 40) {
			System.out.println("Input invaid. Insert temperature between -45 and 40.");
			tempFahr = userInput.nextDouble();
		}
		System.out.println("The temperature you chose is " + tempFahr + ".");
		
		//Wind speed input
		double windSpeed;
		System.out.print("Please input wind speed in miles per hour (between 5 and 60): ");
		windSpeed = userInput.nextDouble();
		while (windSpeed < 5 || windSpeed > 60) {
			System.out.println("Input invalid. Insert wind speed between 5 and 60 mph");
			windSpeed = userInput.nextDouble();
		}
		System.out.println("The wind speed you chose is " + windSpeed + ".");
		
		//calculate wind chill
		double PART1 = NUM1, PART2 = NUM2 * tempFahr, PART3 = NUM3 * Math.pow(windSpeed, .16),
				PART4 = NUM4 * tempFahr * Math.pow(windSpeed, .16); 
		windChill = PART1 + PART2 - PART3 + PART4; 
		System.out.println(windChill);
		
		System.out.println("Programmer name: " + programmerName);
	}

}
