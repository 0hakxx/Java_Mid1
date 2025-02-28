package lang.string.test;
public class TestString9 {
    public static void main(String[] args) {
        String email = "hello@example.com";
        // 코드 작성
        int index = email.indexOf("@");
        System.out.println(email.substring(0,index));
        System.out.println(email.substring(index+1,email.length()));
    }
}
