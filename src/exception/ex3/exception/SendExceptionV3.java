package exception.ex3.exception;

// Exception을 상속받은 NetworkClientExceptionV3을 상속 받는 예외 클래스
public class SendExceptionV3 extends NetworkClientExceptionV3 {

    private final String sendData;

    public SendExceptionV3(String sendData, String message) {
        super(message);
        this.sendData = sendData;
    }

    public String getSendData() {
        return sendData;
    }
}
