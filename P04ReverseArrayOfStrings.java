package tema11ArraysLab;

import java.util.Arrays;
import java.util.Scanner;

public class P04ReverseArrayOfStrings {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String[] s = scanner.nextLine().split(" ");
		
		for(int i = 0; i < s.length/2; i++) {
			String temp = s[i];
			s[i] = s[s.length - 1 - i];
			s[s.length - 1 - i] = temp;
		}
		
		System.out.println(String.join(" ", s));
		
	}

}
