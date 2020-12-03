package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        ChoiceBox imageChoiceBox = new ChoiceBox();

        imageChoiceBox.getItems().add("brunkager");
        imageChoiceBox.getItems().add("finskbrød");
        imageChoiceBox.getItems().add("honninghjerter");
        imageChoiceBox.getItems().add("jødekager");
        imageChoiceBox.getItems().add("klejner");
        imageChoiceBox.getItems().add("peberkagehus");
        imageChoiceBox.getItems().add("peberkager");
        imageChoiceBox.getItems().add("pebernødder");
        imageChoiceBox.getItems().add("vaniljekranse");

        /*
        ChoiceBox imageChoiceBox2 = new ChoiceBox();

        imageChoiceBox.getItems().add("brunkagerOpskrift");
        imageChoiceBox.getItems().add("finskbrødOpskrift");
        imageChoiceBox.getItems().add("honninghjerterOpskrift");
        imageChoiceBox.getItems().add("jødekagerOpskrift");
        imageChoiceBox.getItems().add("klejnerOpskrift");
        imageChoiceBox.getItems().add("peberkagehusOpskrift");
        imageChoiceBox.getItems().add("peberkagerOpskrift");
        imageChoiceBox.getItems().add("pebernødderOpskrift");
        imageChoiceBox.getItems().add("vaniljekranseOpskrift");
*/
        Parent root = FXMLLoader.load(getClass().getResource("Julekager.fxml"));
        primaryStage.setTitle("Julekager");
        primaryStage.setScene(new Scene(root, 800, 600));
        primaryStage.show();
    }
}

