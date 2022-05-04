package Sum_Of_All_Odd_Length_Array;

public class SumOfAllOddLengthArray {
    public int sumOddLengthSubarrays(int[] arr) {

        int sum = 0;
        int n = arr.length;

        for(int i = 0; i < arr.length; i++){
            int end = i + 1;
            int start = n - i;
            int total = start * end;
            int odd = total / 2;
            if(total % 2 == 1) odd++;

            sum = sum + odd * arr[i];

        }

        return sum;
    }
}
