public class ExceptionHandling {
    public static String testTryCatch(){
        try {
            System.out.println(10/0);
            return "Inside Try";
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            return "Inside Finally";
        }
    }
    public static void main(String[] args) {
        String temp = testTryCatch();
        System.out.println("HAHAHAHAHA"+temp);
        System.out.println("Hey, I am at the end..Exception was caught at line 5");
    }
}
