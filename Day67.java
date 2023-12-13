public class Day67 {
    public static void main(String[] args) {
        // menampilkan angka array menggunakan perulangan do-while
        // menginput data
        int[] angka = {2, 4, 8, 12, 18, 20, 22, 24};

        // Mencetak array menggunakan do-while loop
        System.out.println("Elemen-elemen array:");
        int i = 0;
        do {
            System.out.print(angka[i]+" ");
            i++;
        } while (i < angka.length);
    }
        
}
