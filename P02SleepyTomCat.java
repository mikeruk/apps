package Tema0602ProverkiUprajnenie2;

import java.util.Scanner;

public class P02SleepyTomCat {

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		int daysOff = Integer.parseInt(scanner.nextLine());
		
		int normaIgra = 30000;
		int igraPrezPochivka = daysOff * 127;
		int netoRabotniDni = 365 - daysOff;
		int igraPrezRabotniDni = netoRabotniDni * 63;
		int minutiZaIgra = igraPrezRabotniDni + igraPrezPochivka;
		int razlikaNorma = Math.abs(minutiZaIgra - normaIgra);
		double razlikaNormaHours = Math.floor(razlikaNorma / 60.0);
		double razlikaNormaMIns = razlikaNorma % 60.0;
		
		
		if(minutiZaIgra > normaIgra) {
			System.out.println("Tom will run away");
			Math.abs(razlikaNorma);
			System.out.printf("%.0f hours and %.0f minutes more for play", Math.abs(razlikaNormaHours),razlikaNormaMIns);
		} else if(minutiZaIgra <= normaIgra) {
			System.out.println("Tom sleeps well");
			System.out.printf("%.0f hours and %.0f minutes less for play",razlikaNormaHours,razlikaNormaMIns);
		}
	}

}
