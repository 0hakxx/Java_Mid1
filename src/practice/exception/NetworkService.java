package practice.exception;


import exception.ex0.NetworkClientV0;

public class NetworkService {
    public void sendMessage(String data){
        String address = "http://example.com";
        NetworkClientV1 client = new NetworkClientV1(address);

        client.initError(data);


        try {
            client.connect();
            client.send(data);
        } catch (NetworkExceptionV2 e) {
            System.out.println("오류 코드 " + e.getErrorCode() + "메시지 " + e.getMessage());
        }

        client.disconnect();

    }

}
