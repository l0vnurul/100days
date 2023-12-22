
import java.util.Scanner;

public class Day76 {
    public static void main(String[] args) {
        
        // menghitung umur sesuai tahun menggunakan array
        
          int jumlahOrang = 5;
        int tahunLahir [] = new int[jumlahOrang];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < tahunLahir.length; i++) {
            System.out.print("Masukkan tahun lahir orang ke-" + (i + 1) + ": ");
            tahunLahir[i] = sc.nextInt();
        }
        int tahunSekarang = 2023;
        System.out.println("\nUmur setiap orang:");
        for (int i = 0; i < tahunLahir.length; i++) {
            int umur = tahunSekarang - tahunLahir[i];
            System.out.println("Orang ke-" + (i + 1) + ": " + umur + " tahun");
        }
    }
    
}
