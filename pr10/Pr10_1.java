import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.Random;

public class Pr10_1 extends Application {
    @Override
    public void start(Stage stage) {
        System.out.println("Name:_ Enr:_ ");

        Random random = new Random();
        VBox root = new VBox(15);
        root.setStyle("-fx-padding: 30; -fx-background-color: linear-gradient(to bottom, #f8fbff, #edf4ff);");
        root.setPrefSize(400, 400);
        root.setFillWidth(false);
        root.setAlignment(javafx.geometry.Pos.CENTER);

        for (int index = 1; index <= 5; index++) {
            Text text = new Text("Text " + index);
            text.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 22));
            text.setFill(Color.color(random.nextDouble(), random.nextDouble(), random.nextDouble(), 0.3 + (random.nextDouble() * 0.7)));
            root.getChildren().add(text);
        }

        Scene scene = new Scene(root, 400, 400);
        stage.setTitle("Practical 10.1");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}