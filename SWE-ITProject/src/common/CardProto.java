package common;

/**
 * @author Marco Ambrosini
 * @version 1.0
 * @created 27-May-2016 1:19:31 PM
 */
public class CardProto {

	private int cardID;
	private String name;
	/**
	 * transient!
	 */
	private Image picBack;
	/**
	 * transient!
	 */
	private Image picFront;
	private int valMax;
	private int valMin;

	public CardProto(){

	}
}//end CardProto