import java.util.Scanner;

public class Fungsi_28 {
    public static void main(String[] args) {
        int[][] dataBunga = {
        {10, 5, 15, 7},
        {6, 11, 9, 12},
        {2, 10, 10, 5},
        {5, 7, 12, 9}
    };
    int hargaBunga[] = {75000, 50000, 60000, 10000};
    hasil(dataBunga, hargaBunga);
    stock(dataBunga);
    kurang(dataBunga);
}

static void hasil(int dataBunga[][], int hargaBunga[]){
    int totalHasil = 0;
    for(int i = 0; i < dataBunga.length; i++){
        for(int j = 0; j < dataBunga[i].length; j++){
            totalHasil += dataBunga[i][j]*hargaBunga[j];
        }
        System.out.println("Penjualan Royal Garden"+(i+1)+" adalah " + totalHasil);
    }
    System.out.println("============================================================");
}

static void stock(int dataBunga[][]){
    for (int i = 0; i < dataBunga.length; i++){
        System.out.print("Stock Bunga "+(i+1)+ ": ");
        for (int j = 0; j < dataBunga[i].length; j++){
            System.out.print(dataBunga[i][j]);
        }
        System.out.println();
    }
    System.out.println("==============================================================");
}

static void kurang(int dataBunga[][]){
    for (int i = 0; i < dataBunga.length; i++){
        System.out.print("Stock" +(i+1)+ " setelah berkurang: ");
        for(int j = 0; j < dataBunga[i].length; j++){
            if(j==0){
                dataBunga[i][j] -= 1;
            } else if(j == 1){
                dataBunga[i][j] -=2;
            } else if(j == 3){
                dataBunga[i][j] -= 5;
            }
            System.out.print(dataBunga[i][j]);
        }
        System.out.println();
    }
}
}
