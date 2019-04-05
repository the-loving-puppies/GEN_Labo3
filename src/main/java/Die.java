import java.util.Random;

public class Die {
	private int faceValue; // the value on the face side of the die
	private Random rand; // random nmber generator
	
	public Die() {
		faceValue = 0;
		rand = new Random();
	}
	
	/**
	 * Rolls the die, sets the face value to a new number from 1 to 6
	 */
	public void roll() {
		faceValue = rand.nextInt(5) + 1;
	}
	
	/**
	 * Returns the face value of the die
	 * 
	 * @return the face value of the die
	 */
	public int getFaceValue()
	{
		return faceValue;
	}
}
