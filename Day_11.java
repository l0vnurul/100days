
import java.util.Scanner;

public class Day_11 {
    public static void main(String[]args) {
        // Operator Aritmatika
            int angka5;
            int angka9;
            int hasil;
            
            Scanner keyboard = new Scanner(System.in);
            
            System.out.println("Input angka-5: ");
            angka5 = keyboard.nextInt();
            System.out.println("Input angka-9: ");
            angka9 = keyboard.nextInt();
      
            
            // perkalian
            hasil = angka5 * angka9;
            System.out.println("Hasil = " + hasil);
            System.out.println("Input angka-5: ");
            angka5 = keyboard.nextInt();
            System.out.println("Input angka-9: ");
            angka9 = keyboard.nextInt();
            
            // pembagian
            hasil = angka5 / angka9;
            System.out.println("Hasil = " + hasil);
            System.out.println("Input angka-5: ");
            angka5 = keyboard.nextInt();
            System.out.println("Input angka-9: ");
            angka9 = keyboard.nextInt();
            
            // sisa bagi
            hasil = angka5 % angka9;
            System.out.println("hasi;l = " + hasil);
            
            
    }
}
