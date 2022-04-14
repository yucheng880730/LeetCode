package Test20220414;

public class Testfunction {

    public int solution(String S) {

        int ans = 0;
        char[] person = new char[S.length()];

        for(int j = 0; j < S.length(); j++){
            person[j] = S.charAt(j);
        }

        for(int i = 0; i < S.length(); i++ ){

            // arrow up must move
            if(person[i] == '^' ) {
                person[i] = 0;
                ans++;
                System.out.println("this is ^");
                System.out.println(ans);
            }

            // arrow down must move
            if(person[i] == 'v') {
                person[i] = 0;
                ans++;
                System.out.println("this is v");
                System.out.println(ans);
            }

            // last arrow right must move
            if(person[i] == '>') {
                if(i == person.length - 1) {
                    ans++;
                    System.out.println("this is >");
                    System.out.println(ans);
                }
            }

            if(person[i] == '<') {
                if(i == 0) {
                    person[i] = 0;
                    ans++;
                    System.out.println("this is < for first num");
                    System.out.println(ans);
                }else {
                    if(person[i-1] == 0) {
                        person[i] = 0;
                        ans++;
                        System.out.println("this is <");
                        System.out.println(ans);
                    }
                }
            }

        }

        System.out.println(ans);
        return ans;
    }
}
