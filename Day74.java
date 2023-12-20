
import java.util.Scanner;

public class Day74 {
    public static void main(String[] args) {
        
        //menentukan harga diskon
        // menginput variabel
        Scanner scan = new Scanner(System.in);
        int belanjaan, diskon, bayar;
        String kartu;
        
        System.out.print("Apakah ada kartu member: ");
        kartu = scan.nextLine();
        System.out.print("Total belanjaan: ");
        belanjaan = scan.nextInt();

        // menggunakan percabangan bersarang
        if (kartu.equalsIgnoreCase("ya")) {
            if (belanjaan >= 500000) {
                diskon = 50000;
            } else if (belanjaan >= 100000) {
                diskon = 15000;
            } else {
                diskon = 0;
            }

        } else {
            if (belanjaan > 100000) {
                diskon = 5000;
            } else {
                diskon = 0;
            }
        }

        bayar = belanjaan - diskon;

        System.out.println("Total Bayar: Rp " + bayar);
    }
    }
    

