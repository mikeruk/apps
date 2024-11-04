package tema07DataTypesAndVariablesLab;

import java.util.Scanner;

public class P08LowerOrUpper {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		char c = scanner.nextLine().charAt(0);
		
		String s = "";
		s += c;
		if(s == s.toLowerCase()){
			System.out.println("lower-case");
		}
		
		if(s == s.toUpperCase()){
			System.out.println("upper-case");
		}

	}

}
