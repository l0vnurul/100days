
import java.util.Scanner;


public class Day_6 {
    public static void main(String[]args) {
        int angka5;
        int angka2;
        int angka4;
        int angka8;
        int angka1;
        int angka3;
        int angka9;
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Input angka-5: ");
        angka5 = keyboard.nextInt();
        System.out.println("Input angka-2: ");
        angka2 = keyboard.nextInt();
        System.out.println("Input angka-4: ");
        angka4 = keyboard.nextInt();
        System.out.println("Input angka-8: ");
        angka8 = keyboard.nextInt();
        System.out.println("Input angka-1: ");
        angka1 = keyboard.nextInt();
        System.out.println("Input angka-3: ");
        angka3 = keyboard.nextInt();
      
        
        // penjumlahan
        int hasil = angka5 + angka2;
        System.out.println("Hasil = " + hasil);
        System.out.println("Input angka-5 ");
        angka5 = keyboard.nextInt();
        System.out.println("Input angka-2: ");
        angka2 = keyboard.nextInt();
        hasil = angka4 + angka8;
        System.out.println("Hasil = " + hasil);
        System.out.println("Input angka-4: ");
        angka4 = keyboard.nextInt();
        System.out.println("Input angka-8: ");
        angka8 = keyboard.nextInt();
        hasil = angka1 + angka3 ;
        System.out.println("Hasil = " + hasil);
        System.out.println("Input angka-1: ");
        angka1 = keyboard.nextInt();
        System.out.println("Input angka-3: ");
        angka3 = keyboard.nextInt();
        
        // perkurangan
        hasil = angka5 - angka2;
        System.out.println("Hasil = " + hasil);
        System.out.println("Input angka-5 ");
        angka5 = keyboard.nextInt();
        System.out.println("Input angka-2 ");
        angka2 = keyboard.nextInt();
        hasil = angka8 - angka4;
        System.out.println("Hasil = " + hasil);
        System.out.println("Input angka-8 ");
        angka8 = keyboard.nextInt();
        System.out.println("Input angka-4 ");
        angka4 = keyboard.nextInt();
        hasil = angka1 - angka3;
        System.out.println("Hasil = " + hasil);
        System.out.println("Input angka-1 ");
        angka1 = keyboard.nextInt();
        System.out.println("Input angka-3 ");
        angka3 = keyboard.nextInt();
        
        
        
       
        
        
        
        
    }
}
