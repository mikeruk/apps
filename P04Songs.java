package tema19ObjectsAndClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P04Songs {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int n = Integer.parseInt(scanner.nextLine());
		
		List<Song> playList =  new ArrayList<>();
		
		
		for(int i = 1; i <= n; i++) {
			String input = scanner.nextLine();
			
			String[] info = input.split("_");
			String typeList = info[0];
			String name = info[1];
			String time = info[2];
			
			Song currentSong = new Song(typeList, name, time);
			
			playList.add(currentSong);
		}
		
		String type = scanner.nextLine();
		
		if("all".equals(type)){
			for(Song song: playList) {
				System.out.println(song.getName());
			}
		} else {
			for(Song song: playList) {
				if(song.getTypeList().equals(type)) {
					System.out.println(song.getName());
				}
			}
			
		}
		


		for(int i = 0; i <= playList.size()-1; i++) {
			
			if(playList.get(i).equals(type)) {
				System.out.print(playList.get(i).toString());
			}
			
		}
		
		//System.out.print(playList);
		
		
	}
	
	
	
	
	
	
	static class Song{
		private String typeList;
		private String name;
		private String time;
		
		public Song(String typeList, String name, String time){
			this.typeList = typeList;
			this.name = name;
			this.time = time;
		}
		
		public String getTypeList() {
			
			return typeList;
		}
		
		public void setTypeList(String typeList) {
			this.typeList = typeList;
		}
		
		public String getName() {
			return name;
		}
		
		public String toString() {
			this.typeList = typeList;
			this.name = name;
			this.time = time;
			//return this.toString();
			return this.typeList + " " + this.name + " " + this.time;
		}
		
	}
	
	
	
}
