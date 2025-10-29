package Tugas1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Menu m1 = new Menu("Nasi Goreng", 12000);
        Menu m2 = new Menu("Mi Goreng", 15000);
        Menu m3 = new Menu("Capcay", 25000);

        Nota nota = new Nota();

        System.out.println("Selamat Datang!");
        System.out.println("Menu hari ini:");
        m1.tampilkanMenu();
        m2.tampilkanMenu();
        m3.tampilkanMenu();

        String next;
        do {
            System.out.println("Masukkan nama menu: ");
            String namaMenu = sc.nextLine();

            Menu selectedMenu = null;
            if (namaMenu.equalsIgnoreCase("Nasi Goreng")) selectedMenu = m1;
            else if (namaMenu.equalsIgnoreCase("Mi Goreng")) selectedMenu = m2;
            else if (namaMenu.equalsIgnoreCase("Capcay")) selectedMenu = m3;
            else System.out.println("Menu tidak tersedia!");

            if (selectedMenu != null){
                System.out.println("Jumlah: ");
                int jumlah = sc.nextInt();
                sc.nextLine();
                nota.tambahPesanan(new Pesanan(selectedMenu, jumlah));
            }
            System.out.println("Tambah pesanan lagi? (ya/tidak): ");
            next = sc.nextLine();
        }while (next.equalsIgnoreCase("ya"));

        nota.cetakNota();
        sc.close();



    }
}
