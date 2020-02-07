package io.iamminster.dp.observer.impl;

import io.iamminster.dp.observer.Observer;
import io.iamminster.dp.observer.Subject;

public class BinaryObserver implements Observer {
    private Subject subject;

    public BinaryObserver(Subject subject) {
        this.subject = subject;
    }
    @Override
    public void update() {
        System.out.println("Binary String: " + Integer.toBinaryString(subject.getState()));
    }
}
