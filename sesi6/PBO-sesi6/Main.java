import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Laptop laptop;
        System.out.print("Pilih laptop (Toshiba/MacBook): ");
        String choice = scanner.nextLine();

        if (choice.equalsIgnoreCase("Toshiba")) {
            laptop = new Toshiba();
        } else if (choice.equalsIgnoreCase("MacBook")) {
            laptop = new MacBook();
        } else {
            System.out.println("Pilihan tidak valid");
            scanner.close();
            return;
        }

        while (true) {
            System.out.print("Input perintah (ON/OFF/UP/DOWN/EXIT): ");
            String command = scanner.nextLine().toUpperCase();

            switch (command) {
                case "ON":
                    laptop.powerOn();
                    break;
                case "OFF":
                    laptop.powerOff();
                    break;
                case "UP":
                    laptop.volumeUp();
                    break;
                case "DOWN":
                    laptop.volumeDown();
                    break;
                case "EXIT":
                    System.out.println("Keluar dari program.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Perintah tidak dikenal.");
            }
        }
    }
}
