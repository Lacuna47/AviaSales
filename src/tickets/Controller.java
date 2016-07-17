package tickets;

import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    // View.
    @FXML
    private TextField textFieldFrom;
    @FXML
    private TextField textFieldTo;
    @FXML
    private Button buttonFind;
    @FXML
    private TableView tableViewTickets;
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        buttonFind.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                if (!textFieldFrom.getText().isEmpty() && !textFieldTo.getText().isEmpty()) {
                    tableViewTickets.visibleProperty().setValue(true);
                }
            }
        });
    }
}