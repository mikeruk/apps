package tema14NestedLoopsExercise;

import java.util.Scanner;

public class P04TrainTheTrainers {

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		
		double jury = Double.parseDouble(scanner.nextLine());		
		String input = scanner.nextLine();
		
		double grade = 0;
		double sumGrade = 0;
		
		int counter = 0;
		double finalAssesment = 0;
		
		while(!input.equals("Finish")) {
			
			for(int i = 1; i <= jury; i++) {
				grade = Double.parseDouble(scanner.nextLine());
				sumGrade += grade;
			}
			System.out.printf("%s - %.2f.%n",input, sumGrade / jury);
			finalAssesment = finalAssesment + sumGrade / jury;
			sumGrade = 0;
			counter++;
			input = scanner.nextLine();
		}
		
		
		System.out.printf("Student's final assessment is %.2f.", finalAssesment / counter);

	}

}
