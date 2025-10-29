package Tugas2;

import java.util.ArrayList;

public class Toko {
    private ArrayList<Bunga> daftarBunga = new ArrayList<>();

    public Toko() {
        getDaftarBunga().add(new Bunga("Mawar", 10, 10000));
        getDaftarBunga().add(new Bunga("Melati", 8, 8000));
        getDaftarBunga().add(new Bunga("Anggrek", 5, 15000));
        getDaftarBunga().add(new Bunga("Tulip", 4, 20000));
        getDaftarBunga().add(new Bunga("Lavender", 6, 12000));
    }

    /**
     * Menampilkan daftar bunga
     * @return daftar bunga
     */
    public void tampilkanDaftar() {
        System.out.println("\n=== DAFTAR BUNGA ===");
        for (Bunga b : getDaftarBunga()) {
            System.out.println(getDaftar(b));
        }
    }

    /**
     * @param b
     * @return daftarBunga
     */
    private static String getDaftar(Bunga b) {
        return b.getNama() + " | Stok: " + b.getStok() + " | Harga: Rp" + b.getHarga();
    }

    public Bunga cariBunga(String nama) {
        for (Bunga b : getDaftarBunga()) {
            if (b.getNama().equalsIgnoreCase(nama)) {
                return b;
            }
        }
        return null;
    }

    /**
     * @param bunga, jumlah
     * kurangi stok
     */
    public void kurangiStok(Bunga bunga, int jumlah) {
        bunga.setStok(bunga.getStok() - jumlah);
    }

    /**
     * @return daftarBunga
     */
    public ArrayList<Bunga> getDaftarBunga() {
        return daftarBunga;
    }

    public void setDaftarBunga(ArrayList<Bunga> daftarBunga) {
        this.daftarBunga = daftarBunga;
    }
}
