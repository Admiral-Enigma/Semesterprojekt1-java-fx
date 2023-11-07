package com.st1;

public class NewReactorState {
    public boolean containmentVesselPlaced = false;
    public boolean coolantCirculationPlaced = false;
    public boolean generatorPlaced = false;
    public boolean pressurizerPlaced = false;
    public boolean reactorCorePlaced = false;
    public boolean reactorVesselPlaced = false;
    public boolean turbinePlaced = false;


    public NewReactorState() {

    }

    public boolean completelyBuilt() {
        return containmentVesselPlaced && coolantCirculationPlaced && generatorPlaced
               && pressurizerPlaced && reactorCorePlaced && reactorVesselPlaced && turbinePlaced;
    }

}
