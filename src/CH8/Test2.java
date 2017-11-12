package CH8;

class Boo {
    Boo(String s) {
    }

    Boo() {
    }
}

class Bar extends Boo {
    Bar() {
    }

    Bar(String s) {
        super(s);
    }

    void zoo() {
        //Boo f = new Boo(24) {}; // Wrong! 24 is an int.
        //Boo f = new Bar() {}; // Ok! object is the class extends Bar
        //Boo f = new Boo() {String s; }; // Ok!
        //Bar f = new Boo(String s) { }; // Wrong!
        //Boo f = new Boo.Bar(String s) { }; // Wrong!
    }
}
