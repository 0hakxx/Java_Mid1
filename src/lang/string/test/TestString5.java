package lang.string.test;

public class TestString5 {

    public static void main(String[] args) {
        String str = "hello.txt";
        String ext = ".txt";

        int index = str.indexOf(ext);
        System.out.println(str.substring(0, index));
        System.out.println(str.substring(index, str.length()));
    }
}
