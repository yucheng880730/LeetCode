package Test20220415;

public class Ques3 {
    public int solutions(int N, String S) {
        int seatAllocated = N * 3;

        if(S.contains("")) {
            String[] splitSeatReservation = S.split("");
            if(splitSeatReservation != null) {
                for(int i = 0; i < splitSeatReservation.length; i++) {
                    String seatReservation = splitSeatReservation[i];
                    char col = seatReservation.charAt(1);
                    if((col == 'B' | col == 'C' || col == 'D' || col == 'E')
                        || (col == 'D' || col == 'J' || col == 'F' || col == 'G')
                        || (col == 'H' || col == 'J' || col == 'F' || col == 'G'))
                            seatAllocated -= 1;
                    if(col == 'D' || col == 'E' || col == 'F' || col == 'G')
                        seatAllocated -= 2;
                }
            }
        }

        return  seatAllocated;
    }
}
