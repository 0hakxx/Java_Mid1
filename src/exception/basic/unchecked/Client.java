package exception.basic.unchecked;

//언체크 예외 : 예외를 잡아서 처리하지 않아도 `throws` 키워드를 생략할 수 있다.
//생략만 할 뿐이지 실제로는
// public class Client throw new MyUncheckedException // MyUnCheckedException 폭탄을 던진다.
public class Client {
    //문제 상황
    public void call() {
        throw new MyUncheckedException("ex");
    } // MyUnCheckedException 폭탄을 일부러 만든다.(new)
}

