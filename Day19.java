
import java.util.Scanner;

public class Day19 {
    public static void main(String[]args) {
       int nilai;
       String grade = null;
       Scanner scan = new Scanner(System.in);
       
        System.out.println("Inputkan nilai: ");
        nilai = scan.nextInt();
        
        if (nilai >= 90 ) {
            grade = "A";
       }else if (nilai >= 80 ) {
            grade = "B+";
       }else if (nilai >= 70 ) {
           grade = "B";
       }else if (nilai >= 60 ) {
           grade = "C+";
       }else if (nilai >= 50 ) {
           grade = "C";
       }else if (nilai >= 40 ) {
           grade = "D";
       }else if (nilai >= 30 ) {
           grade = "E";
       }
        System.out.println("Grade: " + grade);
                        
                        
        }
    }

