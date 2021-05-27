package programmers.level1.예산;

import java.util.Arrays;

public class Budget {

    public int solution(int[] d, int budget) {
        int answer = 0;

        Arrays.sort(d);

        for(int i=0; i<d.length; i++){
            answer++;
            budget -= d[i];
            if(budget<0){
                budget+=d[i];
                answer--;
                break;
            }
        }

        return answer;
    }

}
