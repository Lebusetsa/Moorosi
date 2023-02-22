package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class Controller {

    public Label Number;
    @FXML
    private Button ClearBT;

    @FXML
    private Button DecreaseBT;

    @FXML
    private Button ExitBT;

    @FXML
    private Button IncreaseBT;

    int number=0 ;

    @FXML


    void CloseWindow(ActionEvent event) {

      //close window button
        Stage stage = (Stage) ExitBT.getScene().getWindow();
        stage.close();
    }

    @FXML
    void DecreaseNumber(ActionEvent event) {
        //This button increase the number by 1
        Number.setText(String.valueOf(number-=1));

    }

    @FXML
    void IncreaseNumber(ActionEvent event) {
        //this button decrease the number by 1
        Number.setText(String.valueOf(number+=1));

    }

    @FXML
    void Reset(ActionEvent event) {
         // clear the number and reset it to 0
          Number.setText(String.valueOf(number=0));
    }

}
