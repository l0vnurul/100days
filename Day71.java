public class Day71 {
    public static void main(String[] args) {
        
        System.out.println("Mencetak isi array dengan do whlie");
        int [][] angka = {
            {1,-1,2,4,6,-9,-7,7},
            {-9,-6,5,-11}
        };
        int i = 0;
        do{
            int j = 0;
            do{
                System.out.print(angka[i][j]+" ");
                j++;
            }while(j < angka[i].length);
            System.out.println();
            i++;
        }while(i < angka.length);
    }
    
}
