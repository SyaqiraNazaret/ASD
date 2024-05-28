public class nilaiAkar28 {
    public int nilai;

    public int akarBF(int bilangan) {
        int akar = 0;
        while (akar * akar <= bilangan) {
            akar++;
        }
        return akar - 1;
    }

    public int akarDC(int bilangan, int min, int max) {
        if (max < min) {
            return min - 1;
        }
        int mid = (min + max) / 2;
        if (mid * mid == bilangan) {
            return mid;
        } else if (mid * mid < bilangan) {
            return akarDC(bilangan, mid + 1, max);
        } else {
            return akarDC(bilangan, min, mid - 1);
        }
    }
}
