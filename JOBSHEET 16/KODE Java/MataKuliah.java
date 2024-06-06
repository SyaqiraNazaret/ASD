import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MataKuliah {
    private String nim;
    private String nama;

    public MataKuliah(String nim, String nama) {
        this.nim = nim;
        this.nama = nama;
    }

    public String getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }

    @Override
    public String toString() {
        return "Kode: " + nim + ", Nama: " + nama;
    }
}