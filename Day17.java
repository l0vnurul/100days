import java.util.Scanner;

public class Day17 {
    public static void main(String[]args) {
        
        Scanner input = new Scanner(System.in);
        
        int umur, kelas;
        System.out.println("Umur: ");
        
        umur = input.nextInt();
        System.out.println("Kelas: ");
        kelas = input.nextInt();
        
        if(umur > 17 || kelas > 12) {
            System.out.println("emang ada anak umur segitu udah kelas 7?"
                   );
        }else if (umur<= 0 || kelas <=9){
            System.out.println("emang ada?...mana ada! yakali anak baru lahir udah sekolah");
        }else {
            if ( umur >= 14 && kelas == 7 || umur <= 13 && kelas == 7 ) {
                System.out.println("Anak Smp kelas 7");
            
            }
                
            }
        }
    }


