import java.util.Scanner;
public class Day64 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int angka[] = new int [5];
        System.out.println("Masukkan angka");
        for (int i = 0; i < angka.length; i++) {
            angka[i]= sc.nextInt();
        }
        System.out.println("Isi array adalah ");
        int j =0;
        do{
            System.out.println(angka[j]);
            j++;
        }while(j<angka.length);
    }
    
}
