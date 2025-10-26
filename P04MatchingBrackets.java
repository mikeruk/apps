package temaStackesAndQues;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class P04MatchingBrackets {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("");

        Deque<Integer> left = new ArrayDeque<>();
        Deque<Integer> right = new ArrayDeque<>();

        for(int i = 0; i <= input.length - 1; i++){

            if(input[i].equals("(")){
                left.push(i);
            } else if(input[i].equals(")")){

                for(int k = left.pop(); k <= i; k++){
                    System.out.print(input[k]);
                }
                System.out.println();

            }

        }
    }
}
