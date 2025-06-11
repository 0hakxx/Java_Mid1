package exception.basic.checked;

/* 어떤 클래스가 `Exception` 또는 `RuntimeException`을 상속받으면 그 클래스는 더 이상 일반적인 목적의 클래스가 아니라,
프로그램 실행 중 발생할 수 있는 비정상적인 상황(예외)을 나타내고 처리하기 위한 '예외 클래스'가 된다.
 */
public class MyCheckedException extends Exception { //Exception을 상속 받은 예외는 체크 예외가 된다.
    public MyCheckedException(String message) {
        super(message);
    }
}