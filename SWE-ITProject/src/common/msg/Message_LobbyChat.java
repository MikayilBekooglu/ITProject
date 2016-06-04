package common;

/**
 * chat nachricht wird an den Server geschickt, Server schickt ein update an alle
 * Clients
 * @author Marco Ambrosini
 * @version 1.0
 * @created 27-May-2016 1:19:41 PM
 */
public class Message_LobbyChat extends Message {

	private String msg;
	private String userName;

	public Message_LobbyChat(){

	}
}//end Message_LobbyChat