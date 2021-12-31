package tema07ConditStatAdvUpr;

import java.util.Scanner;

public class P06OperationsBetweenNumbers {

	public static void main(String[] args) {

			Scanner scanner = new Scanner(System.in);
			
			double N1 = Integer.parseInt(scanner.nextLine());
			double N2 = Integer.parseInt(scanner.nextLine());
			String operator = scanner.nextLine();
			
			switch(operator) {
				case "+":
					if(N2 != 0) {
						double result = N1 + N2;
						if(result % 2 == 0) {
							System.out.printf("%.0f + %.0f = %.0f - even",N1,N2,result);
						} else {
							System.out.printf("%.0f + %.0f = %.0f - odd",N1,N2,result);
						}
					} 
					break;
				case "-":
					if(N2 != 0) {
						double result = N1 - N2;
						if(result % 2 == 0) {
							System.out.printf("%.0f - %.0f = %.0f - even",N1,N2,result);
						} else {
							System.out.printf("%.0f - %.0f = %.0f - odd",N1,N2,result);
						}
					} 
					break;	
				case "*":
					if(N2 != 0) {
						double result = N1 * N2;
						if(result % 2 == 0) {
							System.out.printf("%.0f * %.0f = %.0f - even",N1,N2,result);
						} else {
							System.out.printf("%.0f * %.0f = %.0f - odd",N1,N2,result);
						}
					} 
					break;
				case "/":
					double result = N1 / N2;
					if(N2 !=0) {
						System.out.printf("%.0f / %.0f = %.2f",N1,N2,result);
					} else {
						System.out.printf("Cannot divide %.0f by zero",N1);
					}
					break;
				case "%":
					result = N1 % N2;
					if(N2 !=0) {
						System.out.printf("%.0f %% %.0f = %.0f", N1, N2, result);
					} else {
						System.out.printf("Cannot divide %.0f by zero",N1);
					}
					break;
			}
		
	}

}
