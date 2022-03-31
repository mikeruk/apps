package tema10ForLoopUpr2;

public class P10Clock2 {

	public static void main(String[] args) {
		
		for(int i = 0; i < 24; i++) {
					
					for(int x = 0; x < 60; x++) {
						for(int y = 0; y < 60; y++) {
							System.out.printf("%d:%d:%d%n", i, x, y);
						}
					}
				}
				
		

	}

}
