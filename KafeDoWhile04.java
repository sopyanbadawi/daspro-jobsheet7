import java.util.Scanner;
public class KafeDoWhile04 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int kopi, teh, roti, hrgKopi = 12000, hrgTeh = 7000, hrgRoti = 20000;
        String namaPelanggan;
        
        do {
            System.out.print("Masukkan nama pelanggan (ketik 'batal' untuk keluar): ");
            namaPelanggan = sc.nextLine();
            if (namaPelanggan.equalsIgnoreCase("batal")) {
                System.out.println("Transaksi dibatalkan.");
                break;
            }
            System.out.print("Jumlah Kopi: ");
            kopi = sc.nextInt();
            System.out.print("Jumlah Teh: ");
            teh = sc.nextInt();
            System.out.print("Jumlah Roti: ");
            roti = sc.nextInt();

            double totalHarga = (kopi*hrgKopi) + (teh*hrgTeh) + (roti*hrgRoti);
            System.out.println("Total yang harus dibayar: Rp " + totalHarga);
            sc.nextLine();
        } while (true);
        System.out.println("Semua transaksi selesai.");
    }
}
