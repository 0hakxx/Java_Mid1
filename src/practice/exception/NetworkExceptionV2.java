package practice.exception;

public class NetworkExceptionV2 extends Exception {

    private String errorCode;

    public NetworkExceptionV2(String errorCode, String message) {
        super(message);
        this.errorCode = errorCode;
    }

    public String getErrorCode() {
        return this.errorCode;
    }
}
