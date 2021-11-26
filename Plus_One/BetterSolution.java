package Plus_One;

public class BetterSolution {
    public int[] plusOne(int[] digits){

        boolean check = false;
        int n = digits.length-1;

        for(int i = n; i >= 0; i--){
            int temp = digits[i]+1;
            if(temp >= 10){
                check = true;
                digits[i] = temp % 10;
            }
            else{
                check = false;
                digits[i] = temp;
                break;
            }
        }

        // 如果有進位
        if(check) {

            int[] c = new int[digits.length+1];

            System.arraycopy(new int[] {1}, 0, c, 0, 1);
            System.arraycopy(digits, 0, c, 1, digits.length);
            return c;
        }
        return digits;
    }
}
