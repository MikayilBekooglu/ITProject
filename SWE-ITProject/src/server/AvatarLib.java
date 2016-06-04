package server;
import common.Avatar;

/**
 * basically a list of all avatars
 * singleton
 * @author Marco Ambrosini
 * @version 1.0
 * @created 28-May-2016 12:03:29 PM
 */
public class AvatarLib {

	private Avatar[] avatarList;
	/**
	 * to equal pic name
	 */
	private String[] avatarNames = tbd;
	private Avatar selectedAvatar;
	private static AvatarLib singleton;

	public AvatarLib(){

	}
	/**
	 * returns AvatarList which includes all available Avatars
	 */
	public Avatar[] getAvatars(){
		return null;
	}

	public Avatar getSelectedAvatar(){
		return null;
	}

	/**
	 * creates an avatar for each name in avatarNames
	 * stores the created avatars in avatarList
	 */
	public static void init(){

	}

	public void setSelectedAvatar(){

	}
}//end AvatarLib