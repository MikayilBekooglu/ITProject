package common;

/**
 * Nach dem der Gewinner bestimmt wurde, soll es die M�glichkeit geben eine
 * Revanche zu fordern oder zur Lobby zur�ckzukehren. Wenn ein Spieler eine
 * Revanche fordert wird dies entsprechend signalisiert. Wenn nicht alle
 * Mitspieler der Revanche innerhalb von 45sek zustimmen kehren alle zur Lobby
 * zur�ck.
 * @author Marco Ambrosini
 * @version 1.0
 * @created 27-May-2016 1:19:46 PM
 */
public class Message_RevancheFordern extends Message {

	private Session session;
	private User user;

	public Message_RevancheFordern(){

	}
}//end Message_RevancheFordern