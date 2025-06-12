package exception.ex2;

public class NetworkServiceV2_5 {

    public void sendMessage(String data) {
        String address = "http://example.com";
        NetworkClientV2 client = new NetworkClientV2(address);
        client.initError(data); //추가

        try { //try 블록은 정상 흐름
            client.connect();
            client.send(data);
        } catch (NetworkClientExceptionV2 e) { // catch부분은 try 블록 안에서 발생한 특정 예외를 처리하려는 흐름을 작성
            System.out.println("[오류] 코드: " + e.getErrorCode() + ", 메시지: " + e.getMessage());
        } finally { // 예외 발생 여부와 관계없이 '무조건' 실행되어야 하는 코드, catch 에서 못 잡아도 finally은 실행이 됨
            client.disconnect();
        }

    }
}
