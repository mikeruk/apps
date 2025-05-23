package tema17ListsMoreExercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P01MessagingDrVariant {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

        List<Integer> symbols = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        List<Character> string = new ArrayList<>();
        String inputString = scanner.nextLine();
        for (int i = 0; i < inputString.length(); i++) {
            string.add(inputString.charAt(i));
        }

        String output="";
        for (int i = 0; i < symbols.size(); i++) {
            int index=0;
            for (int j = 0; j < symbols.get(i).toString().length(); j++) {
                index+=Integer.parseInt(String.valueOf(symbols.get(i).toString().charAt(j)));
            }
            output+=string.get(index%string.size());
            string.remove(index%string.size());
        }
        System.out.println(output);
		
		

	}

}
