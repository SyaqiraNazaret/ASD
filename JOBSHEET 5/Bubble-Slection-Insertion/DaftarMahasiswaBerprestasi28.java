public class DaftarMahasiswaBerprestasi28 {
    Mahasiswa28 listMhs[] = new Mahasiswa28[5];
    int idx;

    void tambah(Mahasiswa28 m){
        if (idx < listMhs.length){
            listMhs[idx] = m;
            idx++;
        } else {
            System.out.println("Data sudah penuh!!");
        }
    }
    void  tampil() {
        for (Mahasiswa28 m : listMhs){
            m.tampil();
            System.out.println("-----------------------------------");
        }
    }
    void bubbleSort(){
        for(int i = 0; i<listMhs.length-1;i++){
            for(int j=1; j<listMhs.length; j++){
                if(listMhs[j].ipk > listMhs[j-1].ipk){
                    //proses penukaran atau swap
                    Mahasiswa28 tmp = listMhs[j];
                    listMhs[j] = listMhs[j-1];
                    listMhs[j-1] = tmp;
                }
            }
        }
     }
    void selectionSort(){
        for(int i = 0; i<listMhs.length-1; i++){
            int idxMin = i;
            for (int j = i+1; j < listMhs.length; j++) {
                if(listMhs[j].ipk < listMhs[idxMin].ipk){
                    idxMin = j;
                }
            }
            Mahasiswa28 tmp = listMhs[idxMin];
            listMhs[idxMin] = listMhs[i];
            listMhs[i] = tmp;
        }
    }
    void insertionSort(){
        for (int i = 1; i < listMhs.length; i++) {
            Mahasiswa28 temp = listMhs[i];
            int j = i - 1;
            while(j >= 0 && listMhs[j].ipk < temp.ipk){
                listMhs[j+1] = listMhs[j];
                j--;
            }
            listMhs[j+1] = temp;
        }
    }
}