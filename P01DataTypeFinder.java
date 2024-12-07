package tema09DataTypesAndVariablesMoreExcr;

import java.util.Scanner;

public class P01DataTypeFinder {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String input = scanner.nextLine();
		
//•Integer
//•Floating point -> sydyrja simvola .
//•Characters -> dyljina  1 i kod < 48 || kod > 57
//•Boolean -> true ili  false
//•Strings -> ako imame posledovatelnost samo ot simvoli (kod < 45 || kod > 57)
		
		while(!input.equals("END")) {
			String type = "";
			
			if(input.equalsIgnoreCase("true") || input.equalsIgnoreCase("false")) {
				type = "boolean";
			} else if(input.length() == 1) {
				char symbol = input.charAt(0);
				if(symbol < 47 || symbol > 58) {
					type = "character";
				} else {
					type = "integer";
				}
			} else {
				boolean isString = false;
				boolean isFloat = false;
				
				
				
				for(int i = 0; i <= input.length()-1; i++) {
					char currentSymbol = input.charAt(i);
					
					if(currentSymbol < 45 || currentSymbol > 57) {
						isString = true;
					} else{
						if(currentSymbol ==  46) {
							isFloat = true;
						}
					}
				}
				
				if(isString) {
					type = "string";
				} else if (isFloat) {
					type = "floating point";
				} else {
					type ="integer";
				}
			}
			
			System.out.printf("%s is %s type%n", input, type);
            input = scanner.nextLine();
		}
	}

}
