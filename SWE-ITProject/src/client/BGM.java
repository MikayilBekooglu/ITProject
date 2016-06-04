package client;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.TimeUnit;

import javax.swing.Timer;

import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;

/**
 * singleton
 * (Background Music)
 * @author Marco Ambrosini
 * @version 1.0
 * @created 27-May-2016 1:15:40 PM
 */
public class BGM extends MediaView {

	private String BGM_PATH = "audio/BGM/";
	private Media bgmMedia;
	private String bgmName; // incl. File-Extension
	private MediaPlayer bgmPlayer;
	private String bgmURI;
	
	private final int DEFAULT_FadeInSec = 3;
	private final int DEFAULT_FadeOutSec = 5;
	private static BGM singleton;

	public BGM(){

	}
	/**
	 * using DEFAULT_fadeOutSec:
	 * 
	 * <b>changeTrack(</b><font color="#6a3e3e"><b>newBGM</b></font><b>, </b><font
	 * color="#0000c0"><b>DEFAULT_FadeOutSec</b></font><b>)</b>
	 * 
	 * @param nameNewBGM
	 */
	public void changeTrack(String nameNewBGM){
		changeTrack(nameNewBGM, DEFAULT_FadeOutSec);
	}

	/**
	 * 
	 * @param nameNewBGM
	 * @param fadeOutSec
	 */
	public void changeTrack(String nameNewBGM, int fadeOutSec){
		
		fadeOut(fadeOutSec);
		
		/* avoid freezing GUI by using new thread since waiting for fadeOut */
		/* maybe could/should have been done by using another actionListener? */
		Thread changeTrackThread = new Thread(){
			public void run(){
				/* wait for fadeOut */
				while (bgmPlayer.getVolume() > 0) {
					try {TimeUnit.MILLISECONDS.sleep(1);} catch (InterruptedException e) {
						e.printStackTrace();
						bgmPlayer.dispose(); //clean
					}
				}	
				bgmPlayer.dispose(); //clean
				
				/* rebuild */
//				bgmPath = pathNewBGM; //with new track
//				bgmURI = new File(bgmPath).toURI().toString();
//				bgmMedia = new Media(bgmURI);
//				bgmPlayer = new MediaPlayer(bgmMedia);
//				bgmPlayer.setAutoPlay(true);
//				bgmPlayer.setOnEndOfMedia(new Runnable() {
//				       public void run() {bgmPlayer.seek(Duration.ZERO);}
//				});	
			}			
		};
		
		changeTrackThread.start();
	}

	/**
	 * 
	 * @param sec
	 */
	public void fadeOut(int sec){ 
		
		ActionListener fadeOutListener = new ActionListener(){
			private double msec = sec * 1000;
			private double fadeVolume = (1.0 / (msec/2)); //weil scheint nur jede 2. msec zu geschehen...
			
			public void actionPerformed(ActionEvent ae) {
				double currentVolume = bgmPlayer.getVolume();
				double newVolume = currentVolume - fadeVolume;
				bgmPlayer.setVolume(newVolume);	
				if (newVolume <= 0.0){ // ==0 funktioniert nicht...
					bgmPlayer.setVolume(0.0);
					((Timer)ae.getSource()).stop();
				}
				
//				/* variante mit countDown */
//				private int countDown = msec;
//				countDown--;
//				if (countDown == 0){
//					bgmPlayer.setVolume(0.0);
//					((Timer)e.getSource()).stop();
//				} 

			}
		};
		
		Timer fadeOutTimer = new Timer(1, fadeOutListener);
		fadeOutTimer.start();

//		/* approach with .sleep() causes GUI to freez! */
//		int msec = sec * 1000;
//		while (msec > 0){
//			double currentVolume = this.bgmPlayer.getVolume();
//			double newVolume = currentVolume - (1.0 / msec);
//			this.bgmPlayer.setVolume(newVolume);
//			try {TimeUnit.MILLISECONDS.sleep(1);} catch (InterruptedException e) {e.printStackTrace();}
//			msec--;
//		}
//		this.bgmPlayer.setVolume(0.0);
	}

	/**
	 * using DEFAULT_FadeOutSec
	 */
	public void fadeOut(){
		fadeOut(DEFAULT_FadeOutSec);
	}

	public static void init(){

	}
}//end BGM