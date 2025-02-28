package lang.wrapper.test;

public class WrapperTest1 {

    public static void main(String[] args) {
        String str1 = "10";
        String str2 = "20";

        System.out.println(sum(str1, str2));
    }

    public static int sum(String str1, String str2) {
        return  Integer.valueOf(str1) + Integer.valueOf(str2);
    }
}
