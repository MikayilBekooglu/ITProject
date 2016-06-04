package common;

import java.io.File;

import javafx.scene.image.Image;

/**
 * @author Marco Ambrosini
 * @version 1.0
 * @created 27-May-2016 1:19:29 PM
 */
public class Avatar {

	public final String AVATAR_EXTENSION = ".png";
	/**
	 * path where all avatar pictures are stored
	 */
	public final String AVATAR_PATH = "graphics/avatars/";
	/**
	 * to equal pic name
	 */
	private String name;
	private Image pic;

	public Avatar(){

	}
	/**
	 * 
	 * @param name
	 */
	public Avatar(String name){

	}

	/**
	 * uses AVATAR_PATH+this.avatarName+PIC_EXTENSION to load the picture of the
	 * avatar into an Image class:
	 */
	public void loadPic(){
		AVATAR_PATH.concat(this.name + AVATAR_EXTENSION);
		String picURI = new File(this.AVATAR_PATH).toURI().toString(); 
		this.pic = new Image(picURI);
	}
}//end Avatar