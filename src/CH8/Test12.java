package CH8;

import java.util.Arrays;
import java.util.Comparator;

class pockets {
    public static void main(String[] args){
        String[] sa = {"nickel", "button", "key", "lint"};
        Sorter s = new Sorter();// can only use members that is has static modifiers
        for (String s2: sa){
            System.out.print(s2 + " ");
        }
        Arrays.sort(sa, s);
        System.out.println();
        for(String s2: sa){
            System.out.print(s2 + " ");
        }

    }
    static class Sorter implements Comparator<String>{
        @Override
        public int compare(String a, String b) {
            int l = 3;
            return b.compareTo(a);
        }
    }

}

