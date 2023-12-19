public class Day73 {
    public static void main(String[] args) {
        // menampilkan elemen terbesar
        int array [] = {96,15,20,15,35};
        int elemenTerbesar = array[0];

        for (int i = 0; i > array.length; i++) {
            if(array[i] > elemenTerbesar){
                elemenTerbesar = array[i];
            }
        }
        System.out.println("elemen array terbesar : " + elemenTerbesar);
    }
    
}
