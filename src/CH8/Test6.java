package CH8;

abstract class AbstractTest {
    public int getNum() {
        return 45;
    }

    public abstract class Bar {
        public int getNum() {
            return 38;
        }
    }

    public static void main(String[] args) {
        AbstractTest t = new AbstractTest() { //AbstractTest cannot be initial, so create a subclass to extends AbstractTest
            public int getNum() {
                return 22;
            }
        };
        AbstractTest.Bar f = t.new Bar() { //AbstractTest.Bar cannot be initial, so create a subclass to extends AbstractTest.Bar
            public int getNum() {
                return 57;
            }
        };
        System.out.println(f.getNum() + " " + t.getNum());
    }
}
