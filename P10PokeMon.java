package tema09DataTypesAndVariablesExercise;

import java.util.Scanner;

public class P10PokeMon {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
	      
		int pokePower = Integer.parseInt(scanner.nextLine());
        int distance = Integer.parseInt(scanner.nextLine());
        int exhaustionFactor = Integer.parseInt(scanner.nextLine());

        int currentPokePower = pokePower;
        int targetsCount = 0;

        while (currentPokePower >= distance)
        {
            currentPokePower -= distance;
            targetsCount++;

            if (currentPokePower == pokePower * 0.5 && exhaustionFactor != 0)
            {
                currentPokePower /= exhaustionFactor;
            }
        }

        System.out.println(currentPokePower);
        System.out.println(targetsCount);

	}

}
