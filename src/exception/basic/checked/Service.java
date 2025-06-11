package exception.basic.checked;

public class Service {
    Client client = new Client();

    // 예외를 잡아서 처리하는 코드
    public void callCatch() {
        try {
            client.call();
            //MyCheckedException은 Exception의 자식이므로 Exception으로도 잡을 수 있다.
        } catch (MyCheckedException e) {
            //예외 처리 로직
            System.out.println("예외 처리, message=" + e.getMessage());
        }
        System.out.println("정상 흐름"); //MyCheckedException 를 잡았(catch)으므로, '정상 흐름'이 출력이 된다.
    }

    // 체크 예외를 밖으로 던지는 코드
    public void catchThrow() throws MyCheckedException { // MyCheckedException 폭탄을 해결하지 못 하므로 던진다.
        client.call();
    }
}
