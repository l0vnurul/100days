public class Day70 {
    public static void main(String[] args) {
        // menampilkan nama benda
         String[][] namabenda = {
            {"Sapu","Kunci","Terpal"},
            {"Sisir","Bedak","Lipstik"},
            {"Gayung","sepatu","kipas"}
        };
        for (int i = 0; i < namabenda.length;i++) {
            for (int j = 0; j < namabenda[i].length;j++) {
                System.out.println(namabenda[i][j]+" ");
            }
            System.out.println();
        }
    }
    
}
