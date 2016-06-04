package common;

import java.io.Serializable;

/**
 * created on login
 * @author Marco Ambrosini
 * @version 1.0
 * @created 27-May-2016 1:20:00 PM
 */
public class User implements Serializable {

	/**
	 * created by loadAvatar
	 * 
	 * transient
	 */
	private Avatar avatar;
	/**
	 * saved in DB
	 */
	private String avatarName;
	private int games;
	private int lost;
	private String nickname;
	private String password;
	private int won;

	public User(){

	}
	public Avatar getAvatar(){
		return null;
	}

	public String getNickname(){
		return "";
	}

	/**
	 * using avatarName (refactor)
	 */
	public Avatar loadAvatar(){
		return null;
	}

	public String setAvatar(){
		return "";
	}

	public String setNickname(){
		return "";
	}
}//end User