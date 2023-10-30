
import java.util.Scanner;

public class Day21 {
    public static void main(String[]args) {
        // Percabangan
       int belanjaan, diskon, bayar = 0;
       String kartu;
       Scanner scan = new Scanner(System.in);
       // mengambil input
        System.out.println("Apakah Anda mempunyai kartu member: ");
        kartu = scan.nextLine();
        System.out.println("Total belanjaan: ");
        belanjaan = scan.nextInt();
        
       // memProses
        if (kartu.equalsIgnoreCase("Ya")) {
            if (belanjaan > 500000){
            diskon = 50000;
            } else if (belanjaan > 100000){
                diskon = 15000;
            }else{
                diskon = 0;
            }
        } else {
            if (belanjaan > 100000) {
                diskon = 5000;
            } else {
                diskon = 0;
            }
        }
        // total yang harus dibayar
        System.out.println("Total Bayar: Rp " + bayar);
    }
    }
