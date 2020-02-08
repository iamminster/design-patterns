package io.iamminster.dp.state;

public class Main {
    public static void main(String[] args) {
        Context myContext = new Context();
        myContext.handleInput("first");
        myContext.handleInput("second");
        myContext.handleInput("third");
        myContext.handleInput("fourth");
    }
}
