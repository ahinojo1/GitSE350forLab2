package Lab2;
import javafx.*;
import java.awt.Rectangle;
import java.util.ArrayList;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.stage.Stage;
import javafx.scene.paint.*;
public class OceanExplorer extends Application {
	private int width;
	private int height;
	final int dimension = 10;
	final int scale = 50;
	
	public void drawMap() {
		for(int x = 0; x < dimension; x++) {
			for(int y = 0; y < dimension; y++) {
				Rectangle rect = new Rectangle(x*scale,y*scale,scale,scale);
				rect.setStroke(Color.BLACK);
				rect.setFill(Color.PALETURQUOISE);
				root.getChildren().add(rect);
			}
		}
	}
	
	
	@Override
	public void start(Stage oceanStage) throws Exception {
		// TODO Auto-generated method stub
		AnchorPane myPane = new AnchorPane();
		Scene scene = new Scene(myPane, width, height);
		oceanStage.setScene(scene);
		oceanStage.setTitle("ahoy");
		oceanStage.show();
		drawMap();
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}
}
