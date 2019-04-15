//Author Cooter Gale


import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.control.Button;
import javafx.scene.shape.Circle;
import javafx.scene.paint.Color;
import javafx.event.*;

public class Exercise15_03 extends Application {
		@Override
		public void start(Stage primaryStage) {
			// pane for circle
			Pane pane = new Pane();
			Circle circle = new Circle(20);
			circle.setFill(Color.rgb(75, 0, 130));
			circle.setStroke(Color.YELLOW);
			pane.getChildren().add(circle);
			
			// hbox for buttons
			HBox box = new HBox(5);
			Button left = new Button("Left");
			Button right = new Button("Right");
			Button up = new Button("Up");
			Button down = new Button("Down");
			box.getChildren().addAll(left, right, up, down);
			// GridPane for pane and hbox
			BorderPane border = new BorderPane();
			border.setCenter(pane);
			border.setBottom(box);
			
			//Create Scene add it to stage
			Scene scene = new Scene(border, 300, 150);
			primaryStage.setTitle("Exercise15_03");
			primaryStage.setScene(scene);
			primaryStage.show();
			
			left.setOnAction(e -> {
				if (circle.getCenterX() - 10 >= circle.getRadius()) {
					circle.setCenterX(circle.getCenterX() - 10);
				}
				else {
					circle.setCenterX(circle.getRadius());
				}
			});
			
			right.setOnAction(e -> {
				if (circle.getCenterX() + 10 <= (scene.getWidth() - circle.getRadius())) {
					circle.setCenterX(circle.getCenterX() + 10);
				}
				else {
					circle.setCenterX(scene.getWidth() - circle.getRadius());
				}
			});
			up.setOnAction(e -> {
				if (circle.getCenterY() - 10 >= circle.getRadius()) {
					circle.setCenterY(circle.getCenterY() - 10);
				}
				else {
					circle.setCenterY(circle.getRadius());
				}
			});
			
			down.setOnAction(e -> {
				if (circle.getCenterY() + 10 <= (scene.getHeight() - circle.getRadius())) {
					circle.setCenterY(circle.getCenterY() + 10);
				}
				else {
					circle.setCenterY(scene.getHeight() - circle.getRadius());
				}
			});

		}
		
	
	public static void main(String[] args) {
		Application.launch(args);
	}
}