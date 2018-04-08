package colorgen;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import java.util.concurrent.ThreadLocalRandom;

public class ColorGen extends Application {
    
    @Override
    public void start(Stage window) {
        StackPane stack = new StackPane();

        Scene scene = new Scene(stack, 300, 300);
      
        int Red = ThreadLocalRandom.current().nextInt(0, 255);
        System.out.println("Red: " + Red);
        int Green = ThreadLocalRandom.current().nextInt(0, 255);
        System.out.println("Green: " + Green);
        int Blue = ThreadLocalRandom.current().nextInt(0, 255);
        System.out.println("Blue: " + Blue);
        int op = ThreadLocalRandom.current().nextInt(0, 10);
        System.out.println(op);
        double dblOp = op;
        double Opacity = dblOp/10;
        System.out.println("Opacity: " + Opacity + "\n");
        stack.setStyle("-fx-background: rgba("+ Red + ", "+ Green +", " + Blue + ", " + Opacity + "); -fx-border-size: 1; -fx-border-color: #000000;");
        
        Button btnGen = new Button("Generate Colour");
        stack.getChildren().add(btnGen);
        
        btnGen.setOnAction(e -> {
           int newRed = ThreadLocalRandom.current().nextInt(0, 255);
           System.out.println("Red: " + newRed);
           int newGreen = ThreadLocalRandom.current().nextInt(0, 255);
           System.out.println("Green: " + newGreen);
           int newBlue = ThreadLocalRandom.current().nextInt(0, 255);
           System.out.println("Blue: " + newBlue);
           int newOp = ThreadLocalRandom.current().nextInt(0, 10);
           double dblNewOp = newOp;
           double newOpacity = (dblNewOp / 10);
           System.out.println("Opacity: " + newOpacity + "\n");
           stack.setStyle("-fx-background: rgba("+ newRed + ", "+ newGreen +", " + newBlue + ", " + newOpacity + "); -fx-border-size: 1; -fx-border-color: #000000;");    
        });
        
        window.setScene(scene);
        window.setTitle("Random Colour Generator");
        window.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}