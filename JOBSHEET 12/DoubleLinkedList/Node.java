public class Node {
    String nama;
    int nomor;
    Node prev, next;

    Node(String nama, int nomor) {
        this.nama = nama;
        this.nomor = nomor;
        prev = null;
        next = null;
    }
}
