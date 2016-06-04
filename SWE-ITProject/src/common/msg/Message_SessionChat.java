package common;

/**
 * chat nachricht wird an den Server geschickt, Server schickt ein update an alle
 * Clients der Session
 * @author Marco Ambrosini
 * @version 1.0
 * @created 27-May-2016 1:19:49 PM
 */
public class Message_SessionChat extends Message {

	private String msg;
	/**
	 * oder Session
	 */
	private String sessionName;
	/**
	 * oder User
	 */
	private String userName;

	public Message_SessionChat(){

	}
}//end Message_SessionChat