
import java.util.Scanner;

public class Day29 {
    public static void main(String[]args){
        // percabangan
        // cek nilai
        Scanner sc = new Scanner(System.in);
        int nilai;
        String nama_,alamat_,kelas$;
        
        System.out.print("Nama: ");
        nama_= sc.nextLine();
        System.out.print("Alamat: ");
        alamat_= sc.nextLine();
        System.out.print("Kelas: ");
        kelas$= sc.nextLine();
        System.out.print("Nilai: ");
        nilai= sc.nextInt();
        
        if(nilai >= 95 ) {
            System.out.print("Anda Mendapatkan Nilai A+");
        }else if(nilai >= 90 ) {
            System.out.print("Anda Mendapatkan Nilai A");
        }else if(nilai >= 85 ) {
            System.out.print("Anda Mendapatkan Nilai A-");
        }else if(nilai >=80 ) {
            System.out.print("Anda Mendapatkan Nilai B+");
        }else if(nilai >=75 ) {
            System.out.print("Anda Mendapatkan Nilai B-");
        }else if(nilai >= 70 ) {
            System.out.print("Anda Mendapatkan Nilai B");
        }else if(nilai >= 65 ) {
            System.out.print("Anda Mendapatkan Nilai C");
        }else if(nilai >= 60 ) {
            System.out.print("Anda Mendapatkan Nilai D");
            System.out.print("Nama" + "Alamat" + "Kelas" + "Anda Mendapatkan Nilai");
            
        }
        
    }
}
