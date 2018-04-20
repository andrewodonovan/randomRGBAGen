package colorgen;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import java.util.concurrent.ThreadLocalRandom;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;

public class ColorGen extends Application {
    
    @Override
    public void start(Stage window) {
        BorderPane border = new BorderPane();

        Scene scene = new Scene(border, 300, 300);
      
        int Red = ThreadLocalRandom.current().nextInt(0, 255);
        System.out.println("Red: " + Red);
        int Green = ThreadLocalRandom.current().nextInt(0, 255);
        System.out.println("Green: " + Green);
        int Blue = ThreadLocalRandom.current().nextInt(0, 255);
        System.out.println("Blue: " + Blue);
        int op = ThreadLocalRandom.current().nextInt(5, 10);
        System.out.println(op);
        double dblOp = op;
        double Opacity = dblOp/10;
        System.out.println("Opacity: " + Opacity + "\n");
        border.setStyle("-fx-background: rgba("+ Red + ", "+ Green +", " + Blue + ", " + Opacity + "); -fx-border-size: 1; -fx-border-color: #000000;");
        
        Button btnGen = new Button("Generate Colour");
        border.setCenter(btnGen);
        
        btnGen.setOnAction(e -> {
           int newRed = ThreadLocalRandom.current().nextInt(0, 255);
           System.out.println("Red: " + newRed);
           int newGreen = ThreadLocalRandom.current().nextInt(0, 255);
           System.out.println("Green: " + newGreen);
           int newBlue = ThreadLocalRandom.current().nextInt(0, 255);
           System.out.println("Blue: " + newBlue);
           int newOp = ThreadLocalRandom.current().nextInt(5, 10);
           double dblNewOp = newOp;
           double newOpacity = (dblNewOp / 10);
           System.out.println("Opacity: " + newOpacity + "\n");
           border.setStyle("-fx-background: rgba("+ newRed + ", "+ newGreen +", " + newBlue + ", " + newOpacity + "); -fx-border-size: 1; -fx-border-color: #000000;");    
        });
        
        
        Button btnLike = new Button();
        HBox hboxBtnLike = new HBox(btnLike);
        Image imgLike = new Image("/res/like.png");
        btnLike.setGraphic(new ImageView(imgLike));
        hboxBtnLike.setPadding(new Insets(0, 0, 20, 0));
        
        Button btnDislike = new Button();
        HBox hboxBtnDislike = new HBox(btnDislike);
        Image imgDislike = new Image("/res/dislike.png");
        btnDislike.setGraphic(new ImageView(imgDislike));
        hboxBtnDislike.setPadding(new Insets(0, 0, 20, 30));
        
        HBox hboxButtons = new HBox(hboxBtnLike, hboxBtnDislike);
        hboxButtons.setAlignment(Pos.TOP_CENTER);
        border.setBottom(hboxButtons);
        window.setScene(scene);
        window.setTitle("Random Colour Generator");
        window.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}