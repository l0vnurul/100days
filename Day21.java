
import java.util.Scanner;

public class Day21 {
    public static void main(String[]args) {
        // Percabangan
   Scanner input = new Scanner (System.in);
   System.out.println("Masukkan nominal gaji anda: ");
   double gaji_bersih;
   double penghasilan = input.nextDouble();
        
   
   if (penghasilan >= 300000 && penghasilan < 500000) {
       System.out.println("Gaji Bersih Anda Adalah " + (gaji_bersih = penghasilan- (penghasilan*0.05)));
       System.out.println("Karena dipotong pajak sebesar 5%");
   }else if (penghasilan >= 500000 && penghasilan < 700000) {
       System.out.println("Gaji bersih anda adalah " + (gaji_bersih = penghasilan-(penghasilan*0.1)));
       System.out.println("Karena di potong pajak sebesar 10%");
   }else if(penghasilan < 300000){
       System.out.println("Gaji bersih anda adalah " + (gaji_bersih = penghasilan));
       System.out.println("Karena tidak dikenakan pajak");
   }else {
       System.out.println("Gaji bersih anda adalah " + (gaji_bersih = (penghasilan-(penghasilan*0.15))));
       System.out.println("Karena di potong pajak sebesar 15%");
       
      
   }

    }
    }
