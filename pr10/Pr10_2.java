import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Slider;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class Pr10_2 extends Application {
    private double velocity = 3.0;
    private double direction = 1.0;
    private boolean running = false;

    @Override
    public void start(Stage stage) {
        System.out.println("Name:_ Enr:_ ");

        BorderPane root = new BorderPane();
        root.setStyle("-fx-background-color: linear-gradient(to bottom, #ffffff, #e9f1ff);");

        Pane playArea = new Pane();
        playArea.setPrefSize(600, 360);

        Circle ball = new Circle(20, Color.DODGERBLUE);
        ball.setCenterX(40);
        ball.setCenterY(180);
        playArea.getChildren().add(ball);

        Slider speedSlider = new Slider(1, 12, velocity);
        speedSlider.setPrefWidth(220);
        speedSlider.valueProperty().addListener((observable, oldValue, newValue) -> velocity = newValue.doubleValue());

        Button startButton = new Button("Start");
        Button stopButton = new Button("Stop");

        HBox controls = new HBox(15, startButton, stopButton, speedSlider);
        controls.setAlignment(Pos.CENTER);
        controls.setPadding(new Insets(12));

        root.setCenter(playArea);
        root.setBottom(controls);

        AnimationTimer timer = new AnimationTimer() {
            @Override
            public void handle(long now) {
                double radius = ball.getRadius();
                double minX = radius;
                double maxX = Math.max(radius, playArea.getWidth() - radius);

                double nextX = ball.getCenterX() + (direction * velocity);

                if (nextX >= maxX) {
                    nextX = maxX;
                    direction = -1.0;
                } else if (nextX <= minX) {
                    nextX = minX;
                    direction = 1.0;
                }

                ball.setCenterX(nextX);

                double centerY = Math.max(radius, playArea.getHeight() / 2.0);
                ball.setCenterY(centerY);
            }
        };

        startButton.setOnAction(event -> {
            if (!running) {
                running = true;
                timer.start();
            }
        });

        stopButton.setOnAction(event -> {
            running = false;
            timer.stop();
        });

        Scene scene = new Scene(root, 600, 420);
        stage.setTitle("Practical 10.2");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}