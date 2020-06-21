package uk.oczadly.karl.gameui;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import uk.oczadly.karl.gameui.ui.HorizontalAlignment;
import uk.oczadly.karl.gameui.ui.VerticalAlignment;

import java.net.URL;
import java.util.ResourceBundle;

public class FXController implements Initializable {
    
    @FXML public TextField idealGui;
    @FXML public Label guiScaleLabel;
    
    @FXML public TextField resWidth;
    @FXML public TextField resHeight;
    @FXML public Label resLabel;
    
    @FXML public CheckBox checkScaleBox;
    @FXML public CheckBox checkUiHotbar;
    @FXML public CheckBox checkUiInventory;
    @FXML public CheckBox checkUiMinimap;
    
    @FXML public TextField minimapSize;
    @FXML public TextField horizontalOffset;
    @FXML public ChoiceBox<HorizontalAlignment> choiceHorizontal;
    @FXML public TextField verticalOffset;
    @FXML public ChoiceBox<VerticalAlignment> choiceVertical;
    
    
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        idealGui.textProperty().addListener(e -> Main.updateUISettings());
        resWidth.textProperty().addListener(e -> Main.updateUISettings());
        resHeight.textProperty().addListener(e -> Main.updateUISettings());
        
        checkScaleBox.selectedProperty().addListener(e -> Main.updateUISettings());
        checkUiHotbar.selectedProperty().addListener(e -> Main.updateUISettings());
        checkUiInventory.selectedProperty().addListener(e -> Main.updateUISettings());
        checkUiMinimap.selectedProperty().addListener(e -> Main.updateUISettings());
    
        choiceHorizontal.setItems(FXCollections.observableArrayList(HorizontalAlignment.values()));
        choiceHorizontal.setValue(HorizontalAlignment.RIGHT_WINDOW);
        choiceVertical.setItems(FXCollections.observableArrayList(VerticalAlignment.values()));
        choiceVertical.setValue(VerticalAlignment.TOP_WINDOW);
        
        minimapSize.textProperty().addListener(e -> Main.updateUISettings());
        horizontalOffset.textProperty().addListener(e -> Main.updateUISettings());
        choiceHorizontal.valueProperty().addListener(e -> Main.updateUISettings());
        verticalOffset.textProperty().addListener(e -> Main.updateUISettings());
        choiceVertical.valueProperty().addListener(e -> Main.updateUISettings());
    }
    
}
