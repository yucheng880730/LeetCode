package Merge_Sorted_Array;

public class main {
    public static void main(String[] args) {

        int[] a = {1, 5, 9};
        int[] b = {2, 6, 7, 11, 15};

        MergeSortedArray mergeSortedArray = new MergeSortedArray();
        mergeSortedArray.merge(a, 8, b,5 );
    }
}
