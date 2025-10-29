package Tugas2;

import java.util.Scanner;

public class Main {

    public static final int DISCOUNT_MEMBER = 3000;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Toko toko = new Toko();

        int pilih;
        do {
            System.out.println("\n=== TOKO BUNGA SEJAHTERA ===");
            System.out.println("1. Lihat daftar bunga");
            System.out.println("2. Beli bunga");
            System.out.println("3. Keluar");
            System.out.print("Pilih menu: ");
            pilih = input.nextInt();
            input.nextLine();

            if (pilih == 1) {
                toko.tampilkanDaftar();

            } else if (pilih == 2) {
                System.out.print("Masukkan nama bunga: ");
                String nama = input.nextLine();
                Bunga bunga = toko.cariBunga(nama);

                if (bunga == null) {
                    System.out.println("❌ Bunga tidak ditemukan!");
                    continue;
                }

                System.out.print("Masukkan jumlah yang dibeli: ");
                int jumlah = input.nextInt();

                System.out.println("Apakah anda adalah member? (y/n): ");
                String member = input.nextLine();
                input.nextLine();

                if (jumlah > bunga.getStok()) {
                    System.out.println("❌ Stok tidak cukup! Stok tersedia: " + bunga.getStok());
                } else {
                    if (member.equalsIgnoreCase("n") ) {
                        toko.kurangiStok(bunga, jumlah);
                        System.out.println("✅ Pembelian berhasil!");
                        System.out.println("Total harga: Rp" + bunga.getHarga() * jumlah);
                    }else {
                        toko.kurangiStok(bunga, jumlah);
                        System.out.println("✅ Pembelian berhasil!");
                        System.out.println("Total harga: Rp" + (bunga.getHarga() * jumlah - DISCOUNT_MEMBER));
                    }
                }

            } else if (pilih == 3) {
                System.out.println("Terima kasih telah berbelanja di Toko Bunga Sejahtera 🌸");
            } else {
                System.out.println("Pilihan tidak valid!");
            }

        } while (pilih != 3);
    }
}
