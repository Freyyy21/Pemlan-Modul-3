package Tugas2;

public class Bunga {
    private String nama;
    private int stok;
    private int harga;

    public Bunga(String nama, int stok, int harga) {
        this.setNama(nama);
        this.setStok(stok);
        this.setHarga(harga);
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }
}
