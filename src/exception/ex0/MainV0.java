package exception.ex0; //ex0 정상 로직 수행

import java.util.Scanner;

public class MainV0 {

    public static void main(String[] args) {
        NetworkServiceV0 networkService = new NetworkServiceV0();

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("전송할 문자: ");
            String input = scanner.nextLine();
            if (input.equals("exit")) {
                break;
            }
            // --- 함수 호출 순서 ---
            // 1. 현재 `main()` 메서드에서 `networkService.sendMessage()` 호출
            //    -> `NetworkServiceV0` 클래스의 `sendMessage()` 메서드 실행
            //
            // 2. `sendMessage()` 메서드 내부에서:
            //    a. `new NetworkClientV0()` (NetworkClientV0 객체 생성)
            //    b. `client.connect()` 호출
            //    c. `client.send()` 호출
            //    d. `client.disconnect()` 호출
            // ---------------------
            networkService.sendMessage(input);
            System.out.println();
        }
        System.out.println("프로그램을 정상 종료합니다.");
    }
}