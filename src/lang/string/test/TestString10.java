package lang.string.test;

public class TestString10 {
    public static void main(String[] args) {
        String fruits = "apple,banana,mango";
        // 코드 작성
        String[] fruit = fruits.split(",");
        String Array = "";
        for (String s : fruit) {
            System.out.println(s);
            System.out.println(s.join("->"));
        }
        System.out.println(Array);
    }
}
