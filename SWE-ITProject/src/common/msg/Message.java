package common;

/**
 * @author Marco Ambrosini
 * @version 1.0
 * @created 27-May-2016 1:20:22 PM
 */
public abstract class Message implements Serializable {

	private String client;
	private long id;
	private static long msgID = 0;
	/**
	 * final
	 */
	private static long serialVersUID = 1;
	private long timestamp;

	/**
	 * Code: <font color="#569cd6">this</font><font color="#b0b0b0"><b>.
	 * </b>id</font><font color="#808080"> </font><font
	 * color="#b0b0b0"><b>=</b></font><font color="#808080"> </font><font
	 * color="#b0b0b0"><b>-</b>1</font>
	 */
	protected Message(){

	}

	/**
	 * Code: <font color="#569cd6">return</font><font color="#808080"> </font><font
	 * color="#b0b0b0">msgID<b>++</b></font>
	 */
	private static long nxtMsgID(){
		return 0;
	}

	/**
	 * Factory method to construct a message-object from data received via socket
	 * 
	 * @return the new message object, or null in case of an error
	 * @throws Exception
	 * 
	 * Code:
	 * ObjectInputStream in = new ObjectInputStream(socket.getInputStream());
	 * Message msg = (Message) in.readObject();
	 * return msg;
	 * 
	 * @param s    The socket to read from
	 */
	public static Message receive(Socket s){
		return null;
	}

	/**
	 * Send this message, as a serialized object, over the given socket
	 * 
	 * Code:
	 * <font color="#3f9d37">// Set the message id before sending (if not already
	 * done)</font>
	 * <font color="#808080"> </font><font color="#569cd6">if</font><font
	 * color="#808080"> </font><font color="#b0b0b0"><b>(</b></font><font
	 * color="#569cd6">this</font><font color="#b0b0b0"><b>.</b>id</font><font
	 * color="#808080"> </font><font color="#b0b0b0"><b>==</b></font><font
	 * color="#808080"> </font><font color="#b0b0b0"><b>-</b>1<b>)</b></font><font
	 * color="#808080"> </font><font color="#569cd6">this</font><font
	 * color="#b0b0b0"><b>.</b>id</font><font color="#808080"> </font><font
	 * color="#b0b0b0"><b>=</b></font><font color="#808080"> </font><font
	 * color="#b0b0b0">nextMessageID<b>();</b></font>
	 * <font color="#808080">
	 * </font><font color="#808080"> </font><font color="#3f9d37">// Set the
	 * timestamp</font>
	 * <font color="#808080"> </font><font color="#569cd6">this</font><font
	 * color="#b0b0b0"><b>.</b>timestamp</font><font color="#808080"> </font><font
	 * color="#b0b0b0"><b>=</b></font><font color="#808080"> </font><font
	 * color="#b0b0b0">System<b>.</b>currentTimeMillis<b>();</b></font>
	 * <font color="#808080">
	 * </font><font color="#808080"> </font><font color="#569cd6">try</font><font
	 * color="#808080"> </font><font color="#b0b0b0"><b>{</b></font><font
	 * color="#808080"> </font><font color="#3f9d37">// Ignore IO errors</font>
	 * <font color="#808080"> </font><font
	 * color="#b0b0b0">ObjectOutputStream</font><font color="#808080"> </font><font
	 * color="#b0b0b0">out</font><font color="#808080"> </font><font
	 * color="#b0b0b0"><b>=</b></font><font color="#808080"> </font><font
	 * color="#569cd6">new</font><font color="#808080"> </font><font
	 * color="#b0b0b0">ObjectOutputStream<b>(</b>s<b>.</b>getOutputStream<b>());
	 * </b></font>
	 * <font color="#808080"> </font><font color="#b0b0b0">out<b>.
	 * </b>writeObject<b>(</b></font><font color="#569cd6">this</font><font
	 * color="#b0b0b0"><b>);</b></font>
	 * <font color="#808080"> </font><font color="#b0b0b0">out<b>.</b>flush<b>();
	 * </b></font>
	 * <font color="#808080"> </font><font color="#b0b0b0">s<b>.
	 * </b>shutdownOutput<b>();</b></font><font color="#808080"> </font><font
	 * color="#3f9d37">// ends output without closing socket</font>
	 * <font color="#808080"> </font><font color="#b0b0b0"><b>}</b></font><font
	 * color="#808080"> </font><font color="#569cd6">catch</font><font
	 * color="#808080"> </font><font color="#b0b0b0"><b>(</b>Exception</font><font
	 * color="#808080"> </font><font color="#b0b0b0">e<b>)</b></font><font
	 * color="#808080"> </font><font color="#b0b0b0"><b>{</b></font>
	 * <font color="#808080"> </font><font color="#b0b0b0"><b>}</b></font>
	 * 
	 * @param s    The socket to use when sending the message
	 */
	public void send(Socket s){

	}
}//end Message