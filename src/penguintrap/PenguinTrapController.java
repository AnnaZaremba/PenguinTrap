package penguintrap;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class PenguinTrapController {

    PenguinTrap penguinTrap = new PenguinTrap();

    @FXML
    private TextField poleTekstowe;

    @FXML
    private void losuj() {
        poleTekstowe.setText(penguinTrap.getWynik());
    }
}
