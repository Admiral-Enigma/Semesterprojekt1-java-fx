package com.st1.core;

public enum Direction {
    power_plant_outside("power_plant_outside"),
    start("start"),
    power_plant_lobby("power_plant_lobby"),
    power_plant_boiler("power_plant_boiler"),
    power_plant_turbine("power_plant_turbine"),
    airstrip("airstrip"),
    pripyat("pripyat"),
    fukushima("fukushima"),
    thorium_mine("thorium_mine"),
    deep_thorium("deep_thorium");

    private final String name;


     Direction (String name) {
        this.name = name;
    }


    public String getName() {
         return name;
    }
}
