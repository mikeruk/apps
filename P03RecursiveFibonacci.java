package tema12ArraysExerciseMore;

import java.util.Scanner;

public class P03RecursiveFibonacci {

	public static void main(String[] args) {
		
		
		Scanner inputReader = new Scanner(System.in);
        double n = Double.parseDouble(inputReader.nextLine());

        if (n==1){
            System.out.println(1);
        }else if (n>1&&n<=50) {
            double a = 1;
            double b = 1;
            for (int i = 1; i <= n-1; i++) {
                a = a + b;
                double test = b;
                b = a;
                a = test;
           //     System.out.printf("%.0f\n",a);
            }
            System.out.printf("%.0f",a);
        }else if (n==0){
            System.out.println(0);
        }

	}

}
