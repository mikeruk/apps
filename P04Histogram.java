package tema10ForLoopUpr;

import java.util.Scanner;

public class P04Histogram {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int n = Integer.parseInt(scanner.nextLine());
		
		
		double p1 = 0, p2 = 0, p3 = 0, p4 = 0, p5 = 0;
		
		for(int i = 1; i <= n; i++) {
			
			int number = Integer.parseInt(scanner.nextLine());
			
			if(number < 200) {
				p1++;
			} else if(number <= 399) {
				p2++;
			} else if(number <= 599) {
				p3++;
			} else if(number <= 799) {
				p4++;
			} else if(number >= 800) {
				p5++;
			}
		}
		double percentP1 = p1 / n * 100;
		double percentP2 = p2 / n * 100;
		double percentP3 = p3 / n * 100;
		double percentP4 = p4 / n * 100;
		double percentP5 = p5 / n * 100;
		
		System.out.printf("%.2f%%%n%.2f%%%n%.2f%%%n%.2f%%%n%.2f%%%n", percentP1, percentP2, percentP3, percentP4, percentP5);
	}
	
	
}
