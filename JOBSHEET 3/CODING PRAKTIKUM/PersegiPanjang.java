/**
 * PersegiPanjang
 */
public class PersegiPanjang {
    public int panjang;
    public int lebar;
    public int luas;
    public int keliling;

void cetakInfo(int i){
    System.out.print("Persegi Panjang ke-" + (i+1));
    System.out.print(", Panjang: "+ panjang); 
    System.out.print( ", Lebar: "+ lebar+ ", ");
}
public PersegiPanjang(){

}
public PersegiPanjang(int p, int l){
    panjang = p;
    lebar = l;
    }
void  keliling(){
    keliling = 2*(panjang+lebar);
    System.out.print(" Keliling: " +keliling+", ");
}
void luas (){
    luas = panjang*lebar;
    System.out.print(" Luas: " +luas);
    System.out.println();
}
}