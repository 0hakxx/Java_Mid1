package exception.ex2;

public class NetworkClientV2 {

    private final String address;
    public boolean connectError;
    public boolean sendError;

    public NetworkClientV2(String address) {
        this.address = address;
    }

    public void connect() throws NetworkClientExceptionV2 { // NetworkClientExceptionV2 폭탄이 생기면 폭탄을 던진다.
        //문제 상황
        if (connectError) {
            //서버 연결 실패 시, NetworkClientExceptionV2라는 폭탄을 만든다(new)
            throw new NetworkClientExceptionV2("connectError", address + " 서버 연결 실패");
        }
        //연결 성공
        System.out.println(address + " 서버 연결 성공");
    }

    public void send(String data) throws NetworkClientExceptionV2 { // NetworkClientExceptionV2 폭탄이 생기면 폭탄을 던진다.
        //문제 상황
        if (sendError) {
            //서버 전송 실패 시, NetworkClientExceptionV2라는 폭탄을 만든다(new)
            throw new NetworkClientExceptionV2("sendError", address + " 서버에 데이터 전송 실패: " + data);
            //중간에 다른 예외가 발생했다고 가정
            //throw new RuntimeException("ex");
        }
        //전송 성공
        System.out.println(address + " 서버에 데이터 전송: " + data);
    }

    public void disconnect() {
        System.out.println(address + " 서버 연결 해제");
    }

    public void initError(String data) {
        if (data.contains("error1")) {
            connectError = true;
        }
        if (data.contains("error2")) {
            sendError = true;
        }
    }
}
