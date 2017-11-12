package CH8;

class City {
    class Manhattan {
        void doStuff() throws Exception {
            System.out.println("x ");
        }
    }

    class TimesSquare extends Manhattan {
        void doStuff() throws Exception {

        }
    }

    public static void main(String[] args) throws Exception {
        new City().go();
    }

    void go() throws Exception {
        new TimesSquare().doStuff(); // nothing output, use object(TimesSquare) method.
    }
}
