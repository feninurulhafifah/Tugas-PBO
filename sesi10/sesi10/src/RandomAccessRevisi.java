import java.io.IOException;
import java.io.RandomAccessFile;

class RandomAccessRevisi {
    public static void main(String[] args) {
        String bookList[] = {"Satu", "Dua", "Tiga"};
        int yearList[] = {1920, 1230, 1940};

        try {
            RandomAccessFile books = new RandomAccessFile("books.txt", "rw");

            // Menulis data ke dalam file
            for (int i = 0; i < bookList.length; i++) {
                books.writeUTF(bookList[i]);
                books.writeInt(yearList[i]);
            }

            // Membaca data dari file
            books.seek(0);
            for (int i = 0; i < bookList.length; i++) {
                System.out.println(books.readUTF() + " " + books.readInt());
            }

            books.close();
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan dalam akses file: " + e.getMessage());
        }

        System.out.println("Test selesai.");
    }
}
