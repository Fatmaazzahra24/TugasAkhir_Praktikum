import java.util.*;
public class SK2_SistemCafe {

    static Scanner sc=new Scanner(System.in);
    static String[] MenuCafe = {"KopiHitam", "Latte","TehTarik", "MiGoreng"};
    static  int  [] HargaMenu = {15000, 22000 , 12000 , 18000};
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
    }
    public static void tampilkanPesanan() {
        System.out.println("ini juga aku tes hehe");
    }    
}