package io.iamminster.dp.state;

public interface State {
    void handleInput(Context context, String inputStr);
    void changeState(Context context, State state);
}
