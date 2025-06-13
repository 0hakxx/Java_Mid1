package exception.ex4;

import exception.ex4.exception.ConnectExceptionV4;
import exception.ex4.exception.SendExceptionV4;

/*
 V4와의 차이점:
 V5는 Java의 try-with-resources 구문을 사용하기 위해 AutoCloseable 인터페이스를 구현
 try-with-resources 구문은 try(...) 소괄호 안에 자원 객체를 선언하면,
 try 블록이 끝날 때 (정상 종료되든, 예외가 발생하든) 자동으로 자원의 close() 메서드를 호출
 결과적으로 V4처럼 finally 블록에서 직접 disconnect()를 호출하는 코드를 작성할 필요가 없어지므로
 코드가 더 간결해지고, 자원 해제를 실수로 누락하는 위험을 원천적으로 방지
 */
public class NetworkClientV5 implements AutoCloseable {

    private final String address;
    public boolean connectError;
    public boolean sendError;

    public NetworkClientV5(String address) {
        this.address = address;
    }

    public void connect() {
        if (connectError) {
            throw new ConnectExceptionV4(address, address + " 서버 연결 실패");
        }
        //연결 성공
        System.out.println(address + " 서버 연결 성공");
    }

    public void send(String data) {
        if (sendError) {
            throw new SendExceptionV4(data, address + " 서버에 데이터 전송 실패: " + data);
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

    // 내부적으로 기존의 자원 해제 메서드인 disconnect()를 자동으로 호출
    @Override
    public void close() {
        System.out.println("NetworkClientV5.close() 호출");
        disconnect();
    }
}