
import java.util.Scanner;

public class Day61 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int awal, akhir;
        System.out.println("Range angka");
        System.out.print("Awal : ");
        awal = sc.nextInt();
        System.out.print("Akhir : ");
        akhir = sc.nextInt();
        for(int a = awal; a <= akhir; a++){
            System.out.println(a);
        }
    }
    
}
