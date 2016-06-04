package common;

import java.io.Serializable;

/**
 * @author Marco Ambrosini
 * @version 1.0
 * @created 27-May-2016 1:19:30 PM
 */
public class Card extends CardProto implements Serializable {

	private CardProto card;
	private Player owner;
	private int valFinal;

	public Card(){

	}
	/**
	 * 
	 * @param cardID
	 */
	public Card(int cardID){

	}

	/**
	 * 
	 * @param cardProto
	 */
	public Card(CardProto cardProto){

	}

	public int calcValue(){
		return 0;
	}

	/**
	 * 
	 * @param owner
	 */
	public void setOwner(Player owner){

	}
}//end Card