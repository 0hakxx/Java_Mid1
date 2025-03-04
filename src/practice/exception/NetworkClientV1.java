package practice.exception;

public class NetworkClientV1 {

    private String address;
    private boolean connectError;
    private boolean sendError;

    public NetworkClientV1(String address){
        this.address = address;
    }

    public void connect() throws NetworkExceptionV2{
        if (connectError) {
            throw new NetworkExceptionV2("contentError",address + " 서버 연결 실패" );
        }
        //연결 성공
        System.out.println(address + " 서버 연결 성공");
    }

    public void send(String data) throws NetworkExceptionV2{
        if (sendError) {
            throw new NetworkExceptionV2("sendError",address + " 서버 데이터 전송 실패" );
        }
        //전송 성공
        System.out.println(address + " 서버에 데이터 전송: " + data);
    }
    public void disconnect() {
        System.out.println(address + " 서버 연결 해제");
    }

    public void initError(String data) {
        if (data.contains("error1")) {
            this.connectError = true;
        }
        if (data.contains("error2")) {
            this.sendError = true;
        }
    }

}
