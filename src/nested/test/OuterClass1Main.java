package nested.test;

public class OuterClass1Main {

    public static void main(String[] args) {
        OuterClass1 o1 = new OuterClass1();
        OuterClass1.NestedClass nc1 = new OuterClass1.NestedClass();
        nc1.hello();
    }
}
