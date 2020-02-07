package io.iamminster.dp.observer;

import io.iamminster.dp.observer.impl.BinaryObserver;
import io.iamminster.dp.observer.impl.ConcreteSubject;
import io.iamminster.dp.observer.impl.HexaObserver;

public class Main {
    public static void main(String[] args) {
        ConcreteSubject concreteSubject = new ConcreteSubject(1);
        Observer binaryObserver = new BinaryObserver(concreteSubject);
        Observer hexaObserver = new HexaObserver(concreteSubject);

        concreteSubject.attachObserver(binaryObserver);
        concreteSubject.attachObserver(hexaObserver);

        concreteSubject.setState(12);
        concreteSubject.notifyObservers();
        concreteSubject.setState(255);
        concreteSubject.notifyObservers();
    }
}
