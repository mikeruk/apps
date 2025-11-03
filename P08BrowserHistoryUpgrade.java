package temaStackesAndQues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class P08BrowserHistoryUpgrade {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String url = scanner.nextLine();

        ArrayDeque<String> browserHistory = new ArrayDeque<>();
        ArrayDeque<String> commingUpNext = new ArrayDeque<>();

        while(!url.equals("Home")){

            switch(url){
                case "back":
                    if(browserHistory.size() < 2){
                        System.out.println("no previous URLs");
                    } else{

                        commingUpNext.offer(browserHistory.pop());
                        System.out.println(browserHistory.peek());
                    }

                    break;
                case "forward":
                    if(commingUpNext.isEmpty()){
                        System.out.println("no next URLs");
                    } else{
                        System.out.println(commingUpNext.peek());
                        browserHistory.push(commingUpNext.pop());
                    }
                    break;
                default:
                    browserHistory.push(url);
                    System.out.println(url);
                    commingUpNext.clear();

                    break;

            }

            url = scanner.nextLine();

        }


    }
}
