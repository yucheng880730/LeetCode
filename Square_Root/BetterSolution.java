package Square_Root;

// Binary search
public class BetterSolution {
    public int mySqrt(int x){
        // 先取中間值
        long high = (x / 2) + 1;
        long low = 0;
        while (high >= low){

            long mid = (high + low) / 2;

            if (mid * mid == x){
                return (int)mid;
            }
            else if (mid * mid > x){
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }

        }
        return (int)high;
    }
}
