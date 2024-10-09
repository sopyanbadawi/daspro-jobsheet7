import java.util.Scanner;
public class Tugas104 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int hrgTiket = 50000, totTerjual = 0, totTiket = 0;
        double diskon = 0, totPenjualan = 0;
        
        while (true) {
            System.out.print("Masukkan jumlah tiket terjual (ketik 0 untuk selesai): ");
            totTiket = sc.nextInt();
            
            if (totTiket == 0) {
                break;
            } 
            if (totTiket < 0) {
                System.out.println("Input yang dimasukkan tidak valid. Silahkan input kembali jumlah tiket yang benar");
                continue;
            }

            double hrgTotal = totTiket*hrgTiket;


            if (totTiket > 4) {
                diskon = 0.10;
            }
            if (totTiket > 10) {
                diskon = 0.15;
            }

            double hrgAfterDisc = hrgTotal*(1 - diskon);

            totTerjual += totTiket;
            totPenjualan += hrgTotal;

            System.out.println("Harga total untuk " + totTiket + " tiket adalah: Rp " + hrgAfterDisc);
        }
    }
}
