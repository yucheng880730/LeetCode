package Roman_To_Integer;

public class RomanToInteger {
    public int romanToInt(String s){

        char[] RomanCharArray = new char[s.length()];

        for(int i = 0; i < s.length(); i++){
            RomanCharArray[i] = s.charAt(i);
        }

        int value = 0;

        for(int j = s.length() - 1; j >= 0; j--){
            if(RomanCharArray[j] == 'I'){
                value = value + 1;
            }else if(RomanCharArray[j] == 'V'){
                if(j - 1 >= 0){
                    if(RomanCharArray[j-1] == 'I'){
                        value = value + 4;
                        j--;
                    }else {
                        value = value + 5;
                    }
                } else {
                    value = value + 5;
                }
            }else if(RomanCharArray[j] == 'X'){
                if(j - 1 >= 0){
                    if(RomanCharArray[j-1] == 'I'){
                        value = value + 9;
                        j--;
                    }else {
                        value = value + 10;
                    }
                } else {
                    value = value + 10;
                }
            }else if(RomanCharArray[j] == 'L'){
                if(j - 1 >= 0){
                    if(RomanCharArray[j-1] == 'X'){
                        value = value + 40;
                        j--;
                    }else {
                        value = value + 50;
                    }
                } else {
                    value = value + 50;
                }
            }else if(RomanCharArray[j] == 'C'){
                if(j - 1 >= 0){
                    if(RomanCharArray[j-1] == 'X'){
                        value = value + 90;
                        j--;
                    }else {
                        value = value + 100;
                    }
                } else {
                    value = value + 100;
                }
            }else if(RomanCharArray[j] == 'D'){
                if(j - 1 >= 0){
                    if(RomanCharArray[j-1] == 'C'){
                        value = value + 400;
                        j--;
                    }else {
                        value = value + 500;
                    }
                } else {
                    value = value + 500;
                }
            }else if(RomanCharArray[j] == 'M'){
                if(j - 1 >= 0){
                    if(RomanCharArray[j-1] == 'C'){
                        value = value + 900;
                        j--;
                    }else {
                        value = value + 1000;
                    }
                } else {
                    value = value + 1000;
                }
            }
        }
        System.out.println(value);
        return value;
    }
}


//        I can be placed before V (5) and X (10) to make 4 and 9.
//        X can be placed before L (50) and C (100) to make 40 and 90.
//        C can be placed before D (500) and M (1000) to make 400 and 900.