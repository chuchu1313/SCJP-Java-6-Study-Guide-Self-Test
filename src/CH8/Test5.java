package CH8;

class HourseTest {
    public static void main(String[] args){
        class Horse{
            public String name;
            public Horse(String s){
                name = s;
            }
        }
        Object obj = new Horse("Zippo");
        // System.out.println(obj.name); //Compile error! can only use obj's members
    }
}
