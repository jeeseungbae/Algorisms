package programmers.level2.프린터;

import java.util.LinkedList;
import java.util.Queue;

public class Printer {
    private Queue<Integer> list = new LinkedList<>();

    public int solution(int[] priorities, int location) {
        int answer = 0;
        int n = priorities.length;
        int imp = priorities[location];
        int[] count = new int[10];
        int max =0;

        for(int i=0; i<n; i++){
            int x =priorities[i];
            list.add(x);
            count[x]++;
            if(max<x){
                max = x;
            }
        }

        while(!(location==0&&max==imp)){
            int x = list.poll();

            if(x<max){
                if(location!=0){
                    list.add(x);
                    location--;
                }
                else{
                    list.add(x);
                    location=list.size()-1;
                }
            }
            else if(x==max){
                location--;
                count[x]--;
                answer++;
                if(count[x]==0){
                    while(count[x]==0){
                        x--;
                    }
                    max=x;
                }
            }
        }

        return answer;
    }
}
