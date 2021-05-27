package programmers.level1.최대공약수와최소공배수;

public class Factor {

    public int[] solution(int n, int m) {
        int[] answer = {};

        int tmp = Math.min(n,m);
        int new_n = Math.max(n,m);
        int new_m = tmp;

        while(new_m!=0){
            tmp = new_n%new_m;
            new_n = new_m;
            new_m = tmp;
        }

        int max_factor = new_n;
        int min_factor = n*m/max_factor;

        answer = new int[]{max_factor,min_factor};

        return answer;
    }

}
