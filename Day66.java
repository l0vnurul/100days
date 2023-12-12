public class Day66 {
    public static void main(String[] args) {
        // menampilkan bilangan negatif dam positif dalam array
        // menginput data variabel
         byte nilai[] = {4,2,-6,-4,-12,-24,-3,-9};
        int count = 0;
        System.out.print("nilai positif dalam array adalah :");
        for (int i = 0; i < nilai.length; i++) {
            if(nilai[i]>0){
                System.out.println(nilai[i]);
            }
        }
        System.out.print("nilai negatif dalam array adalah :");
        for (int i = 0; i < nilai.length; i++) {
            if(nilai[i] < 0){
                System.out.println(nilai[i]);
    }
    
}
    }
}