package com.st1;

import com.st1.commands.Command;
import com.st1.commands.CommandUnknown;
import com.st1.commands.Registry;
import com.st1.inventory.items.McChicken;
import com.st1.inventory.items.McFeast;
import com.st1.inventory.items.SMRGenerator;
import com.st1.inventory.items.Thorium;
import com.st1.ui.SceneManager;
import com.st1.util.TextPrinter;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Scanner;

public class Game extends Application {
    public static GameState state = GameState.IN_CONTEXT;
    public static NewReactorState newReactorState = new NewReactorState();
    static World    world    = new World();
    public static Context  context  = new Context(world.getEntry());

    public static TextPrinter textPrinter = new TextPrinter();

    private Stage mainStage;
    public SceneManager sceneManager;

    @Override
    public void start(Stage stage) throws IOException {
        this.mainStage = stage;
        this.sceneManager = new SceneManager(stage);


        FXMLLoader fxmlLoader = new FXMLLoader(Game.class.getResource("scenes/game-view.fxml"));
//        Scene scene = new Scene(fxmlLoader.load(), 1200, 700);
        mainStage.setTitle("Yurigistan Nuclear Bonanza");
        mainStage.centerOnScreen();

        sceneManager.createScene("menu", "fxml/menu-view.fxml");

        sceneManager.createScene("game", "fxml/game-view.fxml");
        sceneManager.createScene("test", "fxml/test.fxml");

        sceneManager.transitionScene("menu");

        mainStage.setResizable(false);
        mainStage.show();

        Context.inventory.add(new McFeast());
        Context.inventory.add(new McChicken());
        Context.inventory.add(new SMRGenerator());
        //context.getCurrent().welcome();

    }

    public static void main(String[] args) {
        launch();
    }
}