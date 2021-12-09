package com.example.willhero;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.EventObject;

public class GameController {

    private static User currentUser;

    @FXML
    private Stage stage;
    private Scene scene;
    private Parent root;


    @FXML
    private ImageView Cursor_icon;

    @FXML
    private Group add_new_user_popup;

    @FXML
    private ImageView quit_game;

    @FXML
    private ImageView save_load;

    @FXML
    private Group saveloadgame_popup;

    @FXML
    private ImageView setting_logo;

    @FXML
    private ImageView tap_icon;

    @FXML
    private ImageView view_highscore;

    @FXML
    private ImageView will_hero_name;


    @FXML
    void gotogame(MouseEvent event)  throws IOException {
        root = FXMLLoader.load(getClass().getResource("game.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root, Color.rgb(29,200,255,1));
        scene.setFill(Color.rgb(29,200,255,1));
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void show_exit_popup(MouseEvent event) {
//        saveloadgame_popup.
    }

    @FXML
    void show_saveload_popup(MouseEvent event) {

    }

}
