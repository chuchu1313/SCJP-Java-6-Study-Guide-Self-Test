package CH7;

import java.util.Arrays;
import java.util.Comparator;

class GeoCache{
    public static void main(String[] args){
        String [] s = {"map", "pen", "marble", "key"};
        Othello o = new Othello();
        Arrays.sort(s);
        for(String s2: s){
            System.out.print(s2 + " ");//pen, marble, map, key
        }
        System.out.println(Arrays.binarySearch(s, "map"));

    }
    static class Othello implements Comparator<String>{
        @Override
        public int compare(String a, String b) { // implements reverse
            return b.compareTo(a);
        }
    }
}
