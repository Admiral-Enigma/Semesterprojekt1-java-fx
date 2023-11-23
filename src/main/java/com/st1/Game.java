package com.st1;

import com.st1.core.Context;
import com.st1.core.GameState;
import com.st1.core.NewReactorState;
import com.st1.core.World;
import com.st1.inventory.items.McChicken;
import com.st1.inventory.items.McFeast;
import com.st1.inventory.items.SMRGenerator;
import com.st1.ui.SceneManager;
import com.st1.util.ObservableContext;
import com.st1.util.TextPrinter;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;

import java.io.IOException;

public class Game extends Application {
    public static GameState state = GameState.IN_CONTEXT;
    public static NewReactorState newReactorState = new NewReactorState();
    static World world    = new World();
    public static ObservableContext context  = new ObservableContext(world.getEntry());

    public static TextPrinter textPrinter = new TextPrinter();

    private Stage mainStage;
    public SceneManager sceneManager;

    @Override
    public void start(Stage stage) throws IOException {
        this.mainStage = stage;
        this.sceneManager = new SceneManager(stage);
        Game.world.setSceneManager(sceneManager);

        mainStage.setTitle("Yurigistan Nuclear Bonanza");
        mainStage.centerOnScreen();

        sceneManager.createScene("menu", "fxml/menu-view.fxml");

        sceneManager.createScene("game", "fxml/game-view.fxml");
        sceneManager.transitionScene("menu");

        mainStage.setResizable(false);
        mainStage.show();

        context.inventory.add(new McFeast());
        context.inventory.add(new McChicken());
        context.inventory.add(new SMRGenerator());
        //context.getCurrent().welcome();

    }

    public static void main(String[] args) {
        launch();
    }
}