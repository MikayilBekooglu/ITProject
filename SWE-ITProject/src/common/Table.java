package common;

import java.io.Serializable;

/**
 * @author Marco Ambrosini
 * @version 1.0
 * @created 27-May-2016 1:19:59 PM
 */
public class Table implements Serializable {

	private card[] cardSet;

	public Table(){

	}
	/**
	 * instantiates Cards to generate a complete came set
	 * uses Cards.getCards to itereate through each CardProto and create the
	 * respective Card
	 * stores the result into cardSet
	 */
	public void initCardSet(){

	}
}//end Table