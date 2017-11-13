package CH5;

class Loopy {
    public static void main(String[] args) {
        int[] x = {7, 6, 5, 4, 3, 2, 1};
        for(int y: x) //must declare the first variable
            System.out.print(y + " ");
        for (int y = 0, z = 0; z < x.length; z++) {
            y = x[z];
            System.out.print(y + " ");
        }
        int y = 0; for (int z = 0; z < x.length; z++) {
            y = x[z];
            System.out.print(y + " ");
        }

    }
}
