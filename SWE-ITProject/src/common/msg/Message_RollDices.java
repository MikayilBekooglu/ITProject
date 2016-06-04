package common;

/**
 * Befehl vom Client zum Rollen der W�rfel, dabei wird spezifiziert welche W�rfel
 * gerollt werden sollen. Der Server f�hrt den Befehl aus und schickt das Ergebnis
 * an alle Clients weiter, wo dies visualisiert wird.
 * @author Marco Ambrosini
 * @version 1.0
 * @created 27-May-2016 1:19:47 PM
 */
public class Message_RollDices extends Message {

	private Dice[] dicesToRoll;
	/**
	 * oder Session
	 */
	private String sessionName;

	public Message_RollDices(){

	}
}//end Message_RollDices