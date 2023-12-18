
import java.util.Arrays;

public class Day72 {
    public static void main(String[] args) {
        // menampilkan nilai mahasiswa
          int[] nilaiMahasiswa = {25,70,73,83,39,99,88,761,60,64};
        System.out.println("Nilai Mahasiswa :"+Arrays.toString(nilaiMahasiswa));
        for (int i = 0; i < nilaiMahasiswa.length; i++) {
            if(nilaiMahasiswa[i]>75){
                System.out.println("Selamat, anda lulus dengan nilai "+nilaiMahasiswa[i]);
            }
        }
    }
    
}
