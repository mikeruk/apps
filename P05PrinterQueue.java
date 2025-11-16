package temaStackesAndQues;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class P05PrinterQueue {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        ArrayDeque<String> printers = new ArrayDeque<>();

        while(!input.equals("print")){

            switch (input){
                case "cancel":
                    if(printers.isEmpty()){
                        System.out.println("Printer is on standby");
                    } else{
                        System.out.println("Canceled "+printers.poll());
                    }
                    break;
                default:
                    printers.offer(input);
                    break;
            }

            input = scanner.nextLine();

        }

        for(String printer: printers){
            System.out.println(printer);
        }
    }
}
