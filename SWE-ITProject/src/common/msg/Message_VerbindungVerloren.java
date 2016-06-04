package common;

/**
 * Nachricht vom Server an alle übrigen Mitspieler, dass ein Client nicht mehr
 * erreicht werden kann oder dieser die Verbindung beendet hat.
 * @author Marco Ambrosini
 * @version 1.0
 * @created 27-May-2016 1:19:53 PM
 */
public class Message_VerbindungVerloren extends Message {

	private boolean connectionLost;
	private Player player;
	private boolean rageQuit;
	private boolean surrendered;

	public Message_VerbindungVerloren(){

	}
}//end Message_VerbindungVerloren