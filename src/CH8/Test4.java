package CH8;

class TestObj{
    public static void main(String[] args){
        Object o = new Object(){
            @Override
            public boolean equals(Object obj) {
                return true;
            }
        }; //Should have a semicolon
        System.out.println(o.equals("Fred"));
    }
}
