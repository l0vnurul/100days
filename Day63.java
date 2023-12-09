
import java.util.Scanner;

public class Day63 {
    public static void main(String[] args) {
        
        // membuat array buah-buahan
        String[] buah = new String[5];
        
        // membuat scanner
        Scanner sc = new Scanner(System.in);
        
        // mengisi data ke array
        for( int i = 0; i < buah.length; i++ ){
            System.out.println("Buah ke-" + i + ": ");
            buah[i] = sc.nextLine();
        }
        System.out.println("_____________________________");
        // menampilkan semua isi
        for( String b : buah ){
            System.out.println(b);
        }
     
        }
    }
    

