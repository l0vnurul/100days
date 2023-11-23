
import java.util.Scanner;

public class Day47 {
    public static void main(String[] args) {
       // Menentukan nilai
       
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Nama anda: ");
        System.out.print("Masukkan nilai: ");
        int nilai = sc.nextInt();
        if(nilai >=90 && nilai <= 100){
            System.out.println("nilai huruf kamu adalah A");
        }else if( nilai >= 80 && nilai <= 89){
            System.out.println("Nilai huruf kamu adalah B");
        }else if( nilai >= 70 && nilai <= 79) {
            System.out.println("Nilai huruf kamu adalah C");
        }else if( nilai >= 60 && nilai <= 69) {
            System.out.println("Nilai huruf kamu adalah D");
        }else if(nilai >= 0 && nilai <= 59){
            System.out.println("Nilai huruf kamu adalah E");
            System.out.println("-------------------------------------");
            
           
            
        }
    }
        }
    


    
    

    
    

