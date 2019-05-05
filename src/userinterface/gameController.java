package userinterface;

import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import threads.threadAnimation;

public class gameController {

	@FXML
	private ImageView spriteMono;
	@FXML
	private Pane panelGame;

	Image[] lados = new Image[10];

	public void initialize() {
		lados[0] = new Image("Images/lado1.png");
		lados[1] = new Image("Images/lado2.png");
		lados[2] = new Image("Images/lado3.png");
		startMove();
	}

	public void changeImage(int n) {
		spriteMono.setImage(lados[n]);
		spriteMono.setLayoutX(spriteMono.getLayoutX()+10);
	}

	public void startMove() {
		threadAnimation th = new threadAnimation(this);
		th.setDaemon(true);
		th.start();
	}
	

}
