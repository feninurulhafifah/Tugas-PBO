
import java.io.IOException;

// public class Test3 {

//         public void methodA(){
//             System.out.println("Method A");
//         }
//         public void methodB() throws IOException{
//             System.out.println(20/0);
//             System.out.println("Method B");
//         }
//     }

// public class Test3 {

//     public void methodA(){
//         System.out.println("Method A");
//     }

//     public void methodB() throws IOException {
//         System.out.println(20 / 0);
//         System.out.println("Method B");
//     }

//     public static void main(String[] args) throws IOException {
//         Test3 obj = new Test3();
//         obj.methodA();
//         obj.methodB();
//     }
// }

class Test3 {
    public void methodA() {
        System.out.println("Method A");
    }

    public void methodB() {
        System.out.println(20 / 0); // Ini akan memicu ArithmeticException
        System.out.println("Method B"); // Tidak akan dieksekusi karena error di atas
    }
}

public class Utama {
    public static void main(String[] args) {
        Test3 o = new Test3();
        o.methodA();

        try {
            o.methodB();
        } catch (Exception e) {
            System.out.println("Error di Method B");
        } finally {
            System.out.println("Ini selalu dicetak");
        }
    }
}



