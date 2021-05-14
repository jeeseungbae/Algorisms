package programmers.level1.키패드누르기;

import java.util.HashMap;

public class Key {

    private HashMap<Integer,int[]> postion = new HashMap<>();
    private StringBuilder answer;
    private int leftHand;
    private int rightHand;

    public String solution(int[] numbers, String hand) {
        answer = new StringBuilder();
        leftHand = 10;
        rightHand = 11;
        init();

        for(int i=0; i<numbers.length; i++){
            if(numbers[i]==1||numbers[i]==4||numbers[i]==7){
                putAnswer("L",numbers[i]);
            }
            else if(numbers[i]==3||numbers[i]==6||numbers[i]==9){
                putAnswer("R",numbers[i]);
            }
            else{
                int[] number = postion.get(numbers[i]);
                int[] left_thumb = postion.get(leftHand);
                int[] right_thumb = postion.get(rightHand);

                if(distance(left_thumb,number)>distance(right_thumb,number)){
                    putAnswer("R",numbers[i]);
                }
                else if(distance(left_thumb,number)<distance(right_thumb,number)){
                    putAnswer("L",numbers[i]);
                }
                else if(hand.charAt(0)=='r'){
                    putAnswer("R",numbers[i]);
                }
                else if(hand.charAt(0)=='l'){
                    putAnswer("L",numbers[i]);
                }
            }
        }

        return answer.toString();
    }

    public void putAnswer(String hand,int number){
        if(hand.equals("R")){
            answer.append("R");
            rightHand = number;
        }
        else{
            answer.append("L");
            leftHand = number;
        }
    }

    // 거리 계산
    public int distance(int[] x, int[] y){
        return Math.abs(x[0]-y[0])+Math.abs(x[1]-y[1]);
    }

    public void init(){
        postion.put(1,new int[]{0,0});
        postion.put(2,new int[]{0,1});
        postion.put(3,new int[]{0,2});
        postion.put(4,new int[]{1,0});
        postion.put(5,new int[]{1,1});
        postion.put(6,new int[]{1,2});
        postion.put(7,new int[]{2,0});
        postion.put(8,new int[]{2,1});
        postion.put(9,new int[]{2,2});
        postion.put(10,new int[]{3,0}); // * == 10
        postion.put(0,new int[]{3,1});
        postion.put(11,new int[]{3,2}); // # == 11
    }

}
