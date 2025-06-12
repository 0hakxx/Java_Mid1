package exception.ex2;

/*
남은 문제 : 사용 후에는 반드시 disconnect() 를 호출해서 연결을 해제해야 한다.
*/
public class NetworkServiceV2_3 {

    public void sendMessage(String data) {
        String address = "http://example.com";
        NetworkClientV2 client = new NetworkClientV2(address);
        client.initError(data); //추가

        //하나의 try 안에 정상 흐름을 모두 담는다. 그리고 예외 부분은  catch 블럭에서 해결한다. 이렇게 하면 정상 흐름/예외 흐름을 명확하게 분리할 수 있다
        try {
            client.connect();
            client.send(data);
            client.disconnect();
        } catch (NetworkClientExceptionV2 e) {
            System.out.println("[오류] 코드: " + e.getErrorCode() + ", 메시지: " + e.getMessage());
        }
    }
}
