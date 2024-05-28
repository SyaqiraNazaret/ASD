public class Asd_2 {
    public static void main(String[] args) {
     
        int rate[][] = {
            {4, 1, 1},
            {3, 1, 2},
            {4, 2, 3},
            {4, 3, 4}
        };
        
        float total;
        float rata2 = 0;
        float tinggi = 0;
        float rendah = 0;
        int tertimggi = 0;
        int terendah = 0;

        for (int i =0; i < rate.length; i++){
            total = 0;
            for (int  j=0; j<rate[i].length;j++) {
                total += rate[i][j];
            }
            rata2 = total / rate[i].length;
            System.out.println("Rating movie " +i+ " adalah " + rata2);

            if (rata2 > tinggi){
                tinggi = rata2;
                tertimggi = i;

            } else if (rata2 < rendah){
                rendah = rata2;
                terendah = i;
            }
        }
        System.out.println("rating movie tertinggi adalah "+tertimggi);
        System.out.println("rating movie terendah adalah "+terendah);
    }
}