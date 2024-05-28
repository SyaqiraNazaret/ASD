import java.util.Scanner;
public class mahasiswaMain28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        mahasiswa28[] arrayMahasiswa = new mahasiswa28[3];
        double ipk;
        double totalIPK = 0;
        int nim;
        String nama, jenisKelamin;

        for (int i = 0; i < 3; i++){
            arrayMahasiswa[i] = new mahasiswa28();

            System.out.println("Masukkan data mmahasiswa ke-" +(i+1));
            System.out.print("Masukkan nama: ");
            nama = sc.next();
            System.out.print("Masukkan NIM: ");
            nim = sc.nextInt();
            System.out.print("Masukkan jenis kelamin: ");
            jenisKelamin = sc.next();
            System.out.print("Masukkan IPK: ");
            ipk = sc.nextDouble();


            arrayMahasiswa[i] = new mahasiswa28(nim, nama, ipk , jenisKelamin);
            totalIPK += ipk;
        }
        System.out.println();
        int index = 0;
        for (mahasiswa28 mahasiswa28 : arrayMahasiswa) {
            mahasiswa28.infoMahasiswa(index);
            index++;
        }
        if (3 != 0){
            double rata2 = totalIPK/3;
            System.out.println("Rata-rata IPK: " +rata2);
        }
        System.out.println();
    }
    
}
