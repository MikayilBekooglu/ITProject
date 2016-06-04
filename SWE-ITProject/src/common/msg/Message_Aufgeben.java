package common;

/**
 * Nachricht an den Server, dass man aufgibt oder das Fenster geschlossen wurde.
 * @author Marco Ambrosini
 * @version 1.0
 * @created 27-May-2016 1:19:38 PM
 */
public class Message_Aufgeben extends Message {

	private Player player;
	private boolean rageQuit;
	private Session session;
	private boolean surrendered;

	public Message_Aufgeben(){

	}
}//end Message_Aufgeben