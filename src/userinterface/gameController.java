package userinterface;

import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import threads.threadAnimation;

public class gameController {

	@FXML
	private ImageView monkeySpray;
	@FXML
	private Pane panelGame;

	Image[] moves = new Image[10];

	public void initialize() {
		moves[0] = new Image("Images/side1.png");
		moves[1] = new Image("Images/side2.png");
		moves[2] = new Image("Images/side3.png");
		startMove();
	}

	public void changeImage(int n) {
		monkeySpray.setImage(moves[n]);
		monkeySpray.setLayoutX(monkeySpray.getLayoutX()+10);
	}

	public void startMove() {
		threadAnimation th = new threadAnimation(this);
		th.setDaemon(true);
		th.start();
	}
	

}
