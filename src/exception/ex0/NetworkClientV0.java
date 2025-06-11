package exception.ex0;

public class NetworkClientV0 {

    private final String address; // 접근할 외부 서버의 주소

    public NetworkClientV0(String address) {
        this.address = address;
    }

    public String connect(){
        System.out.println(this.address + " 서버 연결 성공 ");
        return "success";
    }

    public String send(String data){
        System.out.println(this.address + " 서버에 데이터 전송 " + data);
        return "success";
    }

    public void disconnect(){
        System.out.println(this.address + " 서버에 연결 해제");
    }
}
