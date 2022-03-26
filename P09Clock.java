package tema10ForLoopUpr2;

import java.util.Scanner;

public class P09Clock {

	public static void main(String[] args) {
		
		
		for(int i = 0; i < 24; i++) {
			for(int x = 0; x < 60; x++) {
				System.out.printf("%d:%d%n", i, x);
			}
		}
	}
}
