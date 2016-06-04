package common;

/**
 * Nachricht vom Client oder Server (timout), dass der Spielzug vorbei ist, und
 * der nächste Spieler am Zug ist. Übermittelt wird der Spieler, der neu an der
 * Reihe ist.
 * @author Marco Ambrosini
 * @version 1.0
 * @created 27-May-2016 1:19:39 PM
 */
public class Message_EndTurn extends Message {

	private Dice[] activePlayer;
	/**
	 * oder Session
	 */
	private String sessionName;

	public Message_EndTurn(){

	}
}//end Message_EndTurn