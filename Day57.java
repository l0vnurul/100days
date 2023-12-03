
import java.util.Scanner;

public class Day57 {
    public static void main(String[] args) {
        // membuat array nama benda
        String[] benda = new String[5];
        
        // membuat scanner
        Scanner sc = new Scanner(System.in);
        
        // mengisi data ke array
        for(int i = 0; i < benda.length; i++ ){
            System.out.print("Benda ke-" + i + ": ");
            benda[i] = sc.nextLine();
        }
         System.out.println("--------------------------");
         // menampilkan semua isi array
         for( String b : benda ){
             System.out.println(b);
           
        }
    }
    
}
