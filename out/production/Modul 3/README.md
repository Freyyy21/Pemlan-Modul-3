# Program Untuk Menghitung Umur

## Fitur utama:
1. Menampilkan nama
2. Menampilkan jenis kelamin
3. Menampilkan umur berdasar tahun lahir

## Deskripsi Program
Program Java ini dibuat dengan memanfaatkan materi Java dasar dan juga beberapa fungsi bawaan dari java.
Program akan meminta memasukkan nama, jenis kelamin, lalu tahun lahir. Pertama nama akan diambil imputnya dengan **scanner** dan disimpan di variabel **name** dengan tipe String. Selanjutnya akan diminta input jenis kelamin dengan inputan berupa P/L yang akan disimpan di variabel **iptGender** bertipe String, input akan dicek di dalam blok if, dan pengecekan ini ada didalam perulangan while, agar program akan terus mengulang samapi inputan valid, disini jugalah **try-catch** digunakan, agar program tidak crash saat terjadi input tidak valid.
Selanjutnya user akan diminta memasukkan tahun lahir, dengan membuat object baru dari class yang telah diimport, fungsi bawaan dari class tersebut dapat digunakan, yaitu fungsi **LocalDate** , fungsi ini dapat memberikan return berupa waktu real.

## Fungsi yang dipakai:
1. Untuk mendapatkan waktu lokal secara real
  ` import java.time.LocalDate;`
2. Untuk mengatasi input yang tidak valid agar tidak crash
   `import java.util.InputMismatchException;`
3. Untuk mendapat inputan user
   `import java.util.Scanner;`

## Penggunaan class yang diimport
1. Local Date
   `LocalDate currentDate = LocalDate.now();`
2. InputMisMatchException
   `catch (InputMismatchException e)`
3. Scanner
   `Scanner ipt = new Scanner(System.in);`

