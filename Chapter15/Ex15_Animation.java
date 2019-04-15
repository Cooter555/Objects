import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Polygon;
import java.awt.*;
import javafx.scene.paint.Color;
import javafx.collections.ObservableList;
import javafx.scene.shape.Rectangle;
import javafx.animation.*;
import javafx.util.Duration;

public class Ex15_Animation extends Application {
	
	@Override
	public void start(Stage primaryStage) {
		Pane pane = new Pane();
		
		Rectangle r = new Rectangle(50, 29);
		r.setFill(Color.rgb(128, 255, 0));

		Polygon polygon = new Polygon();
		polygon.setFill(Color.PURPLE);
		polygon.setStroke(Color.BLACK);
		ObservableList<Double> list = polygon.getPoints();
		
		double centerX = 250, centerY = 250;
		double radius = Math.min(500, 500) * 0.4;

		
		int s = 5;
		polygon.setRotate(22.5);
		// Add points to the polygon list
		for (int i = 0; i < s; i++) {
			list.add(centerX + radius * Math.cos(2 * i * Math.PI / s)); 
			list.add(centerY - radius * Math.sin(2 * i * Math.PI / s));
		} 
		
		pane.getChildren().addAll(polygon, r);
		
		PathTransition pt = new PathTransition();
		pt.setPath(polygon);
		pt.setNode(r);
		pt.setAutoReverse(true);
		pt.setCycleCount(Timeline.INDEFINITE);
		pt.setDuration(Duration.millis(4000));
		pt.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
		pt.play();
		
		Scene scene = new Scene(pane, 500, 500);
		primaryStage.setTitle("Ex15_Animation");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}