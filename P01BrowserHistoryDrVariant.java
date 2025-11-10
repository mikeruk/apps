package temaStackesAndQues;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.*;
import java.util.stream.Collectors;

public class P01BrowserHistoryDrVariant {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        ArrayDeque <String> stackURLs = new ArrayDeque<>();
        ArrayDeque <String> forwardsQueue = new ArrayDeque<>();

        while (!input.equals("Home")){
            if (input.equals("back")){
                if (stackURLs.size() < 2){
                    System.out.println("no previous URLs");
                }
                else {
                    String currentURL = stackURLs.pop();
                    forwardsQueue.push(currentURL);
                    System.out.println(stackURLs.peek());
                }
            }
            else if (input.equals("forward")){
                if (forwardsQueue.isEmpty()){
                    System.out.println("no next URLs");
                }
                else {
                    String currentForward = forwardsQueue.pop();
                    System.out.println(currentForward);
                    stackURLs.push(currentForward);
                }
            }
            else {
                stackURLs.push(input);
                System.out.println(input);
                forwardsQueue.clear();
            }
            input = scanner.nextLine();
        }
    }





}
