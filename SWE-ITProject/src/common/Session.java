package common;

import java.io.Serializable;

/**
 * @author Marco Ambrosini
 * @version 1.0
 * @created 27-May-2016 1:19:58 PM
 */
public class Session implements Serializable {

	private Game game;
	/**
	 * = host
	 */
	private User host;
	private int maxPlayers;
	private String name;
	/**
	 * including Host
	 */
	private User[] players;
	public User m_User;
	public Game m_Game;

	public Session(){

	}
	/**
	 * 
	 * @param newUser
	 */
	public void addPlayer(User newUser){

	}

	/**
	 * to update mock-up accordingly
	 */
	public void closeSession(){

	}

	/**
	 * pro-memoria
	 * 
	 * @param players
	 */
	public int startGame(User[] players){
		return 0;
	}
}//end Session