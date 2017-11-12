package CH8;

class Car {
    class Engine {
        //{ Car.drive(); } // Initial block. Wrong! Car.this.drive()
        //{ this.drive(); } // Wrong! Engine does not have drive()
        //{ Car.this.drive(); } // Correct!
        //{ this.Car.this.drive(); } // Wrong!
        //Engine() { Car.drive(); } // Constructor. Wrong!
        //Engine() { this.drive(); } // Wrong!
        //Engine() { Car.this.drive(); } //  Correct!
    }

    public static void main(String[] args) {
        new Car().go();
    }

    void go() {
        new Engine();
    }

    void drive() {
        System.out.println("hi");
    }
}
