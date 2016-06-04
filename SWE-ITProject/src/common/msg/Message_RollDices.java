package common;

/**
 * Befehl vom Client zum Rollen der Würfel, dabei wird spezifiziert welche Würfel
 * gerollt werden sollen. Der Server führt den Befehl aus und schickt das Ergebnis
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