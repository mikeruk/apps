package temaStackesAndQues;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P07MathPotato {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<String> names = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());
        int burningToss = Integer.parseInt(scanner.nextLine());
        int index = 0;
        int toss = 1;
        int cycle = 1;
        ArrayDeque<String> wasted = new ArrayDeque<>();
        while (names.size() > 0) {
            if(names.size()==1){
                wasted.offer("Last is "+ names.get(0));
                break;
            }
            if (toss == burningToss) {
                toss = 1;
                boolean isCyclePrime = true;
                for (int i = 2; i < cycle; i++) {
                    if (cycle % i == 0) {
                        isCyclePrime = false;
                        break;
                    }
                }
                if (cycle==1) isCyclePrime=false;
                if (isCyclePrime) {
                    wasted.offer("Prime " + names.get(index));
                } else {
                    wasted.offer("Removed "+names.get(index));
                    names.remove(index);
                }
                cycle++;
            } else {
                toss++;
                index++;
            }
            if (index == names.size()) index = 0;
        }
        while (!wasted.isEmpty()) {
            System.out.println(wasted.poll());
        }
    }
}
