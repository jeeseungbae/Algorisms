package programmers.level2.openchat;

import java.util.ArrayList;
import java.util.HashMap;

public class openchat {

    private HashMap<String,Integer> id = new HashMap<String, Integer>();
    private ArrayList<int[]> timeanswer = new ArrayList<>();
    private ArrayList<String> nickname = new ArrayList<>();


    public String[] solution(String[] record) {
        int count=0;

        for (String i : record){

            String[] word = i.split(" ");

            if(word[0].equals("Enter")){
                if(id.containsKey(word[1])){
                    int index = id.get(word[1]);
                    nickname.set(index,word[2]);
                    timeanswer.add(new int[]{0,index});
                }
                else{
                    nickname.add(word[2]);
                    timeanswer.add(new int[]{0,count});
                    id.put(word[1],count++);
                }
            }
            else if(word[0].equals("Leave")){
                int index = id.get(word[1]);
                timeanswer.add(new int[]{1,index});
            }
            else if(word[0].equals("Change")){
                int index = id.get(word[1]);
                nickname.set(index,word[2]);
            }
        }

        String[] answer = new String[timeanswer.size()];

        for(int i =0; i<timeanswer.size(); i++){
            if(timeanswer.get(i)[0]==0){
                answer[i] = nickname.get(timeanswer.get(i)[1])+"님이 들어왔습니다.";
            }
            else if(timeanswer.get(i)[0]==1){
                answer[i] = nickname.get(timeanswer.get(i)[1])+"님이 나갔습니다.";
            }
        }

        return answer;
    }
}
