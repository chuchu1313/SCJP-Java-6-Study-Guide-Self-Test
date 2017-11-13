package CH4;

class Fork{
    public static void main(String[] args){
        if(args.length == 1 | args[1].equals("test")){ //args[1] ==> null, ArrayIndexOutOfBoundsException: 1
            System.out.println("test case");
        } else{
            System.out.println("production " + args[0]);
        }
    }
}

//java Fork live2