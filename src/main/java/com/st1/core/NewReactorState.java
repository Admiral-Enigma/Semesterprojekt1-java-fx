package com.st1.core;


public class NewReactorState {

    private boolean containmentVesselPlaced = false;
    private boolean coolantCirculationPlaced = false;
    private boolean generatorPlaced = false;
    private boolean pressurizerPlaced = false;
    private boolean reactorCorePlaced = false;
    private boolean reactorVesselPlaced = false;
    private boolean turbinePlaced = false;
    private boolean reactorFueled = false;

    public boolean isOldPowerPlantRemoved() {
        return oldPowerPlantRemoved;
    }

    public void setOldPowerPlantRemoved(boolean oldPowerPlantRemoved) {
        this.oldPowerPlantRemoved = oldPowerPlantRemoved;
    }

    private boolean oldPowerPlantRemoved = false;

    public void setContainmentVesselPlaced(boolean containmentVesselPlaced) {
        this.containmentVesselPlaced = containmentVesselPlaced;
    }

    public void setCoolantCirculationPlaced(boolean coolantCirculationPlaced) {
        this.coolantCirculationPlaced = coolantCirculationPlaced;
    }

    public void setGeneratorPlaced(boolean generatorPlaced) {
        this.generatorPlaced = generatorPlaced;
    }

    public void setPressurizerPlaced(boolean pressurizerPlaced) {
        this.pressurizerPlaced = pressurizerPlaced;
    }

    public void setReactorCorePlaced(boolean reactorCorePlaced) {
        this.reactorCorePlaced = reactorCorePlaced;
    }

    public void setReactorVesselPlaced(boolean reactorVesselPlaced) {
        this.reactorVesselPlaced = reactorVesselPlaced;
    }

    public void setTurbinePlaced(boolean turbinePlaced) {
        this.turbinePlaced = turbinePlaced;
    }
    public void setReactorFueled(boolean reactorFueled) {this.reactorFueled = reactorFueled;}

    public boolean isContainmentVesselPlaced() {
        return containmentVesselPlaced;
    }

    public boolean isCoolantCirculationPlaced() {
        return coolantCirculationPlaced;
    }

    public boolean isGeneratorPlaced() {
        return generatorPlaced;
    }

    public boolean isPressurizerPlaced() {
        return pressurizerPlaced;
    }

    public boolean isReactorCorePlaced() {
        return reactorCorePlaced;
    }

    public boolean isReactorVesselPlaced() {
        return reactorVesselPlaced;
    }

    public boolean isTurbinePlaced() {
        return turbinePlaced;
    }

    public boolean isReactorFueled() {return reactorFueled;}

    public NewReactorState() {

    }

    public boolean completelyBuilt() {

      return containmentVesselPlaced && coolantCirculationPlaced && generatorPlaced
               && pressurizerPlaced && reactorCorePlaced && reactorVesselPlaced && turbinePlaced && reactorFueled;
    }
}
