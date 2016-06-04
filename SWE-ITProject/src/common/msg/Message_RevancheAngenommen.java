package common;

/**
 * Nachricht dass alle Spieler eine Revanche fordern - ein neues Spiel wird
 * aufgebaut und übermittelt
 * @author Marco Ambrosini
 * @version 1.0
 * @created 27-May-2016 1:19:45 PM
 */
public class Message_RevancheAngenommen extends Message {

	private Game revanche;
	private Session session;

	public Message_RevancheAngenommen(){

	}
}//end Message_RevancheAngenommen