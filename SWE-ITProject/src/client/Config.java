package client;

import java.io.Serializable;

/**
 * Serializable class to store all user-defined settings
 * Singleton
 * @author Marco Ambrosini
 * @version 1.0
 * @created 27-May-2016 1:15:43 PM
 */
public class Config implements Serializable {

	private String avatarName;
	private String CONFIG_EXTENSION = ".conf";
	private String CONFIG_NAME = "config";
	private String CONFIG_PATH = "tbd";
	private String cssName;
	private Language language;
	private static Config singleton;

	public Config(){

	}
	/**
	 * runs loadSettings if File is existing
	 */
	public static void init(){

	}

	/**
	 * desirializes Config and changes all attributes according to the saved file
	 */
	public void loadSettings(){

	}

	/**
	 * updates all attributes in Config according to the currently selected values and
	 * serializes Config
	 */
	public void storeSettings(){

	}
}//end Config