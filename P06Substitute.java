package tema16onlineExamTest;

import java.util.Scanner;

public class P06Substitute {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		
		
		int k = Integer.parseInt(scanner.nextLine());
		
		int l = Integer.parseInt(scanner.nextLine());
		
		int m = Integer.parseInt(scanner.nextLine());
		
		int n = Integer.parseInt(scanner.nextLine());
		
		int count = 0;
		
		
		
		
		for(int i = k; i <= 8; i++) {
			if(count == 6) {
				break;
			}
			for(int j = 9; j >= l; j--) {
				if(count == 6) {
					break;
				}
				for(int x = m; x <= 8; x++) {
					if(count == 6) {
						break;
					}
					for(int z = 9; z >= n; z--) {
						
						
						if(i % 2 == 0 && j % 2 != 0 && x % 2 == 0 && z % 2 != 0) {
							
							if(i != x || j != z) {
								System.out.println(i+""+j+"-"+x+""+z);
								count++;
								if(count == 6) {
									break;
									
								}
							} else if(i == x && j == z) {
								System.out.println("Cannot change the same player.");
								
							}
							
						}
						
						
					}
					
					
					
				}
			}
		}
	
		
		

	}

}
