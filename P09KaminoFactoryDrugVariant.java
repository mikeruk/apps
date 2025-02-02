package tema12ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class P09KaminoFactoryDrugVariant {

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		 
        int dnaLength = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
 
 
        int sequenceNumber = 0;
        int bestSequenceNumber = 0;
        int bestSequenceLength = 0;
        int bestIndex = dnaLength;
        int bestSequenceSum = 0;
        int[] bestDNA = new int[dnaLength];
 
        while (!input.equals("Clone them!")){
            sequenceNumber++;
            int currentSequenceNumber = sequenceNumber;
            int[] currentDNA = Arrays.stream(input.split("!+")).mapToInt(e -> Integer.parseInt(e)).limit(dnaLength).toArray();
            int currentSequenceLength = 0;
            int currentBestSequenceLength = 0;
            int currentSequenceSum = 0;
            int currentBestIndex = 0;
 
 
 
            for (int i = 0; i < currentDNA.length; i++) {
                currentSequenceSum += currentDNA[i];
                if (currentDNA[i] == 1){
                    currentSequenceLength++;
 
                }else{
                    currentSequenceLength = 0;
                }
                if (currentSequenceLength > currentBestSequenceLength){
                    currentBestSequenceLength = currentSequenceLength;
                    currentBestIndex = i - currentSequenceLength + 1;
                }
 
            }
            if (currentBestSequenceLength > bestSequenceLength){
                bestDNA = currentDNA;
                bestSequenceLength = currentBestSequenceLength;
                bestSequenceNumber = currentSequenceNumber;
                bestIndex = currentBestIndex;
                bestSequenceSum = currentSequenceSum;
            }else if (currentBestSequenceLength == bestSequenceLength){
 
                if (currentBestIndex < bestIndex){
                    bestDNA = currentDNA;
                    bestSequenceLength = currentBestSequenceLength;
                    bestSequenceNumber = currentSequenceNumber;
                    bestIndex = currentBestIndex;
                    bestSequenceSum = currentSequenceSum;
                }else if(currentBestIndex == bestIndex){
 
                    if(currentSequenceSum > bestSequenceSum){
                        bestDNA = currentDNA;
                        bestSequenceLength = currentBestSequenceLength;
                        bestSequenceNumber = currentSequenceNumber;
                        bestIndex = currentBestIndex;
                        bestSequenceSum = currentSequenceSum;
                    }
                }
            }
 
 
            input = scanner.nextLine();
        }
 
        System.out.printf("Best DNA sample %d with sum: %d.\n",bestSequenceNumber,bestSequenceSum);
        for (int number:
             bestDNA) {
            System.out.print(number + " ");
        }

	}

}
