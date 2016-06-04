package common;

/**
 * @author Marco Ambrosini
 * @version 1.0
 * @created 27-May-2016 1:19:35 PM
 */
public class Game implements Serializable {

	/**
	 * init = p1
	 * derived by endTurn()
	 */
	private Player activePlayer;
	private Dice diceBlack1;
	private Dice diceBlack2;
	private Dice diceRed1;
	private Dice diceRed2;
	private Dice diceWhite1;
	private Dice diceWhite2;
	private Player player1;
	private Player player2;
	private Player player3;
	private Player player4;
	/**
	 * contains p1-4
	 */
	private Player[] players;
	private Table table;
	public Table m_Table;
	public Player m_Player;
	public Dice m_Dice;

	public Game(){

	}
	/**
	 * runs for each user : players -> Player(user)
	 * 
	 * @param session
	 * @param players
	 */
	public Game(Session session, User[] players){

	}

	/**
	 * gets the next Player from "players" and stores it in "activePlayer"
	 */
	public static void endTurn(){

	}
}//end Game