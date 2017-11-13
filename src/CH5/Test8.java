package CH5;

class Ebb{
    static int x = 7;
    public static void main(String[] args){
        String s = "";
        for(int y = 0; y < 3; y++){
            x++;
            switch(x){ // fall-through
                case 8: s += "8 ";
                case 9: s += "9 ";
                case 10: s += "10 "; break;
                default: s += "d ";
                case 13: s += "13 ";
            }
        }
        System.out.println(s);
    }
    static{x++;} // x++ at very beginning
}
// x==9, s == 9 10
// x==10, s == 10
// x==11, s == d 13