
import java.util.Scanner;


public class Day_9 {
    public static void main(String[]args){
      int angka8;
      int angka16;
      int hasil;
      
      Scanner keyboard = new Scanner(System.in);
      
        System.out.println("Input angka-8: ");
        angka8 = keyboard.nextInt();
        System.out.println("Input angka-16: ");
        angka16 = keyboard.nextInt();
        
        // Pembagian
        hasil = angka8 / angka16;
        System.out.println("Hasil = " + hasil);
        System.out.println("Input angka-8: ");
        angka8 = keyboard.nextInt();
        System.out.println("Input angka-16: ");
        angka16 = keyboard.nextInt();
        
        // Sisa bagi
        hasil = angka8 % angka16;
        System.out.println("Hasil = " + hasil);
        
      
        
    }
}
