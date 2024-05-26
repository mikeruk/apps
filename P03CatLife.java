package tema17onlineExam;

import java.util.Scanner;

public class P03CatLife {

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
				
		String breed = scanner.nextLine();
		String sex = scanner.nextLine();
		
		
		switch(breed) {
			case "British Shorthair":
				if(sex.equals("m")){
					int monthsH = 13*12;
					double monthsCat = monthsH / 6.00;
					System.out.printf("%.0f cat months",Math.floor(monthsCat));
				} else if(sex.equals("f")){
					double monthsH = 14*12;
					double monthsCat = monthsH / 6.00;
					System.out.printf("%.0f cat months",Math.floor(monthsCat));
				}
				break;
				
			case "Siamese":
				if(sex.equals("m")){
					int monthsH = 15*12;
					double monthsCat = monthsH / 6.00;
					System.out.printf("%.0f cat months",Math.floor(monthsCat));
				} else if(sex.equals("f")){
					int monthsH = 16*12;
					double monthsCat = monthsH / 6.00;
					System.out.printf("%.0f cat months",Math.floor(monthsCat));
				}
				break;
				
			case "Persian":
				if(sex.equals("m")){
					int monthsH = 14*12;
					double monthsCat = monthsH / 6.00;
					System.out.printf("%.0f cat months",Math.floor(monthsCat));
				} else if(sex.equals("f")){
					int monthsH = 15*12;
					double monthsCat = monthsH / 6.00;
					System.out.printf("%.0f cat months",Math.floor(monthsCat));
				}
				break;
				
			case "Ragdoll":
				if(sex.equals("m")){
					int monthsH = 16*12;
					double monthsCat = monthsH / 6.00;
					System.out.printf("%.0f cat months",Math.floor(monthsCat));
				} else if(sex.equals("f")){
					int monthsH = 17*12;
					double monthsCat = monthsH / 6.00;
					System.out.printf("%.0f cat months",Math.floor(monthsCat));
				}
				break;
			case "American Shorthair":
				if(sex.equals("m")){
					int monthsH = 12*12;
					double monthsCat = monthsH / 6.00;
					System.out.printf("%.0f cat months",Math.floor(monthsCat));
				} else if(sex.equals("f")){
					int monthsH = 13*12;
					double monthsCat = monthsH / 6.00;
					System.out.printf("%.0f cat months",Math.floor(monthsCat));
				}
			case "Siberian":
				if(sex.equals("m")){
					int monthsH = 11*12;
					double monthsCat = monthsH / 6.00;
					System.out.printf("%.0f cat months",Math.floor(monthsCat));
				} else if(sex.equals("f")){
					int monthsH = 12*12;
					double monthsCat = monthsH / 6.00;
					System.out.printf("%.0f cat months",Math.floor(monthsCat));
				}
				break;
			default:
				System.out.printf("%s is invalid cat!",breed);
				break;
		}
		
	}

}
