package Square_Root;

// time limit exceeded but it is a correct solution
public class SquareRoot {
    public int mySqrt(int x) {

        int res = 0;
        for(int i = 0; i <= x; i++){
            if(i * i == x){
                res = i;
                break;
            }
            else if(i * i > x){
                res = i - 1;
                break;
            }
        }
        System.out.println(res);
        return res;
    }
}
