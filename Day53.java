
import java.util.Scanner;

public class Day53 {
    public static void main(String[] args) {
        Scanner masuk = new Scanner(System.in);
        int pil;
        System.out.print("Masukkan pilihan: ");
        pil = masuk.nextInt();
        switch (pil){
            
            
            case 1: System.out.println("Jurusan Teknik INFORMATIKA");break;
            case 2: System.out.println("Jurusan EKONOMI");break;
            case 3: System.out.println("Jurusan PGSD");break;
            case 4: System.out.println("Jurusan Teknik SIPIL");break;
            case 5: System.out.println("Jurusan Teknik PWK");break;
            default: System.out.println("Pilihan Salah!!!");break;
            
        }
    }
    
}
