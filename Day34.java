
import java.util.Scanner;

public class Day34 {
    public static void main(String[] args) {
        // Operator Aritmatika dan pembandingan
         int a = 35;
         int b = 20;
       
         int hasil;
         
         Scanner keyboard = new Scanner(System.in);
         
         System.out.print("Input angka-35: ");
        int angka35 = keyboard.nextInt();
        System.out.print("Input angka-20: ");
        int angka20 = keyboard.nextInt();
      
        
        // Perkalian
        hasil = angka35 * angka20;
        System.out.print("Hasil = " + hasil);
        System.out.println("Input angka-35: ");
        angka35 = keyboard.nextInt();
        System.out.println("Input angka-20: ");
        angka20 = keyboard.nextInt();
       
        // pembagian
        hasil = angka35 / angka20;
        System.out.println("Hasil = " + hasil);
        System.out.println("Input angka-35: ");
        angka35 = keyboard.nextInt();
        System.out.println("Input angka-20: ");
        angka20 = keyboard.nextInt();
   
        // Sisa Bagi
        hasil = angka35 % angka20;
        System.out.println("hasil = " + hasil);
       
        
        
         
    }
}
