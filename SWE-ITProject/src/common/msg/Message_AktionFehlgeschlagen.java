package common;

/**
 * Antwort des Servers auf eine Client request, falls diese nicht ausgeführt
 * werden konnte.
 * @author Marco Ambrosini
 * @version 1.0
 * @created 27-May-2016 1:19:36 PM
 */
public class Message_AktionFehlgeschlagen extends Message {

	/**
	 * tried action
	 */
	private Msg action;
	/**
	 * Error-Msg
	 */
	private String msg;

	public Message_AktionFehlgeschlagen(){

	}
}//end Message_AktionFehlgeschlagen