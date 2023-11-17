
import java.util.Scanner;

public class Day40 {
    public static void main(String[] args) {
        // Operator Aritmatika Matematika
        // membuat nilai dan angka untuk di input
        int A = 20;
        byte angka26;
        short angka2;
        
        Scanner keyboard = new Scanner(System.in);
        
        /* menginput nilai dan angka*/
        System.out.print("Input nilai-20: ");
        int nilai20 = (int) keyboard.nextInt();
        System.out.print("Input angka-26: ");
        angka26 = (byte) keyboard.nextByte();
        System.out.print("Input angka-2: ");
        angka2 = (short) keyboard.nextShort();
        System.out.println("_________________________");
        
        /* meng-output nilai dan angka */
        // perkalian 
        System.out.println("Perkalian");
        long hasil = nilai20 * angka26 * angka2;
        System.out.print("Input nilai-20: ");
        nilai20 = (int) keyboard.nextInt();
        System.out.print("angka-26: ");
        angka26 = (byte) keyboard.nextByte();
        System.out.print("Iput angka-2: ");
        angka2 = (short) keyboard.nextShort();
        System.out.print("Hasil = " + hasil);
        System.out.println("___________________________");
  
        // pembagian
        System.out.println("Pembagian");
        hasil = nilai20 / angka26 / angka2;
        System.out.print("Input nilai-20: ");
        nilai20 = (int) keyboard.nextInt();
        System.out.print("Input angka-26: ");
        angka26 = (byte) keyboard.nextInt();
        System.out.print("Input angka-2: ");
        angka2 = (short) keyboard.nextShort();
        System.out.println("Hasil = " + hasil);
        System.out.println("___________________________");
        
        // Penjumlahan dan pengurangan
        System.out.println("Penjumlahan dan pengurangan");
        hasil = nilai20 + angka26 - angka2;
        System.out.print("Input nilai-20: ");
        nilai20 = (int) keyboard.nextInt();
        System.out.print("Input angka-26: ");
        angka26 = (byte) keyboard.nextInt();
        System.out.print("Input angka-2: ");
        angka2 = (short) keyboard.nextInt();
        System.out.println("Hasil= " + hasil);
        System.out.println("____________________________");
        // perkalian dan pembagian
        System.out.println("Perkalian dan pembagian");
        hasil = nilai20 / angka26 * angka2;
        System.out.print("Input nilai-20: ");
        nilai20 = (int) keyboard.nextInt();
        System.out.print("Input angka-26: ");
        angka26 = (byte) keyboard.nextByte();
        System.out.print("Input angka-2: ");
        angka2 = (short) keyboard.nextShort();
        System.out.println("Hasil: " + hasil);
     
       int nilai, angka;
        System.out.print("nilai: ");
        nilai = keyboard.nextInt();
        System.out.print("angka: ");
        angka = keyboard.nextInt();
        
        if(nilai > 20 || angka > 2) {
            System.out.println("Apa iya?");
        }else if ( angka26 <= angka2) {
            System.out.println("hmmm?");
           
                
            }
        }
    
        
       
        
    }

