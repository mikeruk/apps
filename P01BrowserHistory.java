package temaStackesAndQues;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class P01BrowserHistory {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String url = scanner.nextLine();

        Deque<String> history = new ArrayDeque<>();


        while(!url.equals("Home")){

            if(url.equals("back")){
                if(history.size() == 1){
                    System.out.println("no previous URLs");
                } else{
                    history.pop();
                    System.out.println(history.peek());
                }
            } else {
                history.push(url);
                System.out.println(history.peek());

            }

            url = scanner.nextLine();

        }
    }

}
