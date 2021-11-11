package Number_of_Steps_to_Reduce_To_Zero;

public class NumberOfSteps {
    public int numberOfSteps(int num) {

        int count = 0;
        while(num != 0){

            if(num % 2 == 0){
                num = num / 2;
                count ++;
            }else{
                num = num - 1;
                count ++;
            }
        }
        System.out.println(count);
        return count;
    }
}
