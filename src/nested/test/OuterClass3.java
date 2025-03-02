package nested.test;

public class OuterClass3{
    public void myMethod(){
        class InnerClass{
            public void hello(){
                System.out.println("InnerLocal Class hello");
            }
        }

        InnerClass inner = new InnerClass();
        inner.hello();
    }
}
