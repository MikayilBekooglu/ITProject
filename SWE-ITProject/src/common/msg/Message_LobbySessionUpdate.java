package common;

/**
 * onButton oder regelm�ssiges update an alle Clients �ber die aktuell offenen
 * Sessions
 * @author Marco Ambrosini
 * @version 1.0
 * @created 27-May-2016 1:19:42 PM
 */
public class Message_LobbySessionUpdate extends Message {

	/**
	 * oder sessionNames als String falls sich Session nicht / nur schwer
	 * serialisieren l�sst
	 */
	private Session[] sessions;

	public Message_LobbySessionUpdate(){

	}
}//end Message_LobbySessionUpdate