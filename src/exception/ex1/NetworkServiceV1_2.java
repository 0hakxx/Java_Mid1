package exception.ex1;
/*
connect() 가 실패한 경우 send()를 호출하면 안 된다 ==> 해결 O
사용 후에는 반드시 disconnect() 를 호출해야 한다 ==> 해결 X
*/
public class NetworkServiceV1_2 {

    public void sendMessage(String data) {
        String address = "http://example.com";
        NetworkClientV1 client = new NetworkClientV1(address);
        client.initError(data);

        String connectResult = client.connect(); //연결이 실패했는지 확인하기 위해 변수 선언
        String sendResult = client.send(data);   //전송이 실패했는지 확인하기 위해 변수 선언

        if (isError(connectResult)) {
            System.out.println("[네트워크 오류 발생] 오류 코드: " + connectResult);
            return; //연결 실패 시 send 까지 호출하면 안 되므로 return
        }
        if (isError(sendResult)) {
            System.out.println("[네트워크 오류 발생] 오류 코드: " + sendResult);
            return; //전송 실패 시 return
        }
        client.disconnect();
    }
    private static boolean isError(String connectResult) {
        return !connectResult.equals("success");
    }
}
