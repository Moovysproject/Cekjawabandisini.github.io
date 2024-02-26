import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String kataTersembunyi = "sudah";

        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan kata: ");
        String kataPengguna = scanner.nextLine();

        if (kataPengguna.equals(kataTersembunyi)) {
            System.out.println("Selamat! Anda berhasil menebak kata tersembunyi.");
        } else {
            System.out.println("Maaf, kata yang Anda masukkan tidak sesuai dengan kata tersembunyi.");
        }
    }
}
