package CH4;

class Spock{
    public static void main(String[] args){
        int mask = 0;
        int count = 0;
        if (((5<7) || (++count < 10) ) | mask++ < 1 ) // mask == 1
            mask = mask + 1; //mask == 2
        if( (6>8) ^ false) //false
            mask = mask + 100;
        if( !(mask > 1) && ++count > 1)
            mask = mask + 100;
        System.out.println(mask + " " + count);
    }
}
