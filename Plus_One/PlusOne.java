package Plus_One;

public class PlusOne {
    public int[] plusOne(int[] digits) {

        int length = digits.length;

        for(int i = length - 1; i >= 0; i--){
            if(digits[i] < 9){
                digits[i]++;
                break;
            }
            else{
                digits[i] = 0;
            }
        }

        int[] newDigits;
        if(digits[0] == 0){
            newDigits = new int[digits.length + 1];
            newDigits[0] = 1;
            for(int j = 1; j < newDigits.length; j++){
                newDigits[j] = digits[j - 1];
            }
        } else {
            newDigits = new int[digits.length];
            for(int j = 0; j < newDigits.length; j++){
                newDigits[j] = digits[j];
            }
        }

        for(int a = 0; a < newDigits.length; a++){
            System.out.println(newDigits[a]);
        }

        return  newDigits;
    }
}
