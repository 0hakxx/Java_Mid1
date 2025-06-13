package exception.ex3.exception;


// Exception을 상속받은 NetworkClientExceptionV3을 상속 받는 예외 클래스
public class ConnectExceptionV3 extends NetworkClientExceptionV3 {

    private final String address;

    public ConnectExceptionV3(String address, String message) {
        super(message);
        this.address = address;
    }

    public String getAddress() {
        return address;
    }
}
