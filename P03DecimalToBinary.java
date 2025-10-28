package temaStackesAndQues;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class P03DecimalToBinary {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int decimal = Integer.parseInt(scanner.nextLine());

        if(decimal == 0){
            System.out.println(decimal);
        }

        Deque<Integer> binaries = new ArrayDeque<>();

        while(decimal > 0){

            int rest = decimal % 2;
            binaries.push(rest);
            decimal /= 2;

        }

        for(int number: binaries){
            System.out.print(binaries.pop());
        }


    }

}
