package tema15MethodsExerciseMoreExc;

import java.util.Scanner;

public class P05MultiplicationSign {

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		
		int n1 = Integer.parseInt(scanner.nextLine());
		
		int n2 = Integer.parseInt(scanner.nextLine());
		
		int n3 = Integer.parseInt(scanner.nextLine());

		checkValue(n1, n2, n3);
	}
	
	public static void checkValue(int n1, int n2, int n3) {
		
		if (n1==0 || n2==0 || n3==0)
        {
            System.out.println("zero");
        }

        else if ((n1>0 && n2>0 && n3>0) || (n1<0 && n2<0 && n3>0) || (n1<0 && n2>0 && n3<0) || (n1>0 && n2<0 && n3<0))
        {
        	System.out.println("positive");
        }
        else
        {
        	System.out.println("negative");
		
	}

}
}
