package Tugas1;

import java.util.ArrayList;

public class Nota {
    ArrayList<Pesanan> daftarPesanan = new ArrayList<>();

    public void tambahPesanan(Pesanan p){
        daftarPesanan.add(p);
    }

    public double hitungTotal(){
        double total = 0;
        for (Pesanan p : daftarPesanan){
            total += p.hitungSubtotal();
        }
        return total;

    }

    public void cetakNota() {
        System.out.println("===== NOTA PEMESANAN =====");
        for (Pesanan p : daftarPesanan) {
            System.out.println(p.menu.nama + " x " + p.jumlah + " = Rp" + p.hitungSubtotal());
        }
        System.out.println("---------------------------");
        System.out.println("TOTAL: Rp" + hitungTotal());

    }

}
