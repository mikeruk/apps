package temaStackesAndQues;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class P02SimpleCalculatorDrVariant {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        String [] input = read.nextLine().split("\\s+");
        ArrayDeque<String> numbers = new ArrayDeque<>();
        Collections.addAll(numbers,input);


        while(numbers.size()> 1) {
            int digit1 = Integer.valueOf(numbers.pop());
            String sign = numbers.pop();
            int digit2 = Integer.valueOf(numbers.pop());

            switch(sign){
                case "+":
                    numbers.push(String.valueOf(digit1 + digit2));

                    break;
                case "-":
                    numbers.push(String.valueOf(digit1 - digit2));
                    break;

            }
        }
        System.out.println(numbers.pop());



    }
}
