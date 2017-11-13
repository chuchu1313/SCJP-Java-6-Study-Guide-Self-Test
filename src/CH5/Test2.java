package CH5;

class Plane {
    static String s = "-";

    public static void main(String[] args) {
        new Plane().s1();
        System.out.println(s); // -c
    }

    void s1() {
        try {
            s2();
        } catch (Exception e) {
            s += "c";
        } //after catch block, will keep going here..
    }

    void s2() throws Exception {
        s3();
        s += "2";
        s3();
        s += "2b";
    }

    void s3() throws Exception{
        throw new Exception();
    }
}
