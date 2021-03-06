package Quiz;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.io.IOException;

public class Stage01Controller {
    //Starting Point of the FXML Graphic, three different buttons are existing

    @FXML
    private Button quitGameButton;

    public void onPlayGameButtonClick(ActionEvent actionEvent) throws IOException {
        MainStageController.onPlayGameButtonClick(actionEvent);
    }

    public void onShowHighscoreBClick(ActionEvent actionEvent) throws IOException {
        MainStageController.onShowHighscoreBClick(actionEvent);
    }

    public void onQuitGameButtonClick() {
        MainStageController.onQuitGameButtonClick(quitGameButton);
    }

}
