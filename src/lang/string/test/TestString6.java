package lang.string.test;

public class TestString6 {
    public static void main(String[] args) {
        String str = "start hello java, hello spring, hello jpa";
        String key = "hello";
        int count = 0;
        // 코드 작성
        for (String arg : args) {
            if(arg.contains(key)) {
                count++;
            }
        }

        System.out.println(count);
    }
}