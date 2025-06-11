package exception.basic.checked;

public class Client {
    public void call() throws MyCheckedException { // MyCheckedException 폭탄을 던진다.
        //문제 상황
        throw new MyCheckedException("ex");       // MyCheckedException 폭탄을 일부러 만든다.(new)
    }
}
