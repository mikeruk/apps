package temaStackesAndQues;

import java.util.*;
import java.util.stream.Collectors;

public class P02SimpleCalculator {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");


        Deque<Integer> numbers = new ArrayDeque<>();

        numbers.push(Integer.parseInt(input[0]));
        int num = 0;
        String nn = "";
        Deque<String> numbers1 = new ArrayDeque<>();
        Collections.addAll(numbers1 , input);
        for(int i = 0; i < input.length-1; i+=2){

            if(input[i+1].equals("+")){
                numbers.push(Integer.parseInt(input[i+2]));

            } else {
                if(Integer.parseInt(input[i+2]) > Integer.parseInt(input[i])){
                    numbers.pop();
                    numbers.push(Integer.parseInt(input[i]) - Integer.parseInt(input[i+2]));
                } else {
                    num = numbers.pop();
                    numbers.push(num - Integer.parseInt(input[i+2]));

                }
            }

        }

        num = Arrays.stream(numbers.toArray()).mapToInt(e -> (int) e).sum();

        System.out.println(num);

    }

}
