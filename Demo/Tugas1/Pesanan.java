package Tugas1;

public class Pesanan {
    Menu menu;
    int jumlah;

    public Pesanan(Menu menu, int jumlah){
        this.menu = menu;
        this.jumlah = jumlah;
    }

    public double hitungSubtotal(){
        return menu.harga * jumlah;
    }
}
