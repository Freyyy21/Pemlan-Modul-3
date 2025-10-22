import java.util.InputMismatchException;
import java.util.Scanner;

public class Codelab1 {


    public static void main(String[] args) {
        //Program Menghitung luas persegi panjang
        //Test Commit

        double panjang;
        double lebar;

        Scanner input = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("Masukkan panjang: ");
                panjang = input.nextDouble();
                System.out.print("Masukkan lebar: ");
                lebar = input.nextDouble();
                double luas = panjang * lebar;
                System.out.println("Luas dari persegi panjang " + panjang + " x " + lebar + " adalah " + luas);
                break;

            } catch (InputMismatchException e) {
                System.out.println("Input tidak valid!");
                input.nextLine();
            }

        }


        input.close();
    }
}
