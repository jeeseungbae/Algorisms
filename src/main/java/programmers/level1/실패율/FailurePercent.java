package programmers.level1.실패율;

import java.util.*;

public class FailurePercent {

    private HashMap<Integer,Double> list;
    private List<Integer> keyList;

    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        int[] count = new int[N+1];
        int total = stages.length;
        list= new HashMap<>();

        for(int i=0; i<stages.length; i++){
            if(stages[i]>N){}
            else{count[stages[i]]++;}
        }

        for(int j=1; j<N+1; j++){
            double x;
            if(total==0){
                x = (double)0;
            }
            else{
                x = (double)count[j]/total;
            }
            list.put(j,x);
            total -= count[j];
        }

        keyList = new ArrayList<>(list.keySet());

        Collections.sort(keyList,(o1,o2)->{
            if(list.get(o1).equals(list.get(o2))){
                return o1.compareTo(o2);
            }
            else{
                return list.get(o2).compareTo(list.get(o1));
            }
        });


        for(int i=0; i<N; i++){
            answer[i] = keyList.get(i);
        }

        return answer;
    }
}
