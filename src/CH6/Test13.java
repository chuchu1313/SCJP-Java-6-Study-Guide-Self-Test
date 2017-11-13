package CH6;

import java.text.NumberFormat;

class Slice{
    public static void main(String[] args){
        String s = "987.123456";
        double d = 987.123456d;
        NumberFormat nf = NumberFormat.getInstance();
        nf.setMaximumFractionDigits(5); // standard rounding
        System.out.println(nf.format(d) + " "); // 987.12346
        try{
            System.out.println(nf.parse(s)); // 987.123456
        }catch (Exception e){
            System.out.println("got exc");
        }
    }
}
