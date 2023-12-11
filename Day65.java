
import java.util.Arrays;
import java.util.Scanner;

public class Day65 {
    public static void main(String[] args) {
         String nama1;
        Scanner sc = new Scanner(System.in);    

        System.out.println("Masukkan nama ");
        nama1 = sc.nextLine();
        String[] nama = new String[5];
        int i = 0;
        while(i < nama.length){
            nama[i] = sc.next();
            i++;
        }
        
        System.out.print(Arrays.toString(nama));
        
    }
    
}
