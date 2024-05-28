import java.util.Scanner;
public class PersegiPanjangDemo {

public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan panjang array: ");
        //int length = sc.nextInt();
     
        PersegiPanjang[] arrayOfPersegiPanjang = new PersegiPanjang[3];
        //myarrayOfPersegiPanjang[5].panjang = 20;
    int panjang, lebar, luas, keliling;
    for (int i = 0; i < 3; i++){
        System.out.println("Persegi panjang ke-" + (i+1));
        System.out.print("Masukkan panjang: ");
        panjang = sc.nextInt();
        System.out.print("Masukkan lebar: ");
        lebar = sc.nextInt();

        arrayOfPersegiPanjang[i] = new PersegiPanjang(panjang, lebar);
    
    }

    for (int i = 0; i <  arrayOfPersegiPanjang.length; i++) {
        arrayOfPersegiPanjang[i].cetakInfo(i);
        arrayOfPersegiPanjang[i].keliling();
        arrayOfPersegiPanjang[i].luas();


    //  for (int i = 0; i< 3; i++){
    //     arrayOfPersegiPanjang[i] = new PersegiPanjang();

    //     System.out.println("Persegi Panjang ke-" + (i+1));
    //     System.out.print("Masukkan Panjang: ");
    //     arrayOfPersegiPanjang[i].panjang = sc.nextInt();
    //     System.out.print("Masukkan Lebar: ");
    //     arrayOfPersegiPanjang[i].lebar = sc.nextInt();
    // }
    //  for  (int j = 0; j < 3; j++) {
    //     System.out.println("Persegi Panjang ke-" + (j+1)+ ", panjang: " + arrayOfPersegiPanjang[j].panjang + ", lebar: " + arrayOfPersegiPanjang[j].lebar);
    // }

    // arrayOfPersegiPanjang[0] = new PersegiPanjang();
    // arrayOfPersegiPanjang[0].panjang = 110;
    // arrayOfPersegiPanjang[0].lebar = 30;

    // arrayOfPersegiPanjang[1] = new PersegiPanjang();
    // arrayOfPersegiPanjang[1].panjang = 80;
    // arrayOfPersegiPanjang[1].lebar = 40;

    // arrayOfPersegiPanjang[2] = new PersegiPanjang();
    // arrayOfPersegiPanjang[2].panjang = 100;
    // arrayOfPersegiPanjang[2].lebar = 20;

    // System.out.println("Persegi Panjang ke-1, panjang: " + arrayOfPersegiPanjang[0].panjang+ ", lebar " + arrayOfPersegiPanjang[0].lebar);
    // System.out.println("Persegi Panjang ke-2, panjang: " + arrayOfPersegiPanjang[1].panjang+ ", lebar " + arrayOfPersegiPanjang[1].lebar);
    // System.out.println("Persegi Panjang ke-3, panjang: " + arrayOfPersegiPanjang[2].panjang+ ", lebar " + arrayOfPersegiPanjang[2].lebar);
}
}
}
