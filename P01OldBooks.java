package tema12WhileLoopUpr;

import java.util.Scanner;

public class P01OldBooks {

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		
		String favBook = scanner.nextLine();
		String book = scanner.nextLine();
		
		int count = 0;
		
		while(!book.equals(favBook)) {
			if(book.equals("No More Books")) {
				break;
			}
			book = scanner.nextLine();
			count++;
		}
		
		if(book.equals("No More Books")) {
			System.out.println("The book you search is not here!");
			System.out.printf("You checked %d books.", count);
		} else {
			System.out.printf("You checked %d books and found it.", count);
		}

	}

}
