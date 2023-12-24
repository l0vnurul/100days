import java.util.Scanner;
public class Day77 {
    public static void main(String[] args) {
        // menentukan batas nilai
         Scanner sc = new Scanner(System.in);
        int total = 0;
        
        System.out.println("Masukkan batas nilai: ");
        int batas = sc.nextInt();
        
        for (int i = 1; i <= batas; i++){
            System.out.print(i);
            total += i;
            if (i < batas){
                System.out.print("+");
            }else{
                System.out.print("= ");
                System.out.print(total);
            }           
        }
        System.out.println();
    }
    
}
