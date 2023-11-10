public class Day32 {
    public static void main(String[] args) {
        
        int angkaA = 6;
        int angkaB = 7;
        
        // Operator percabangan
        if (angkaA % 2 != 0) {
            System.out.println(angkaA + "adalah angka genap");
    } else {
            System.out.println(angkaA + "adalah angka ganjil");
            if (angkaB % 2 != 0) {
                System.out.println(angkaB + "adalah angka genap");
            } else {
                System.out.println(angkaB + "adalah angka ganjil");
                
            }
            
        }
        }
}
