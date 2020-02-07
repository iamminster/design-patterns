package io.iamminster.dp.observer.impl;

import io.iamminster.dp.observer.Subject;

public class ConcreteSubject extends Subject {
    private int state;

    public ConcreteSubject(int state) {
        this.state = state;
    }

    @Override
    public void setState(int state) {
        this.state = state;
    }

    @Override
    public int getState() {
       return state;
    }
}
