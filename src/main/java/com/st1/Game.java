package com.st1;

import com.st1.core.GameState;
import com.st1.core.World;
import com.st1.inventory.items.SMRGenerator;
import com.st1.inventory.items.SMRTurbine;
import com.st1.ui.SceneManager;
import com.st1.util.ObservableContext;
import com.st1.util.ObservableNewReactorState;
import com.st1.util.TextPrinter;
import javafx.application.Application;
import javafx.stage.Stage;

import java.io.IOException;

public class Game extends Application {
    public static GameState state = GameState.IN_CONTEXT;
    public static ObservableNewReactorState newReactorState = new ObservableNewReactorState();
    static World world    = new World();
    public static ObservableContext context  = new ObservableContext(world.getEntry());

    public static TextPrinter textPrinter = new TextPrinter();

    private Stage mainStage;
    public SceneManager sceneManager;

    public void checkWinCondition(){
        if (newReactorState.completelyBuilt()) {
            sceneManager.transitionScene("winscene");
        }
    }

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

        sceneManager.createScene("winscene", "fxml/win-scene.fxml");

        mainStage.setResizable(false);
        mainStage.show();

        context.inventory.add(new SMRGenerator());
        context.inventory.add(new SMRTurbine());
        newReactorState.addListener(change -> checkWinCondition());

    }

    public static void main(String[] args) {
        launch();
    }
}