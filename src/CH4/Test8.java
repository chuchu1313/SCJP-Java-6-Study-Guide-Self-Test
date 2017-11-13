package CH4;

class SpecialOPs{
    public static void main(String[] args){
        String s = "";
        Boolean b1 = true;
        boolean b2 = false;
        if((b2 = false) | (21%5) > 2)  //false | false, b2 == false
            s+= "x";
        if(b1 || (b2 = true)){ // b1 == true, s == y
            s += "y";
        }
        if(b2 == true){
            System.out.println(s);
        }
    }
}
