package exception.ex4.exception;
//RuntimeException(언체크 예외)를 상속받는다.
public class NetworkClientExceptionV4 extends RuntimeException {
    public NetworkClientExceptionV4(String message) {
        super(message);
    }
}
