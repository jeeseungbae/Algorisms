package programmers.level1.실패율;

import java.util.*;

public class FailurePercent {

    private HashMap<Float,Integer> list;

    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        list = new HashMap<>();
        List<Float> arr = new ArrayList<>();

        for(int i=0; i<N; i++){
            int users = 0;
            int no_clearUsers = 0;
            for(int j=0; j<stages.length; j++){
                if(i<=j){
                    users++;
                }
                if(i==j){
                    no_clearUsers++;
                }
            }
            float x = (float)no_clearUsers/users;
            list.put(x,i+1);
            arr.add(x);
        }

        Arrays.sort(arr);

        for(int i=0; i<N; i++){
            answer[i]=list.get(arr.get(i));
        }

        return answer;
    }
}
