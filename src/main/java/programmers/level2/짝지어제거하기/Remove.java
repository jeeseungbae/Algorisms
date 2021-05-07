package programmers.level2.짝지어제거하기;

import java.util.ArrayList;

public class Remove {

    public int solution(String s){

        ArrayList<String> answerlist = new ArrayList<>();

        for(String i : s.split("")){
            answerlist.add(i);
            if(answerlist.size()>1){
                int last = answerlist.size();
                if(answerlist.get(last-1).equals(answerlist.get(last-2))){
                    answerlist.remove(last-1);
                    answerlist.remove(last-2);
                }
            }
        }
        if(answerlist.size()==0){
            return 1;
        }else{
            return 0;
        }

    }
}
