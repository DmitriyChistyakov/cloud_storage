import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.awt.*;
import java.net.URL;
import java.util.ResourceBundle;

public class CalcController implements Initializable {

    @FXML
    public TextField tab;
    private int left, result;

//    public CalcController() {
//    }

    public void process(ActionEvent actionEvent) {
        Button button = (Button) actionEvent.getSource();
        String type = button.getText();
        switch (type){
            case "0":
            case "1":
            case "2":
            case "3":
                tab.appendText(type);
                break;
            case "+":
                left = Integer.parseInt(tab.getText());
                tab.clear();
                break;
            case "-":
                left = Integer.parseInt(tab.getText());
                tab.clear();
                break;
            case "=":
                result = left + Integer.parseInt(tab.getText());
                tab.setText(String.valueOf(result));
        }

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
