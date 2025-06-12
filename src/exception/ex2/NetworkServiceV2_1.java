package exception.ex2;

/*
남은 문제
ex1에서 업그레이드하여 예외처리를 도입했지만, catcy-try을 하지 않아 예외가 발생하면 프로그램이 종료된다.
사용 후에는 반드시 disconnect() 를 호출해서 연결을 해제해야 한다.
*/
public class NetworkServiceV2_1 {

    public void sendMessage(String data) throws NetworkClientExceptionV2 { //NetworkClientExceptionV2 예외 발생 시 던진다.
        String address = "http://example.com";
        NetworkClientV2 client = new NetworkClientV2(address);
        client.initError(data); //추가

        client.connect();
        client.send(data);
        client.disconnect();
    }
}
