package CH8;

class Tour {
    public static void main(String[] args) {
        Cathedral c = new Cathedral();
        // Sanctum s = c.new Sanctum(); // Wrong! T ype must be Cathedral.Sanctum
        // c.Sanctum s = c.new Sanctum(); // Wrong! T ype must be Cathedral.Sanctum
        // c.Sanctum s = Cathedral.new Sanctum(); // Wrong! T ype must be Cathedral.Sanctum
        Cathedral.Sanctum s = c.new Sanctum(); // Correct!
        // Cathedral.Sanctum s = Cathedral.new Sanctum(); // Wrong! should be a instance.new
        s.go();
    }
}

class Cathedral {
    class Sanctum {
        void go() {
            System.out.println("spooky");
        }
    }
}