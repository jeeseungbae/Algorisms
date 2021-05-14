package programmers.level1.문자열내림차순으로배치하기;

import java.util.Arrays;
import java.util.Comparator;

public class Dec {

    public String solution(String s) {
        StringBuilder answer = new StringBuilder();

        String[] list_s = s.split("");

        Arrays.sort(list_s, Comparator.reverseOrder());

        for(String i : list_s){
            answer.append(i);
        }

// 배열 이중탐색 활용..... 효율이 낮아보임 개선 필요
//        char[] answerlist = new char[s.length()];
//
//        for(int i=0; i<s.length(); i++){
//            answerlist[i] = s.charAt(i);
//        }
//
//        check(answerlist,0,answerlist.length-1);
//
//        for(char i : answerlist){
//            answer.append(i);
//        }

        return answer.toString();
    }

    public int check(char[] anwerlist ,int a,int b){

        if(b-a<=1){
            return 1;
        }

        int half = Math.round((a+b)/2);
        int lt = a;
        int rt = b;

        while(lt<rt){
            if(anwerlist[lt]<anwerlist[half]){
                char tmp = anwerlist[lt];
                anwerlist[lt] = anwerlist[half];
                anwerlist[half] = tmp;
                lt =a;
                rt =b;
            }
            else{
                lt++;
            }
            if(anwerlist[half]<anwerlist[rt]){
                char tmp = anwerlist[rt];
                anwerlist[rt] = anwerlist[half];
                anwerlist[half] = tmp;
                rt = b;
                lt = a;
            }
            else{
                rt--;
            }
        }

        return check(anwerlist,a,half)+check(anwerlist,half+1,b);
    }

}
