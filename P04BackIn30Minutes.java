package basicSyntaxConditStatAndLoopsLab;

import java.util.Scanner;

public class P04BackIn30Minutes {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int h = Integer.parseInt(scanner.nextLine())*60;
		int m = Integer.parseInt(scanner.nextLine());
		
		int mTotal = h + m + 30;
		
		int hours = mTotal / 60;
		int minutes = mTotal % 60;
		
		if(hours == 24) {
			hours = 0;
		}
		System.out.printf("%d:%02d",hours, minutes);

	}

}
