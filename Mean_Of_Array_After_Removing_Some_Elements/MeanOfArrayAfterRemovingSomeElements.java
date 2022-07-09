package Mean_Of_Array_After_Removing_Some_Elements;

import java.util.Arrays;

public class MeanOfArrayAfterRemovingSomeElements {
    public double trimMean(int[] arr){

        int size = arr.length;
        Arrays.sort(arr);
        int percent = (5 * size)/100;
        double count = 0;
        double sum = 0;

        if(percent > 0) {
            for(int i = percent; i < arr.length - percent; i++){
                sum += arr[i];
                count++;
            }
        }
        double mean = sum/count;
        System.out.println(mean);
        return mean;

    }
}
