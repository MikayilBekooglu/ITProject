package client;

/**
 * singleton
 * @author Marco Ambrosini
 * @version 1.0
 * @created 27-May-2016 1:16:00 PM
 */
public class Translator {

	/**
	 * holds all descriptions in German
	 */
	private String[] deLib;
	/**
	 * holds all descriptions in English
	 */
	private String[] enLib;
	private Language selectedLanguage = Language.EN;
	private static Translator singleton;

	public Translator(){

	}
	/**
	 * Strings are supposed to be stored as a Code and then decoded into the selected
	 * language with this method.
	 * 
	 * gets the description of the code at index=cd
	 * 
	 * @param cd
	 * @param lang
	 */
	public String decode(int cd, Language lang){
		return "";
	}

	/**
	 * Strings are supposed to be stored as a Code and then decoded into the selected
	 * language with this method.
	 * 
	 * gets the description of the code at index=cd
	 * uses the selected language of the Translator as default
	 * 
	 * Code:
	 * switch selectedLanguage
	 * case EN enLib[cd]
	 * case DE deLib[cd]
	 * 
	 * @param cd
	 */
	public String decode(int cd){
		return "";
	}

	public Language getSelectedLanguage(){
		return null;
	}

	public static void init(){

	}

	public static void setSelectedLanguage(){

	}
}//end Translator