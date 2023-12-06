package com.st1.core;/* com.st1.core.World class for modeling the entire in-game world
 */

import com.st1.ui.GameScene;
import com.st1.ui.SceneManager;

public class World {
  Space entry;

  public void setSceneManager(SceneManager sceneManager) {
    this.sceneManager = sceneManager;
  }

  SceneManager sceneManager;

  public World() {
    Space startPoint            = new Space("Start");
    Space power_plant_outside   = new Space("Power Plant Outside");
    Space power_plant_lobby     = new Space("Power Plant Lobby");
    Space power_plant_boiler    = new Space("Boiler Room");
    Space power_plant_turbine   = new Space("Turbine Room");
    Space airstrip              = new Space("Airstrip");
    Space pripyat               = new Space("Pripyat");
    Space fukushima             = new Space("Fukushima");
    Space thorium_mine          = new Space("Thorium Mine");
    Space deep_thorium          = new Space("Deep in the Mine");

    startPoint.addEdge(Direction.power_plant_outside, power_plant_outside);

    startPoint.setGameScene(new GameScene("fxml/spaces/start.fxml", sceneManager));

    power_plant_outside.addEdge(Direction.start, startPoint);

    power_plant_outside.addEdge(Direction.power_plant_lobby, power_plant_lobby);
    power_plant_outside.addEdge(Direction.thorium_mine, thorium_mine);
    power_plant_outside.addEdge(Direction.airstrip, airstrip);
    power_plant_outside.setGameScene(new GameScene("fxml/spaces/power_plant_outside.fxml", sceneManager));

    thorium_mine.addEdge(Direction.power_plant_outside, power_plant_outside);
    thorium_mine.addEdge(Direction.airstrip, airstrip);
    thorium_mine.addEdge(Direction.deep_thorium, deep_thorium);

    thorium_mine.setGameScene(new GameScene("fxml/spaces/thorium_mine.fxml", sceneManager));


    deep_thorium.addEdge(Direction.thorium_mine, thorium_mine);

    deep_thorium.setGameScene(new GameScene("fxml/spaces/deep_in_the_mine.fxml", sceneManager));

    airstrip.addEdge(Direction.fukushima, fukushima);
    airstrip.addEdge(Direction.pripyat, pripyat);
    airstrip.addEdge(Direction.power_plant_outside, power_plant_outside);
    airstrip.addEdge(Direction.thorium_mine, thorium_mine);
    airstrip.setGameScene(new GameScene("fxml/spaces/airstrip.fxml", sceneManager));


    fukushima.addEdge(Direction.airstrip, airstrip);

    pripyat.addEdge(Direction.airstrip, airstrip);
    fukushima.setGameScene(new GameScene("fxml/spaces/fukushima.fxml", sceneManager));
    pripyat.setGameScene(new GameScene("fxml/spaces/pripyat.fxml", sceneManager));


    power_plant_lobby.addEdge(Direction.power_plant_boiler, power_plant_boiler);
    power_plant_lobby.addEdge(Direction.power_plant_turbine, power_plant_turbine);
    power_plant_lobby.addEdge(Direction.power_plant_outside, power_plant_outside);
    power_plant_lobby.setGameScene(new GameScene("fxml/spaces/power_plant_lobby.fxml", sceneManager));



    power_plant_boiler.addEdge(Direction.power_plant_lobby, power_plant_lobby);
    power_plant_boiler.setGameScene(new GameScene("fxml/spaces/power_plant_boiler.fxml", sceneManager));

    power_plant_turbine.addEdge(Direction.power_plant_lobby, power_plant_lobby);
    power_plant_turbine.setGameScene(new GameScene("fxml/spaces/power_plant_turbine.fxml", sceneManager));

    this.entry = startPoint;
  }

  public Space getEntry() {
    return entry;
  }
}

