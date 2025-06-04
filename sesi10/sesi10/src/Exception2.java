// public class Exception2 {
// public static void main(String[] args) {
//     // int i=0;
//     // String greeting[]={
//     //     "Hello World !",
//     //     "No, I mean it !",
//     //     "Hello World "
//     // };
//     // while (i<4){
//     //     System.out.println(greeting[i]);
//     //     i++;
//     // }
            // ini menghasilkan looping yang terus menerus
//     int i=0;
//     String greetings[]={
//         "Hello World !",
//         "No, I mean it !",
//         "HELLO WORLD !"
//     };
//     while (i<4){
//         try{
//         System.out.println(greetings[i]);
//         i++;
//         }catch(ArrayIndexOutOfBoundsException e){
//             System.out.println("Resetting indext value");
//             i=0;
//         }
//     }

// }
// }
// tidak ada looping yang terus-menerus
public class Exception2 {
    public static void main(String[] args) {
        int i = 0;
        String greetings[] = {
            "Hello World !",
            "No, I mean it !",
            "HELLO WORLD !"
        };
        while (i < greetings.length) {
            try {
                System.out.println(greetings[i]);
                i++;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Index melebihi jumlah array.");
            }
        }
    }
}
