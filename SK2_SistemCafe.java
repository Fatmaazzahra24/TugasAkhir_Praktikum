import java.util.*;
public class SK2_SistemCafe {

    static Scanner sc=new Scanner(System.in);
    static String[] MenuCafe = {"KopiHitam", "Latte","TehTarik", "MiGoreng"};
    static  int  [] HargaMenu = {15000, 22000 , 12000 , 18000};
    static String [][] pesanan = new String[50][5]
    public static void main(String[] args) {
    int pilihan_menu ;
        
        for (pilihan_menu= 0 ; pilihan_menu != 3; ){
            System.out.println("========================================");
            System.out.println("Selamat Datang di Sistem Pemesanan Cafe!");
            System.out.println("========================================");
            System.out.println("1. Tambahkan Pesanan ");
            System.out.println("2. Tampilkan Daftar Pesanan ");
            System.out.println("3. Keluar  ");
            System.out.print(" Pilih menu yang tersedia : ");
            pilihan_menu = sc.nextInt();
            sc.nextLine();

            if (pilihan_menu == 1) {
                tambahpesanan();

            } else if (pilihan_menu == 2 ) {
                tampilkanPesanan ();

            } else if (pilihan_menu == 3) {
                System.out.println("Terima Kasih ! Program telah selesai.");
                break;
            } else {
                System.out.println("Pilihan menu tidak tersedia! silahkan coba lagi.");
            }
        }
    }
    public static void tambahpesanan() {
        System.out.println("tes fungsi agar bisa ku run ya");
        String namaPelanggan = sc.nextLine();

        System.err.print("Masukkan nomor meja: ");
        int nomorMeja = sc.nextInt();
        sc.nextLine();
        int totalHargaPesanan = 0;

        while (true) {
            System.out.println("===== MENU KAFE =====");
            for (int i = 0; i < MenuCafe.length; i++) {
                System.out.printf("%d. %s - Rp %d\n", i + 1, MenuCafe[i], HargaMenu[i]);
            }
            System.out.println("0. Selesai");
            System.out.print("Pilih menu (masukkan nomor menu, atau 0 untuk selesai): ");
            int pilihanMenu = sc.nextInt();

            if (pilihanMenu == 0) break;

            if (pilihanMenu < 1 || pilihanMenu > MenuCafe.length) {
                System.out.println("Nomor menu tidak valid. coba lagi.");
                continue;
            }

            String namaMenu = MenuCafe[pilihanMenu - 1];
            int harga = HargaMenu[pilihanMenu - 1];

            System.out.print("Masukkan jumlah item untuk " + namaMenu + ": ");
            int jumlahItem = sc.nextInt();

            if (jumlahItem <= 0) {
                System.out.println("Anda belum memasukkan item apapun, coba lagi");
                continue;
            }

            int totalHarga = jumlahItem * harga;
            totalHargaPesanan += totalHarga;

            pesanan[TotalPesanan][0] = namaPelanggan;
            pesanan[TotalPesanan][1] = nomorMeja;
            pesanan[TotalPesanan][2] = namaMenu;
            pesanan[TotalPesanan][3] = jumlahItem;
            pesanan[TotalPesanan][4] = totalHarga;
            totalPesanan++;

            System.out.println("Pesanan berhasil ditambahkan");
        }   

        System.out.println("Total harga pesanan: Rp " + totalHargaPesanan);
    }

    public static void tampilkanPesanan() {
        System.out.println("===== DAFTAR PESANAN =====");
        System.out.printf("%-20s %-15s %-15s %-10s %-10s\n", "Nama Pelanggan", "Nomor Meja", "Jumlah", "Total Harga");
        for (int i = 0; i < totalPesanan; i++) {
            System.out.printf("%-20s %-15s %-15s %-10s %-10s\n", pesanan[i][0], pesanan[i][1], pesanan[i][2], pesanan[i][3], pesanan[i][4]);
        }
    }    
}