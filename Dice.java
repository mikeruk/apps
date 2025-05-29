package tema19ObjectsAndClasses;

import java.util.Random;

public class Dice {
		private int sides;
		
		
		public void roll() {  }

		public int sides1;
		  public int roll1() {
		    Random rnd = new Random();
		    int sides = rnd.nextInt(this.sides + 1);
		    return sides;
		  }

		  public int getSides() {

			  return 0; 
			  
			  }

		  public void setSides(int sides) {
			    this.sides = sides;
			  }
 
		  
}
