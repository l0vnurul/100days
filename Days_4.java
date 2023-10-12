
import java.util.Scanner;
public class Days_4 {
    public static void main(String[]args) {
        Scanner input = new Scanner (System.in);
        double gaji_bersih;
        System.out.println("Masukkan penghasilan anda");
        double penghasilan = input.nextDouble();
        
        if (penghasilan >= 3000000 && penghasilan < 5000000){
            System.out.println("Gaji Bersih Anda Adalah " + (gaji_bersih = penghasilan-(penghasilan*0.05)));
            System.out.println("Karena Di Potong Pajak Sebesar 5%");
        } else if (penghasilan >= 5000000 && penghasilan < 7000000){
            System.out.println("Gaji Bersih Anda Adalah " + (gaji_bersih = penghasilan));
            System.out.println("Karena Tidak Dikenakan Pajak");
        }else {
            System.out.println("Gaji Bersih Anda Adalah " + (gaji_bersih = (penghasilan-(penghasilan*0.15))));
            System.out.println("Karena Di Potong Pajak Sebesar 15%");
        }
      
        
      
      
      
        
        
        
      
        
        
    }
}
