package exception.basic.checked;

public class Client {
    public void call() throws MyCheckedException { // MyCheckedException 폭탄을 해결하지 못 하므로 던진다.
        //문제 상황
        throw new MyCheckedException("ex");       // MyCheckedException 폭탄을 일부러 만든다.(new)
    }
}
