package tema14MethodsLab;

import java.util.Scanner;

public class P09GreaterOfTwoValues {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String input = scanner.nextLine();
		
		String firstStr = "";
		String secondStr = "";
		
		char firstChar;
		char secondChar;
		
		int firstNum = 0;
		int secondNum = 0;
		
		
		if(input.equals("int")){
			firstNum = Integer.parseInt(scanner.nextLine());
			secondNum = Integer.parseInt(scanner.nextLine());
			int result = getMax(firstNum, secondNum);
			System.out.println(result);
			
		} else if(input.equals("string")) {
			firstStr = scanner.nextLine();
			secondStr = scanner.nextLine();
			String result = getMax(firstStr, secondStr);
			System.out.println(result);
			
		} else if(input.equals("char")) {
			firstChar = scanner.nextLine().charAt(0);
			secondChar = scanner.nextLine().charAt(0);
			char result = getMax(firstChar, secondChar);
			System.out.println(result);
		}
		
		
}
	
	
	
	public static String getMax(String first, String second) {
		if(first.compareTo(second) >= 0){
			return first;
		} else {
			return second;
		}
		
	}
	
	public static int getMax(int first, int second) {
		if(first > second) {
			return first;
		} else {
			return second;
		}
		
	}
	
	public static char getMax(char first,char second) {
		if(first > second) {
			return first;
		} else {
			return second;
		
		}

	
	}

}
