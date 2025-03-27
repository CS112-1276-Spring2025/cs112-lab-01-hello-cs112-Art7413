public class Main {
    public static void main(String[] args) {
        // Part 1:
        System.out.println("Hello world! My name is Arturo.");
        System.out.println("Welcome to CS 112!");
        System.out.println("Sunny California");

        // Static Method: Class Itself
        sayHello();

        // Non-static Method: Instance of Class
        Main m = new Main();
        m.waveGoodbye();

        // Part #3: HotWheels class
        HotWheels favorite = new HotWheels();
        favorite.setMake(" Porsche 911 Carrera rs 2.7 ");

        System.out.println("My favorite Hot Wheels is " + favorite);
    }

    // Part #2
    static void sayHello() {
        System.out.println("Hello!");
    }

    void waveGoodbye() {
        System.out.println("Goodbye 👋");
    }

}