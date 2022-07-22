package tema16onlineExamTest;

import java.util.Scanner;

public class P01PCStore {

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		
		double processor = Double.parseDouble(scanner.nextLine());
		double videoCard = Double.parseDouble(scanner.nextLine());
		double ram = Double.parseDouble(scanner.nextLine());
		int numRam = Integer.parseInt(scanner.nextLine());
		double discount = Double.parseDouble(scanner.nextLine());
		
		double bgnForUsd = 1.57;
		
		double expProcessorBgn = processor * bgnForUsd;
		double expVideoBgn = videoCard * bgnForUsd;
		double expRamBgn = ram * numRam * bgnForUsd;
		
		double expProcessFinal = expProcessorBgn - expProcessorBgn * discount;
		double expVideoFinal = expVideoBgn - expVideoBgn * discount;
		
		double expenseTotal = expProcessFinal + expVideoFinal + expRamBgn;
		
		System.out.printf("Money needed - %.2f leva.", expenseTotal);
				
		

	}

}
