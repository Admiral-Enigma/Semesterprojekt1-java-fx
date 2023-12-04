package com.st1.util;

import com.st1.core.Context;
import com.st1.core.Direction;
import com.st1.core.NewReactorState;
import com.st1.core.Space;
import javafx.beans.InvalidationListener;
import javafx.beans.Observable;

import java.util.ArrayList;
import java.util.List;

public class ObservableNewReactorState extends NewReactorState implements Observable {
    private final List<InvalidationListener> listeners = new ArrayList<>();

    public ObservableNewReactorState(){
        super();
    }

    @Override
    public void setContainmentVesselPlaced(boolean containmentVesselPlaced) {
        super.setContainmentVesselPlaced(containmentVesselPlaced);
        notifyObservers();
    }

    @Override
    public void setCoolantCirculationPlaced(boolean coolantCirculationPlaced) {
        super.setCoolantCirculationPlaced(coolantCirculationPlaced);
        notifyObservers();
    }

    @Override
    public void setGeneratorPlaced(boolean generatorPlaced) {
        super.setGeneratorPlaced(generatorPlaced);
        notifyObservers();
    }

    @Override
    public void setPressurizerPlaced(boolean pressurizerPlaced) {
        super.setPressurizerPlaced(pressurizerPlaced);
        notifyObservers();
    }

    @Override
    public void setReactorCorePlaced(boolean reactorCorePlaced) {
        super.setReactorCorePlaced(reactorCorePlaced);
        notifyObservers();
    }

    @Override
    public void setReactorVesselPlaced(boolean reactorVesselPlaced) {
        super.setReactorVesselPlaced(reactorVesselPlaced);
        notifyObservers();
    }

    @Override
    public void setTurbinePlaced(boolean turbinePlaced) {
        super.setTurbinePlaced(turbinePlaced);
        notifyObservers();
    }
    @Override
    public void setReactorFueled(boolean reactorFueled) {
        super.setReactorFueled(reactorFueled);
        notifyObservers();
    }

    @Override
    public void addListener(InvalidationListener invalidationListener) {
        listeners.add(invalidationListener);

    }

    @Override
    public void removeListener(InvalidationListener invalidationListener) {
        listeners.remove(invalidationListener);
    }

    private void notifyObservers() {
        for (InvalidationListener listener : listeners) {
            listener.invalidated(this);
        }
    }
}