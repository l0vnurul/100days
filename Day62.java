public class Day62 {
    public static void main(String[] args) {
        int[][] data = {
            {24, 32, 68},
            {55, 83, 99},
            {45,77,23}
        };
        int jumlah = 0;
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) 
                jumlah+= data[i][j];
        }
        System.out.println(jumlah);
    }
    
}
