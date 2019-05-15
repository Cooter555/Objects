//Author Cooter Gale
//date: 5-13-17

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.*;
import javafx.scene.shape.Polygon;
import javafx.scene.control.*;
import javafx.scene.paint.Color;
import javafx.collections.ObservableList;
import javafx.scene.shape.Circle;
import javafx.animation.*;
import javafx.util.Duration;
import javafx.scene.input.*;
import javafx.scene.media.*;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.text.*;

public class Final extends Application {
	Timeline time;
	
	String todd = Final.class.getResource("Todd.mp3").toString();
	Media media2 = new Media(todd);
	MediaPlayer mp2 = new MediaPlayer(media2);
	
	String path1 = Final.class.getResource("alarm.mp3").toString();
	Media media1 = new Media(path1);
	MediaPlayer mp1 = new MediaPlayer(media1);
		
	String path = Final.class.getResource("Bomb.mp3").toString();
	Media media = new Media(path);
	MediaPlayer mp = new MediaPlayer(media);
	
	@Override
	public void start(Stage primaryStage) {
		
		Pane pane = new Pane();
		BorderPane pane1 = new BorderPane();
		
		TextField text = new TextField("10");
		
		time = new Timeline(new KeyFrame(Duration.millis(1000), e -> {
			int count = Integer.parseInt(text.getText());
			if (count > 0) {
				count--;
				text.setText(Integer.toString(count));
			}
			else {
				mp1.play();
				mp.play();
			}
		}));
		text.setEditable(false);
		pane1.setTop(text);
		
		Circle r = new Circle(32);
		r.setFill(Color.RED);
		r.setStroke(Color.BLACK);
				
		Polygon polygon = new Polygon();
		polygon.setOpacity(0);
				
		ObservableList<Double> list = polygon.getPoints();
		
		double centerX = 250, centerY = 250;
		double radius = Math.min(500, 500) * 0.4;

		int s = 8;
		for (int i = 0; i < s; i++) {
			list.add(centerX + radius * Math.cos(2 * i * Math.PI / s)); 
			list.add(centerY - radius * Math.sin(2 * i * Math.PI / s));
		} 
		
		pane.getChildren().addAll(polygon, r, pane1);
		
		PathTransition pt = new PathTransition();
		pt.setPath(polygon);
		pt.setNode(r);
		pt.setCycleCount(Timeline.INDEFINITE);
		pt.setDuration(Duration.millis(1500));
		pt.play();
		
		time.setCycleCount(Timeline.INDEFINITE);

		mp.play();
		time.play();

		Scene scene = new Scene(pane, 500, 500);
		primaryStage.setTitle("Final");
		primaryStage.setScene(scene);
		primaryStage.show();
		
		time.setCycleCount(Timeline.INDEFINITE);
		
		r.setOnMouseClicked(e -> {
			if (e.getButton() == MouseButton.PRIMARY) {
				mp2.play();
				//mp2 will laugh at the user because either they took too long and that was funny or they got it first try because they were so mad and that is funny.
				
				pt.pause();
				//This stops the circle's movement.
				
				mp.pause();
				mp1.pause();
				//These two stop the terrible audio tracks. 
				
				System.exit(0);
				//System.exit(0); stops the program, thus saving the user from the nightmare that is this alarm.
			}
		});
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}