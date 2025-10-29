package Tugas1;

public class Menu {
    String nama;
    double harga;

    public Menu(String nama, double harga){
        this.nama = nama;
        this.harga = harga;
    }

    public void tampilkanMenu(){
        System.out.println(nama + " -Rp" + harga);
    }
}


