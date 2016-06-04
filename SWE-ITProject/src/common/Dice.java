package common;

/**
 * @author Marco Ambrosini
 * @version 1.0
 * @created 27-May-2016 1:19:34 PM
 */
public class Dice implements Serializable {

	private Color color;
	/**
	 * final face value of the dice
	 * should equal to the last value of rollingValues
	 * stored separately for easier use
	 */
	private int finalValue;
	/**
	 * random number of values (4 to 9) with each value ranging from 1-6, simulating a
	 * rolling dice.
	 * ggf. als Array-List zu implementieren
	 * this can be used in the GUI element to animate a rolling dice
	 */
	private in[] rollingValues;

	public Dice(){

	}
	public int getFinalValue(){
		return 0;
	}

	public int[] getRollingValues(){
		return null;
	}

	/**
	 * defines the length of rollingValues (4-9) using random and fills it with so
	 * many random values ranging from 1 to 6
	 * the last value is additionally stored in finalValue for easier use
	 */
	public int roll(){
		return 0;
	}
}//end Dice