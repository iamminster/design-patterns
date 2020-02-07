package io.iamminster.dp.observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
    private List<Observer> observerList = new ArrayList<>();

    public void attachObserver(Observer observer) {
        observerList.add(observer);
    }

    public void detachObserver(Observer observer) {
        observerList.remove(observer);
    }

    public void notifyObservers() {
        observerList.forEach(observer -> observer.update());
    }

    public abstract void setState(int state);
    public abstract int getState();
}
