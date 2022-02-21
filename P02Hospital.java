package tema10ForLoopUpr2;

import java.util.Scanner;

public class P02Hospital {

	public static void main(String[] args) {
		
	
		
		Scanner scanner = new Scanner(System.in);
		
		int days = Integer.parseInt(scanner.nextLine());
		
		int doctors = 7;
		
		int treatedPtotal = 0;
		int treatedPsoFar = 0;	
		
		int untreatedPtotal = 0;
		int untreatedPsoFar = 0;
		
		
		
		for(int i = 1; i <= days; i++) {
			
			int currentPatients = Integer.parseInt(scanner.nextLine());
			
			if(i % 3 == 0) {
				
				if(untreatedPtotal > doctors) {
					doctors++;
				}
			}
			
			if(currentPatients < doctors) {
				int doctorsMatch;
				
				for(doctorsMatch = 1; doctorsMatch <= currentPatients; doctorsMatch++) {
					int treatedPsoFarHere = 0;
					treatedPsoFarHere++;
					treatedPtotal +=  treatedPsoFarHere;
				} 
			} else {
				treatedPsoFar = doctors;
				treatedPtotal +=  treatedPsoFar;
				untreatedPsoFar = currentPatients - doctors;
				untreatedPtotal += untreatedPsoFar;
			}
		}
		System.out.printf("Treated patients: %d.%n",treatedPtotal);
		System.out.printf("Untreated patients: %d.",untreatedPtotal);
		
	}

}
