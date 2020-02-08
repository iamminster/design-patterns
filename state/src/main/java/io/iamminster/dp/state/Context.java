package io.iamminster.dp.state;

import io.iamminster.dp.state.impl.LowerCaseState;

import java.util.Objects;

public class Context {
    private State state;

    public Context() {
       this(new LowerCaseState());
    }

    public Context(State state) {
        if (Objects.isNull(state)) {
           this.state = new LowerCaseState();
        }
        else {
            this.state = state;
        }

    }

    public void handleInput(String inputStr) {
        state.handleInput(this, inputStr);
    }

    // TODO: It is bad design to let this function public. It should be protected or private, and should only be accessed through state obj
    public void setState(State state) {
        this.state = state;
    }
}
