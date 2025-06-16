package tema21ObjectsAndClassesExerciseMore;
import java.util.Scanner;
public class P02ArticlesDrVariant {
	

	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        String input = scanner.nextLine();
	        String[] article = input.split("[,]{1}[\\s]?");
	        String title = article[0];
	        String content = article[1];
	        String author = article[2];

	        Articles currentArticle = new Articles(title, content, author);

	        int num = Integer.parseInt(scanner.nextLine());
	        for (int i = 1; i <= num; i++) {
	            String newInput = scanner.nextLine();
	            String[] newArticle = newInput.split("[,]{1}[\\s]?");
	            String command = newArticle[0];
	            String contentCommand = newArticle[1];

	            if (command.equals("Edit")) {
	                currentArticle.setContent(contentCommand);
	            } else if (command.equals("ChangeAuthor")) {
	                currentArticle.setAuthor(contentCommand);
	            } else if (command.equals("Rename")) {
	                currentArticle.setTitle(contentCommand);
	            }
	        }
	        System.out.print(currentArticle.toString());
	    }
	
	    public static class Articles {
	   	 String title;
	   	    String content;
	   	    String author;

	   	    public Articles(String title, String content, String author) {
	   	        this.title = title;
	   	        this.content = content;
	   	        this.author = author;
	   	    }

	   	    public void setTitle(String title) {
	   	        this.title = title;
	   	    }

	   	    public void setContent(String content) {
	   	        this.content = content;
	   	    }

	   	    public void setAuthor(String author) {
	   	        this.author = author;
	   	    }

	   	    public String toString() {
	   	        return this.title + " - " + this.content + ":  " + this.author;
	   	    }
	   	}
	    
	    
}
