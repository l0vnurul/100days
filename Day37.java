
import java.util.Scanner;

public class Day37 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int panjang,lebar,luas;
        System.out.print("Masukkan nilai panjang: ");
        panjang = input.nextInt();
        System.out.print("Masukkan nilai lebar: ");
        lebar = input.nextInt();
        luas = panjang*lebar;
        System.out.println("Keseluruhannya adalah" + luas + "cm");
    }
}
