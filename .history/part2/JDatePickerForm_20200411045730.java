package part2;

import java.util.Locale;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
//import javafx.scene.control.DatePicker;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class JDatePickerForm extends Application {
 
    private Stage stage;
    
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        launch(args);
    }
 
    @Override
    public void start(Stage stage) {
        this.stage = stage;
        initUI();
        stage.show();
    }
 
    private void initUI() {
        VBox vbox = new VBox(20);
        vbox.setStyle("-fx-padding: 10;");
        Scene scene = new Scene(vbox, 400, 400);
        stage.setScene(scene);

        //checkInDatePicker = new DatePicker();

        GridPane gridPane = new GridPane();
        gridPane.setHgap(10);
        gridPane.setVgap(10);

        Label checkInlabel = new Label("Check-In Date:");
        gridPane.add(checkInlabel, 0, 0);

        GridPane.setHalignment(checkInlabel, HPos.LEFT);
        //gridPane.add(checkInDatePicker, 0, 1);
        vbox.getChildren().add(gridPane);
    }
}