package common;

/**
 * onButton oder regelmässiges update an alle Clients über die aktuell offenen
 * Sessions
 * @author Marco Ambrosini
 * @version 1.0
 * @created 27-May-2016 1:19:42 PM
 */
public class Message_LobbySessionUpdate extends Message {

	/**
	 * oder sessionNames als String falls sich Session nicht / nur schwer
	 * serialisieren lässt
	 */
	private Session[] sessions;

	public Message_LobbySessionUpdate(){

	}
}//end Message_LobbySessionUpdate