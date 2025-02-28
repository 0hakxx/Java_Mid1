package lang.wrapper.test;

public class WrapperTest3 {
    public static void main(String[] args) {
        String str = "100";
        // 코드 작성

        System.out.println("integer1 : " + Integer.valueOf(str));

        int intValue = Integer.valueOf(str).intValue();
        System.out.println("intValue : " + intValue);

        System.out.println("integer2 : " + Integer.valueOf(intValue));
    }
}
