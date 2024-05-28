import java.util.Scanner;
public class SortMain28{
    public static void main(String[] args) {
    int data[] = {10,40,30,50,70,20,100,90};
    System.out.println("sorting dengan merge sort");
    MergeShorting28 mSort =  new MergeShorting28();
    System.out.println("Data Awal");
    mSort.printArray(data);
    mSort.mergesort(data);
    System.out.println("Data setelah diurutkan");
    mSort.printArray(data);
    }
}