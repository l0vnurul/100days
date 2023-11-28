public class Day52 {
    public static void main(String[] args) {
        // menjumlahkan isi Array
        //memasukkan inputan nilai
        int[] nilai ={40,25,32,46,55};
        /* maka penjumlahan dilakukan dari angka 0 yang di isi angka 40 seperti 0 = 40 di jumlahkan 1 = 25 
         sehingga hasilnya 65 begitulah seterusnya hingga mencapai hasil 198 */
       int jumlah = 0;
       for(int i=0; i<nilai.length;i++){
            jumlah+=nilai[i];
       }
    }
    
}
