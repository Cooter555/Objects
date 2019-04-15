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
import javafx.scene.input.*;

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
		
		FadeTransition ft = new FadeTransition(Duration.millis(2000), r);
		ft.setFromValue(0);
		ft.setToValue(1);
		ft.setCycleCount(Timeline.INDEFINITE);
		ft.setAutoReverse(true);
		ft.play();
		
		FadeTransition ft1 = new FadeTransition(Duration.millis(1000), polygon);
		ft1.setFromValue(0);
		ft1.setToValue(1);
		ft1.setCycleCount(Timeline.INDEFINITE);
		ft1.setAutoReverse(true);
		
		
		
		Scene scene = new Scene(pane, 500, 500);
		primaryStage.setTitle("Ex15_Animation");
		primaryStage.setScene(scene);
		primaryStage.show();
		
		r.setOnMouseClicked(e -> {
			if (e.getButton() == MouseButton.PRIMARY) {
				pt.pause();
				ft.pause();
				ft1.play();
				System.out.println("Animation Pause");
			}
			else if (e.getButton() == MouseButton.SECONDARY) {
				pt.play();
				ft.play();
				ft1.pause();
				System.out.println("Animation Resume");
			}
		});
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}