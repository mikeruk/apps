package tema21ObjectsAndClassesExerciseMore;

import java.util.Scanner;

public class P02Articles {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String[] arr = sc.nextLine().split(",\\s+");
		int n = Integer.parseInt(sc.nextLine());

		Article article = new Article(arr[0], arr[1], arr[2]);

		for (int i = 0; i < n; i++) {
			arr = sc.nextLine().split(": ");

			switch (arr[0]){
				case "Edit":
					article.edit(arr[1]);
					break;

				case "ChangeAuthor":
					article.changeAuthor(arr[1]);
					break;

				case "Rename":
					article.rename(arr[1]);
					break;
			}
		}

		System.out.println(article.toString());
	}

	public static class Article {
		private String title;
		private String content;
		private String author;

		public Article(String title, String content, String author){
			this.author = author;
			this.content = content;
			this.title = title;
		}

		public void edit(String content){
			this.content = content;
		}

		public void changeAuthor(String author){
			this.author = author;
		}

		public void rename(String title){
			this.title = title;
		}

		@Override
		public String toString(){
			String result = String.format("%s - %s: %s",
					this.title, this.content, this.author);
			return result;
		}
	}

}
