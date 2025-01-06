package grab.szan.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class MenuController {

    @FXML
    private void onCreateGame() {
        //TODO: powinien być wywołany widok tworzenia gry
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Create Game");
        alert.setHeaderText(null);
        alert.setContentText("Creating a new game...");
        alert.showAndWait();
    }

    @FXML
    private void onJoinGame() {
        //TODO: powinien być wywołany widok dołączania do gry
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Join Game");
        alert.setHeaderText(null);
        alert.setContentText("Joining a game...");
        alert.showAndWait();
    }

    @FXML
    private void onExit() {
        System.exit(0);
    }
}