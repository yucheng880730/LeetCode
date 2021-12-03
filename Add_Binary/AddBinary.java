package Add_Binary;

public class AddBinary {
    public String addBinary(String a, String b) {

        // looping backward
        int i = a.length() - 1;
        int j = b.length() - 1;

        int carry = 0;

        // compare to string, string builder have more elasticity
        StringBuilder str = new StringBuilder();

        while(i >= 0 || j >= 0){
            int sum = carry;

            //另一種將 char 轉換為 int 的方法是從 "0" 字元中減去。
            if(i >= 0) sum += a.charAt(i) - '0';
            if(j >= 0) sum += b.charAt(j) - '0';

            str.append(sum % 2);

            carry = sum / 2;

            i--;
            j--;
        }

        if(carry != 0) {
            str.append(carry);
        }

        return str.reverse().toString();
    }
}
