# Toko Bunga Sejahtera 

Sebuah program sederhana berbasis Java yang mensimulasikan **toko bunga**. Pengguna dapat melihat daftar bunga, membeli bunga, dan mendapatkan diskon khusus jika merupakan member.

## Deskripsi
Program ini dibuat menggunakan **Java** dengan konsep **Object-Oriented Programming (OOP)**.  
Terdapat tiga class utama:
- `Bunga` : merepresentasikan bunga dengan atribut nama, stok, dan harga.
- `Toko` : mengelola daftar bunga, pencarian bunga, dan pengurangan stok.
- `Main` : antarmuka interaktif untuk pengguna, termasuk memilih menu, membeli bunga, dan menghitung harga.

## Fitur
- Menampilkan daftar bunga beserta stok dan harga.
- Membeli bunga dengan memasukkan nama dan jumlah.
- Diskon khusus untuk member sebesar **Rp3.000**.
- Validasi stok: pembelian gagal jika stok tidak mencukupi.
- Menu interaktif berbasis teks.

**Detail class:**

### `Bunga`
- Atribut:
    - `nama` : `String`
    - `stok` : `int`
    - `harga` : `int`
- Method:
    - Constructor `Bunga(String nama, int stok, int harga)`
    - Getter dan Setter untuk semua atribut

### `Toko`
- Atribut:
    - `daftarBunga` : `ArrayList<Bunga>`
- Method:
    - `tampilkanDaftar()` : menampilkan semua bunga
    - `cariBunga(String nama)` : mencari bunga berdasarkan nama
    - `kurangiStok(Bunga bunga, int jumlah)` : mengurangi stok bunga
    - Getter dan Setter untuk `daftarBunga`

### `Main`
- Menampilkan menu interaktif:
    1. Lihat daftar bunga
    2. Beli bunga
    3. Keluar
- Menghitung total harga pembelian, termasuk diskon member


