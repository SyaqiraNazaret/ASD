public class Faktorial28 {

    public int nilai;
    
    public int FactorialBF(int n) {
        int fakto = 1;
        for (int i = 1; i <= n; i++){
            fakto = fakto * i;
            }
        return fakto;
    }
    
    // public int FactorialDC(int n) {
    //     if (n==1){
    //         return 1;
    //     } else {
    //         int fakto = n * FactorialDC(n-1);
    //         return fakto;
    //     }
    // }
    
    public int FactorialDC(int n){
        int fakto = 1;
        int i = 1;
        while (i <= n) {
           fakto *= i;
           i++;
        }
        return fakto;
    }
    
}
