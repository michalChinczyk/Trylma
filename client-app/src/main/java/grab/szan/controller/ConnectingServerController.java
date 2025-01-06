package grab.szan.controller;

import grab.szan.main.App; 
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;

public class ConnectingServerController {

    @FXML
    private TextField nicknameField;

    @FXML
    private TextField hostField;

    @FXML
    private TextField portField;

    @FXML
    private void onConnect() {
        String nickname = nicknameField.getText();
        String host = hostField.getText();
        String port = portField.getText();

        if (nickname.isEmpty() || host.isEmpty() || port.isEmpty()) {
            showAlert("Error", "All fields must be filled!");
            return;
        }

        try {
            int portNumber = Integer.parseInt(port);

            boolean connectionSuccess = connectToServer(host, portNumber, nickname);

            if (connectionSuccess) {
                App.showMenuView(); // idk why vscode is not recognizing this method but its actually working
                
            } else {
                showAlert("Error", "Failed to connect to the server!");
            }
        } catch (NumberFormatException e) {
            showAlert("Error", "Port must be a valid number!");
        } catch (Exception e) {
            showAlert("Error", "An unexpected error occurred: " + e.getMessage());
        }
    }

    private boolean connectToServer(String host, int port, String nickname) {
        // TODO: logika nawiązywania połączenia z serwerem
        return true; // Zwracamy true, aby zasymulować sukces
    }

    // Metoda pomocnicza do wyświetlania alertów
    private void showAlert(String title, String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}