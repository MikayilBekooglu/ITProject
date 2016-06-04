package client;

import java.io.File;
import java.net.URL;

import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

/**
 * contains constants and methods used among all controllers
 * @author Marco Ambrosini
 * @version 1.0
 * @created 27-May-2016 1:15:44 PM
 */
public abstract class GUI_Controller implements Initializable {

	protected final String GRAPHICS_PATH = "graphics/";
	protected final String ICON_PATH = "graphics/icons/";
	protected static Stage primaryStage;
	protected final int SCENE_X = 1280; //1024, 800
	protected final int SCENE_Y = 960; //768, 600, x*0.75

	public GUI_Controller(){

	}
	/**
	 * use this to change the primary scene
	 * 
	 * @param fxml
	 * @param controller
	 */
	protected void goToScene(String fxml, GUI_Controller controller){
		try {
			URL guiPath = getClass().getResource(fxml);
			FXMLLoader guiLoader = new FXMLLoader(guiPath);
			guiLoader.setController(controller);
			Parent root = guiLoader.load();
			Scene scene = new Scene(root, primaryStage.getScene().getWidth(), primaryStage.getScene().getHeight());			
			primaryStage.setScene(scene);
			primaryStage.show();			
		} catch (Exception e) {e.printStackTrace();}
	}

	/**
	 * 
	 * @param iconName
	 * @param title
	 * @param bgmName
	 */
	protected void preInitialize(String iconName, String title, String bgmName){
		Image windowIcon = new Image(new File(ICON_PATH+iconName).toURI().toString());
		primaryStage.getIcons().clear();
		primaryStage.getIcons().add(windowIcon);
//		if (primaryBGM == null) {primaryBGM = new Bgm(BGM_PATH+bgmName);} 
//		else {primaryBGM.changeTrack(BGM_PATH+bgmName);}
	}
}//end GUI_Controller