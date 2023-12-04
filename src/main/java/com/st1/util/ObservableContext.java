package com.st1.util;

import com.st1.core.Context;
import com.st1.core.Direction;
import com.st1.core.Space;
import javafx.beans.InvalidationListener;
import javafx.beans.Observable;

import java.util.ArrayList;
import java.util.List;

// Lag deling motherfuckers
public class ObservableContext extends Context implements Observable {
    private final List<InvalidationListener> listeners = new ArrayList<>();

    public ObservableContext(Space node) {
        super(node);
    }
    @Override
    public void transition (Direction direction) {
        super.transition(direction);
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
