package com.st1;/* com.st1.World class for modeling the entire in-game world
 */

import com.st1.interact.*;
import com.st1.inventory.items.*;

public class World {
  Space entry;

  World () {
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
    startPoint.setNpc(new TestInfoMan());
    McFeast mcfeast = new McFeast();
    mcfeast.setQuantity(2432);
    startPoint.addItem(mcfeast)
              .addItem(new McChicken());

    power_plant_outside.addEdge("start", startPoint);
    power_plant_outside.addEdge("lobby", power_plant_lobby);
    power_plant_outside.addEdge("mine", thorium_mine);
    power_plant_outside.addEdge("airstrip", airstrip);
    power_plant_outside.setNpc(new OutsideInfoMan());

    thorium_mine.addEdge("outside", power_plant_outside);
    thorium_mine.addEdge("airstrip", airstrip);
    thorium_mine.addEdge("deeper", deep_thorium);

    deep_thorium.setNpc(new ThoriumMan());
    thorium_mine.setNpc(new MineMan());

    deep_thorium.addEdge("surface", thorium_mine);
    thorium_mine.addItem(new Hakke());



    airstrip.setNpc(new AirstripWoman());
    airstrip.addEdge("fly_east", fukushima);
    airstrip.addEdge("fly_west", pripyat);
    airstrip.addEdge("outside", power_plant_outside);
    airstrip.addEdge("mine", thorium_mine);

    fukushima.addEdge("fly_back", airstrip);
    fukushima.addItem(new SMRContainment());
    fukushima.setNpc(fukushimaMan);

    pripyat.addEdge("fly_back", airstrip);
    pripyat.addItem(new SMRTurbine());
    pripyat.setNpc(pripyatMan);


    power_plant_lobby.addEdge("left_door", power_plant_boiler);
    power_plant_lobby.addEdge("right_door", power_plant_turbine);
    power_plant_lobby.addEdge("exit", power_plant_outside);
    power_plant_boiler.addItem(new SMRGenerator());
    power_plant_lobby.setNpc(new PowerPlantMan());

    power_plant_boiler.addEdge("lobby", power_plant_lobby);

    power_plant_turbine.addEdge("lobby", power_plant_lobby);

    this.entry = startPoint;
  }
  
  Space getEntry () {
    return entry;
  }
}

