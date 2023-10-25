 
import java.util.Scanner;
public class days_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int tanggal, bulan;
        System.out.println("Tanggal: ");
        tanggal = input.nextInt();
        System.out.println("Bulan: ");
        bulan = input.nextInt();

        if(tanggal > 31 || bulan > 12) {
            System.out.println("emang ada?");
        } else if (tanggal <= 0 || bulan <= 0){
            System.out.println("Serius masih percaya kalau ada tanggal dan bulan 0?");
        } else {


            if ( tanggal >= 21 && bulan == 3 || tanggal <= 19 && bulan == 4 ) {
                System.out.println("Aries");
            } else if (tanggal >= 20 && tanggal <= 30 && bulan == 4 || tanggal <= 20 && bulan == 5) {
                System.out.println("Taurus");
            } else if (tanggal >= 21 && bulan == 5 || tanggal <= 20 && tanggal >= 31 && bulan == 6) {
                System.out.println("Gemini");
            } else if ( tanggal >= 21 && tanggal <= 30 && bulan == 6 || tanggal <= 22 && bulan == 7) {
                System.out.println("Cancer");
            } else if ( tanggal >= 23 && bulan == 7 || tanggal <= 22 && bulan == 8) {
                System.out.println("Leo");
            } else if (tanggal >= 23 && bulan == 8 || tanggal <= 22 && tanggal >=31 && bulan == 9) {
                System.out.println("Virgo");
            } else if (tanggal >= 23 && tanggal <= 30 && bulan == 9 || tanggal <= 22 && bulan == 10) {
                System.out.println("Libra");
            }else if (tanggal >=23 && bulan == 10 || tanggal <= 21 && tanggal >= 31 && bulan == 11) {
                System.out.println("Scorpio");
            }else if (tanggal >= 22 && tanggal <= 30 && bulan == 11 || tanggal <= 21 && bulan == 12) {
                System.out.println("Sagitarius");
            }else if (tanggal >= 22 && bulan == 12 || tanggal <= 19 && bulan == 1) {
                System.out.println("Capricorn");
            }else if (tanggal >= 20 && bulan == 1 || tanggal <= 18 && tanggal >= 30 && bulan == 2) {
                System.out.println("Aquarius");
            }else if (tanggal >= 19 && tanggal <= 29 && bulan == 2 || tanggal <= 20 && bulan == 3) {
                System.out.println("Pisces");
            }else if (tanggal >= 30 && bulan == 2) {
                System.out.println("bulan 2 mah cuman nyampai tanggal 29 bang ");
            } else if (tanggal >= 31 && bulan == 4) {
                System.out.println("jangan rakus dengan tanggal bang");
            }else if (tanggal >= 31 && bulan == 6) {
                System.out.println("ngopi bang ngopi..yakali di bulan 6 nyampai tanggal 31");
            }else if (tanggal >= 31 && bulan == 9) {
                System.out.println("30 bulan 9 mana ada woii");
            }else if (tanggal >= 31 && bulan == 11) {
                System.out.println("auah..bulan 9 cuman nyamapai tanggal 30");
            }
        }
    }

}

        

        
   

