package io.iamminster.dp.memento;

import java.util.Stack;

public class Caretaker {
    private Stack<Originator.Memento> mementoStack = new Stack<>();
    private Originator originator;

    public Caretaker(Originator originator) {
        this.originator = originator;
    }

    public void doAction(String state) {
        mementoStack.push(originator.saveMemento());
        originator.setState(state);
        originator.printState();
    }

    public void undoAction() {
        Originator.Memento memento = mementoStack.pop();
        originator.restoreMemento(memento);
        originator.printState();
    }
}
