package io.iamminster.dp.state.impl;

import io.iamminster.dp.state.Context;
import io.iamminster.dp.state.State;

import java.util.Locale;

public class LowerCaseState implements State {

    @Override
    public void handleInput(Context context, String inputStr) {
        System.out.println(inputStr.toLowerCase(Locale.JAPAN));
        changeState(context, new UpperCaseState());
    }

    @Override
    public void changeState(Context context, State state) {
        context.setState(state);
    }
}
