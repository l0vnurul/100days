
import java.util.Scanner;

public class Day_14 {
    public static void main(String[]args) {
        
        Scanner input = new Scanner(System.in);
        
        int tanggal, bulan;
        System.out.println("Tanggal: ");
        
        tanggal = input.nextInt();
        System.out.println("Bulan: ");
        bulan = input.nextInt();
        
        if(tanggal > 31 || bulan > 12) {
            System.out.println("Info dong kak kalender mana sih yang bulannya bisa mencapai 13 atau tidak tanggalnya sampai tanggal 32, wkwk"
                   );
        }else if (tanggal <= 0 || bulan <=0){
            System.out.println("emang ada tanggal atau bulan nol ada di zodiak?...mana ada!");
        }else {
            if ( tanggal >= 21 && bulan == 3 || tanggal <= 19 && bulan == 4 ) {
                System.out.println("Aries");
            }else if (tanggal >= 20 && tanggal <= 30 && bulan == 4 || tanggal <= 20 && bulan == 5) {
                System.out.println("Taurus");
            }else if (tanggal >= 21 && bulan == 5 || tanggal <= 20 && tanggal >= 31 && bulan == 6) {
                System.out.println("Gemini");
            }else if (tanggal >= 21 && tanggal <= 30 && bulan == 6 || tanggal <= 22 && bulan == 6 ) {
                System.out.println("Cancer");
            }else if (tanggal >= 23 && bulan == 7 || tanggal <= 22 && bulan == 8) {
                System.out.println("Leo");
            }else if (tanggal >= 23 && bulan == 8 || tanggal <= 22 && tanggal >= 31 && bulan == 9) {
                System.out.println("Virgo");
            }else if (tanggal >= 23 && tanggal <= 30 && bulan == 9 || tanggal <= 22 && bulan == 10) {
                System.out.println("Libra");
            }else if (tanggal >= 23 && bulan == 10 || tanggal <= 21 && tanggal >= 31 && bulan == 11) {
                System.out.println("Scorpio");
            }else if (tanggal >= 22 && tanggal <= 30 && bulan == 12) {
                System.out.println("Sagitarus");
            }else if (tanggal >= 22 && bulan == 12 || tanggal <= 19 && bulan == 1) {
                System.out.println("Capricorn");
            }else if (tanggal >= 20 && bulan == 1 || tanggal <= 18 && tanggal >= 30 && bulan == 2) {
                System.out.println("Piesces");
            }else if (tanggal >= 30 && bulan == 2) {
                System.out.println("Bulan 2 cuman sampai tanggal 29 xixi:) ");
            }else if (tanggal >= 31 && bulan == 4) {
                System.out.println("Bulan 4 itu cuman 30..edd tidak fokus mi seng");{
                    
                
                
                
                   
                    
                    }
                    
            }
                
            }
        }
    }
    

