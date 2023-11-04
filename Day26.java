
import java.util.Scanner;

public class Day26 {

    private static String i;
    public static void main(String[]args){
        // membuat array dan scanner
        String[][] meja = new String[2][3];
        Scanner scan = new Scanner(System.in);
        // mengisi setiap meja
        for(int bar = 0; bar < meja.length; bar++){
            for(int kol = 0; kol < meja[bar].length;kol++){
                System.out.format("Siapa yang akan duduk di meja (%d,%d): ", bar, kol);
                meja[bar][kol] = scan.nextLine();
                
                // menampilkan isi Array
                System.out.println("--------------------------------");
                for (String[] meja1 : meja) {
                    for (String item : meja[bar]) {
                        System.out.format("| %s | \t", meja[bar][kol]);
                        System.out.println("");
                        System.out.println("----------------------------");
                    }
                    }
}                   
        }
        
    }
}
