public class Prime {

    int factors = 0;
    int num;

    public boolean isPrime(int x){
        if(x == 1){
            return false;
        } else {
            num = 1;
            while (num < x) {
                if (x % num == 0) {
                    factors++;
                }
                num++;
            }

            if (factors < 3) {
                return true;
            } else {
                return false;
            }
        }
    }

}
