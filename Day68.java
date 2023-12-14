
public class Day68 {
    public static void main(String[] args) {
        // menghitung absenisasi siswa
        
        // Membuat array boolean untuk menyimpan kehadiran siswa
        boolean[] absenisasisiswa = {true, false, true, true, false, true};

        // Menampilkan kehadiran siswa
        System.out.println("Kehadiran Siswa: ");

        for (int i = 0; i < absenisasisiswa.length; i++) {
            System.out.println("Siswa " + (i + 1) + ": " + (absenisasisiswa[i] ? "Hadir" : "Tidak Hadir"));
        }
        
    }
    
}
