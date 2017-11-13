package CH5;

class Circles {
    public static void main(String[] args) {
        int[] ia = {1, 3, 5, 7, 9};
        for (int x : ia) {
            for (int j = 0; j < 3; j++) {
                if (x > 4 && x < 8)
                    continue;
                System.out.print(" " + x);
                if (j == 1)
                    break;
                continue;
            }
            continue;
        }
    }
}
// x==1: 1 1
// x==3: 3 3
// x==5: 9 9