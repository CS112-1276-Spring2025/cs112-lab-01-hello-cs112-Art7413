public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to CS 112!");
        //Static Method: Class Itself
        sayHello();
        //Non-static Method: Instance of Class
        Main m = new Main();
        m.waveGoodbye();
    }

    static void sayHello() {
        System.out.println("Hello!");
    }

    void waveGoodbye() {
        System.out.println("Goodbye 👋");
    }
}