package com.st1.core;/* com.st1.core.World class for modeling the entire in-game world
 */

import com.st1.interact.*;
import com.st1.inventory.items.*;
import com.st1.ui.GameScene;
import com.st1.ui.SceneManager;

public class World {
  Space entry;

  public void setSceneManager(SceneManager sceneManager) {
    this.sceneManager = sceneManager;
  }

  SceneManager sceneManager;

  public World() {
    ThoriumMan thoriumMan = new ThoriumMan();
    PripyatMan pripyatMan = new PripyatMan();
    FukushimaMan fukushimaMan = new FukushimaMan();

    Space startPoint            = new Space("Start", "Hej det er første gang du er ved start point", "Velkommen tilbage til startpoint");
    Space power_plant_outside   = new Space("Power Plant Outside", "Hej det er første gang du er ved power_plant_outside", "Velkommen tilbage til power_plant_outside");
    Space power_plant_lobby     = new Space("Power Plant Lobby", "Hej det er første gang du er ved power_plant_lobby", "Velkommen tilbage til power_plant_lobby");
    Space power_plant_boiler    = new Space("Boiler Room", "Hej det er første gang du er ved power_plant_boiler ", "Velkommen tilbage til power_plant_boiler ");
    Space power_plant_turbine   = new Space("Turbine Room", "Hej det er første gang du er ved power_plant_turbine", "Velkommen tilbage til power_plant_turbine");
    Space airstrip              = new Space("Airstrip", "Hej det er første gang du er ved airstrip", "Velkommen tilbage til airstrip");
    Space pripyat               = new Space("Pripyat", "Hej det er første gang du er ved pripyat", "Velkommen tilbage til pripyat");
    Space fukushima             = new Space("Fukushima", "Hej det er første gang du er ved fukushima", "Velkommen tilbage til fukushima");
    Space thorium_mine          = new Space("Thorium Mine", "Hej det er første gang du er ved thorium_mine", "Velkommen tilbage til thorium_mine");
    Space deep_thorium          = new Space("Deep in the Mine", "Hej det er første gang du er ved deep_thorium", "Velkommen tilbage til deep_thorium");

    startPoint.addEdge("road", power_plant_outside);

    startPoint.setGameScene(new GameScene("fxml/spaces/start.fxml", sceneManager));
    startPoint.setNpc(new TestInfoMan());
    McFeast mcfeast = new McFeast();
    mcfeast.setQuantity(2432);
    startPoint.addItem(mcfeast)
              .addItem(new McChicken());

    power_plant_outside.addEdge("start", startPoint);

    power_plant_outside.addEdge("power_plant_lobby", power_plant_lobby);
    power_plant_outside.addEdge("mine", thorium_mine);
    power_plant_outside.addEdge("airstrip", airstrip);
    power_plant_outside.setNpc(new OutsideInfoMan());

    power_plant_outside.setGameScene(new GameScene("fxml/spaces/power_plant_outside.fxml", sceneManager));

    thorium_mine.addEdge("power_plant_outside", power_plant_outside);
    thorium_mine.addEdge("airstrip", airstrip);
    thorium_mine.addEdge("deeper", deep_thorium);

    thorium_mine.setGameScene(new GameScene("fxml/spaces/thorium_mine.fxml", sceneManager));

    deep_thorium.setNpc(new ThoriumMan());
    thorium_mine.setNpc(new MineMan());

    deep_thorium.addEdge("surface", thorium_mine);
    thorium_mine.addItem(new Hakke());

    deep_thorium.setGameScene(new GameScene("fxml/spaces/deep_in_the_mine.fxml", sceneManager));

    airstrip.setNpc(new AirstripWoman());
    airstrip.addEdge("fly_east", fukushima);
    airstrip.addEdge("fly_west", pripyat);
    airstrip.addEdge("power_plant_outside", power_plant_outside);
    airstrip.addEdge("mine", thorium_mine);
    airstrip.setGameScene(new GameScene("fxml/spaces/airstrip.fxml", sceneManager));


    fukushima.addEdge("fly_back", airstrip);
    fukushima.addItem(new SMRContainment());
    fukushima.setNpc(fukushimaMan);

    fukushima.setGameScene(new GameScene("fxml/spaces/fukushima.fxml", sceneManager));

    pripyat.addEdge("fly_back", airstrip);
    pripyat.addItem(new SMRTurbine());
    pripyat.setNpc(pripyatMan);

    pripyat.setGameScene(new GameScene("fxml/spaces/pripyat.fxml", sceneManager));


    power_plant_lobby.addEdge("power_plant_boiler", power_plant_boiler);
    power_plant_lobby.addEdge("power_plant_turbine", power_plant_turbine);
    power_plant_lobby.addEdge("power_plant_outside", power_plant_outside);
    power_plant_lobby.setGameScene(new GameScene("fxml/spaces/power_plant_lobby.fxml", sceneManager));


    power_plant_boiler.addItem(new SMRGenerator());
    power_plant_lobby.setNpc(new PowerPlantMan());

    power_plant_boiler.addEdge("power_plant_lobby", power_plant_lobby);
    power_plant_boiler.setGameScene(new GameScene("fxml/spaces/power_plant_boiler.fxml", sceneManager));

    power_plant_turbine.addEdge("power_plant_lobby", power_plant_lobby);
    power_plant_turbine.setGameScene(new GameScene("fxml/spaces/power_plant_turbine.fxml", sceneManager));

    this.entry = startPoint;
  }

  public Space getEntry() {
    return entry;
  }
}

