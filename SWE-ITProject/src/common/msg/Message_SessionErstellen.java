package common;

/**
 * @author Marco Ambrosini
 * @version 1.0
 * @created 27-May-2016 1:19:50 PM
 */
public class Message_SessionErstellen extends Message {

	/**
	 * oder hostName fall sich User nur schwer/nicht serialisieren lässt
	 */
	private User host;
	private Int maxPlayers;
	private String sessionName;

	public Message_SessionErstellen(){

	}
}//end Message_SessionErstellen