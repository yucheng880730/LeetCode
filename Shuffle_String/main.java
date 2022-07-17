package Shuffle_String;

public class main {
    public static void main(String[] args) {

        String test = "codeleet";
        int[] indices = {4,5,6,7,0,2,1,3};

        ShuffleString shuffleString = new ShuffleString();
        shuffleString.restoreString(test, indices);
    }
}
