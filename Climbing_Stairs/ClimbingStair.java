package Climbing_Stairs;

public class ClimbingStair {
    public int climbStairs(int n) {
        if(n == 1) return 1;
        if(n == 2) return 2;
        if(n == 3) return 3;

        int[] newArray = new int[n + 1];

        newArray[0] = 0;
        newArray[1] = 1;
        newArray[2] = 2;
        newArray[3] = 3;

        // concept of Fibonacci number
        for(int i = 4; i <= n; i++){
            newArray[i] = newArray[i - 1] + newArray[i - 2];
        }

        System.out.println(newArray[n]);
        return newArray[n];
    }
}
