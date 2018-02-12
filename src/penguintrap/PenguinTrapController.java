package penguintrap;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class PenguinTrapController {

    private PenguinTrap penguinTrap;

    public PenguinTrapController() {
        penguinTrap = new PenguinTrap();
    }

    @FXML
    private Label label;

    @FXML
    private void losuj() {
        label.setText(penguinTrap.getWynik());
    }
}
