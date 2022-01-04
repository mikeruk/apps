package tema07ConditStatAdvUpr;

import java.math.MathContext;
import java.util.Scanner;

public class P08OnTimeForExam {

	public static void main(String[] args) {
		

		Scanner scanner = new Scanner(System.in);
		double hExam = Double.parseDouble(scanner.nextLine()) * 60;
		double mExam = Double.parseDouble(scanner.nextLine());
		double hArrive = Double.parseDouble(scanner.nextLine()) * 60;
		double mArrive = Double.parseDouble(scanner.nextLine());
		
		double mExamTotal = hExam + mExam;
		double mArrivalTotal = hArrive + mArrive;
		double difference = mExamTotal - mArrivalTotal;
		
		if(difference == 0) {
			System.out.println("On Time");
		} else if(difference <= 30 && difference > 0) {
			System.out.printf("On time\n%.0f minutes before the start", difference);
		} else if(difference > 30 && difference <= 59) {
			System.out.printf("Early\n%02.0f minutes before the start", difference);
			
		} else if(difference > 59) {
			double hours = difference / 60;
			double minutes = difference % 60;
			System.out.printf("Early\n%.0f:%02.0f hours before the start", hours, minutes);
			
		} else if(Math.abs(difference) > 0 && Math.abs(difference) <= 59) {
			System.out.printf("Late\n%.0f minutes after the start", Math.abs(difference));
		} else {
			double hours = difference / 60.00;
			double minutes = difference % 60;
			System.out.printf("Late\n%.0f:%02.0f hours after the start", Math.floor(Math.abs(hours)),Math.abs(minutes) );
		}
	}

}
