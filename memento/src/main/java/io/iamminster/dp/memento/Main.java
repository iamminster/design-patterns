package io.iamminster.dp.memento;

public class Main {
    public static void main(String[] args) {
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker(originator);

        caretaker.doAction("1");
        caretaker.doAction("2");
        caretaker.doAction("3");
        caretaker.doAction("4");
        caretaker.undoAction();
        caretaker.undoAction();
        caretaker.undoAction();
        caretaker.undoAction();
        caretaker.doAction("5");
        caretaker.doAction("6");
        caretaker.doAction("7");
        caretaker.undoAction();
        caretaker.doAction("8");
//        caretaker.undoAction();

    }
}
