package FirstStepsInCodingMoreExercises;

import java.util.Scanner;

public class P09WeatherForecast {

	public static void main(String[] args) {


		Scanner scanner = new Scanner(System.in);
		
		String sunny = scanner.nextLine();
		
		
		if(sunny.equals("sunny")) {
			System.out.println("It's warm outside!");
		}else{
			System.out.println("It's cold outside!");
		}
		
	}

}

