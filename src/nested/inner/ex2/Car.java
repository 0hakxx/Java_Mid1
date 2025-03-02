package nested.inner.ex2;

public class Car {

    private String model;
    private int level;

    private Engine engine;

    public Car(String model, int level) {
        this.model = model;
        this.level = level;
        this.engine = new Engine(); // Car.Engine()
    }

    public void start(){
        engine.start();
        System.out.println(model + " 시작 완료");
    }
    class Engine {
        public void start() {
            System.out.println("충전 레벨 확인: " + level);
            System.out.println(model + "의 엔진을 구동합니다.");
        }
    }

}
