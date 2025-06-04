import java.util.Scanner;
public class Transfer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== PUSAT TRANSFER KE BANK MANA SAJA  ===");

        System.out.print("Masukkan jumlah uang yang ingin ditransfer: ");
        int jumlah = input.nextInt();
        input.nextLine(); // membersihkan newline

        System.out.print("Masukkan rekening tujuan: ");
        String rekeningTujuan = input.nextLine();

        System.out.print("Masukkan nama bank tujuan (BNI/BCA): ");
        String bankTujuan = input.nextLine().toUpperCase();

        System.out.print("Masukkan berita transfer (opsional, tekan Enter jika tidak ada): ");
        String berita = input.nextLine();

        // Gunakan objek yang sesuai berdasarkan bankTujuan
        Bank bank;
        if (bankTujuan.equals("BNI")) {
            bank = new BankBNI();
        } else if (bankTujuan.equals("BCA")) {
            bank = new BankBCA();
        } else {
            System.out.println("Bank tidak dikenali. Menggunakan bank umum.");
            bank = new Bank();
        }

        int biayaAdmin = bank.adminTF(bankTujuan);
        int totalBayar = jumlah + biayaAdmin;

        System.out.println("\n=== DETAIL TRANSFER ===");
        if (!berita.isEmpty()) {
            bank.transferUang(jumlah, rekeningTujuan, bankTujuan, berita);
        } else {
            bank.transferUang(jumlah, rekeningTujuan, bankTujuan);
        }

        System.out.println("Biaya admin: Rp" + biayaAdmin);
        System.out.println("Total yang harus dibayar: Rp" + totalBayar);
        bank.sukuBunga();

        input.close();
    }
}
