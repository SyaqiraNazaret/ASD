
/**
 * CanteenDemo28
 */
public class CanteenDemo28 {

    public static void main(String[] args) {
        Item28 item1 = new Item28("Nasi Goreng", 15000, 10);
        Item28 item2 = new Item28("Donat Gula", 3000, 20);
        Item28 item3 = new Item28("Cimory", 7000, 15);
        Item28[] items =  new Item28[3];

        items[0] = item1;
        items[1] = item2;
        items[2] = item3;

        for (int i = 0; i < items.length; i++){
            items[i].displayInfo();
        }
    }

}
