public class Exception3 {
    public static void main(String[] args) {
        // int bil=10;
        // System.out.println(bil/0);

        // int bil=10;
        // try{
        //     System.out.println(bil/0);
        // }catch(Exception e){
        //      System.out.println("Ini menghendle error yang terjadi");
        // }

        int bil=10;
        try{
            System.out.println(bil/0);
        }catch(ArithmeticException e){
             System.out.println("Aritmatika Error");
        }catch(Exception e){
           System.out.println("Ini menghendle error yang terjadi"); 
        }
    }
}
