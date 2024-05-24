package tema17onlineExam;

import java.util.Scanner;

public class P02ANDProcessors {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int needCPU = Integer.parseInt(scanner.nextLine());
		int workers = Integer.parseInt(scanner.nextLine());
		int workDays = Integer.parseInt(scanner.nextLine());
		
		double totalHours = workers * workDays * 8;
		double producedCPUs = Math.floor(totalHours / 3);
		
		//System.out.println("produces CUPs "+ producedCPUs);
		
		
		double diff = needCPU - producedCPUs;
		
		if(producedCPUs >= needCPU) {
			System.out.printf("Profit: -> %.2f BGN",Math.abs(diff) * 110.1);
		} else {
			System.out.printf("Losses: -> %.2f BGN",diff * 110.1);
		}
	}

}
