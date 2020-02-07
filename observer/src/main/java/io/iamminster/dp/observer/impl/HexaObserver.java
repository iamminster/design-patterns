package io.iamminster.dp.observer.impl;

import io.iamminster.dp.observer.Observer;
import io.iamminster.dp.observer.Subject;

public class HexaObserver implements Observer {
    private Subject subject;

    public HexaObserver(Subject subject) {
        this.subject = subject;
    }

    @Override
    public void update() {
        System.out.println("Hexa String: " + Integer.toHexString(subject.getState()));
    }
}
