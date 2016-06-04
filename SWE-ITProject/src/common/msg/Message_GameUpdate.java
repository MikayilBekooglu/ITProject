package common;

/**
 * Nach jeder relevanten Aktion sendet der Server eine Nachricht an alle Clients
 * der Session mit einem Update des Punktestands, der gehaltenen Karten und der
 * verbleibenden Karten. Dafür wird das gesamte Game-Objekt verschickt. Der
 * Controller muss das GUI muss die Änderungen entsprechend visualisieren.
 * @author Marco Ambrosini
 * @version 1.0
 * @created 27-May-2016 1:19:40 PM
 */
public class Message_GameUpdate extends Message {

	private Game game;
	/**
	 * oder Session
	 */
	private String sessionName;

	public Message_GameUpdate(){

	}
}//end Message_GameUpdate