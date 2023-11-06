
import java.util.Scanner;

public class Day28 {
  public static void main(String[]args){
      // Percabangan
      Scanner input = new Scanner(System.in);
      System.out.print("Masukkan sebuah angka: ");
      int angka = input.nextInt();
      
      if (angka > 0) {
          System.out.println("Angka yang kamu masukkan adalah angka positif.");
      } else if (angka < 0) {
          System.out.println("Angka yang kamu masukkan adalah angka negatif.");
          
      } else {
          System.out.println("Angka yang kamu masukkan adalah angka nol.");
      }
  }  
}
