package part2;

import java.util.Locale;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.layout.VBox;
import javafx.scene.Scene;

import javafx.scene.control.DatePicker;

public class DatePicker extends Application {
    
    private Stage stage;
    private DatePicker bodate;

    public void start(){
        this.Stage = stage;
        Stage.setTitle("BirthDate Picker");
        initUI();
        stage.show();
    }

    public void initUI(){
        VBox vbox = new VBox(20);
        vbox.setStyle("-fx-padding: 10;");

        Scene scene = new Scene(vbox, 400, 400);

    }
    
}