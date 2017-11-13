package CH5;

class Enum{
    static String s = "-";
    public static void main(String[] args){
        try{
            throw new Exception();
        }catch (Exception e){
            try{
                try{
                    throw new Exception();
                }catch (Exception ex) {s +="ic ";} // 1. ic
                throw  new Exception();
            }catch (Exception x){s += "mc ";} // 2. mc
            finally{s += "mf ";} // 3. mf
        }finally{s += "of ";} // 4. of
        System.out.println(s);
    }
}
