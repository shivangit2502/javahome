package Experiment8;

public class Program2_CarEngine {
    class Engine {
        void start() {
            System.out.println("Engine started");
        }

        void stop() {
            System.out.println("Engine stopped");
        }
    }

    void drive() {
        Engine engine = new Engine();
        engine.start();
        engine.stop();
    }

    public static void main(String[] args) {
        new Program2_CarEngine().drive();
    }
}
