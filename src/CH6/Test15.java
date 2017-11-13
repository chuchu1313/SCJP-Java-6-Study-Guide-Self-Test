package CH6;

import java.util.Scanner;

class Looking{
    public static void main(String[] args){
        String input = "1 2 a 3 45 6";
        Scanner sc = new Scanner(input);
        int x = 0;
        do{
            x = sc.nextInt(); // 1 2, then Exception shows: java.util.InputMismatchException
            System.out.print(x + " ");
        } while(x != 0);
    }
}
