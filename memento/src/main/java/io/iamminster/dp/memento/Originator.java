package io.iamminster.dp.memento;

public class Originator {
    private String state;

    public void printState() {
        System.out.println(state);
    }

    public void setState(String state) {
        this.state = state;
    }

    public Memento saveMemento() {
        return new Memento(this.state);
    }

    public void restoreMemento(Memento memento) {
        this.state = memento.getState();
    }

    public static class Memento {
        private String state;

        private Memento(String state) {
            this.state = state;
        }

        private void setState(String state) {
            this.state = state;
        }

        private String getState() {
            return state;
        }
    }
}
