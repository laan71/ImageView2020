package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;



public class Controller {


    @FXML
    private ChoiceBox billederChoiceBox;

    @FXML
    private TextField filnavnTextField;

    @FXML
    private Button indlæsKnap;

    @FXML
    private ImageView fotoImageView;


    @FXML
    private ChoiceBox opskrifterChoiceBox;

    @FXML
    private TextField filnavnTextField2;

    @FXML
    private Button indlæsKnap2;

    @FXML
    private ImageView fotoImageView2;


    @FXML
    void visbillede(ActionEvent event) {

        String billede = (String) billederChoiceBox.getValue();
        System.out.println("Viser " + billede);

        if (!billede.isEmpty() || !billede.isBlank()) {
            String filnavn = billede + ".jpg";
            filnavnTextField.setText(filnavn);
            Image image = new Image("billeder/" + filnavn);
            fotoImageView.setImage(image);

        }
    }

    @FXML
    void visopskrift(ActionEvent actionEvent) {

        String opskrift = (String) opskrifterChoiceBox.getValue();
        System.out.println("Viser " + opskrift);

        if (!opskrift.isEmpty() || !opskrift.isBlank()) {
            String filnavn = opskrift + ".jpg";
            filnavnTextField2.setText(filnavn);
            Image image = new Image("opskrifter/" + filnavn);
            fotoImageView2.setImage(image);

        }
    }
}