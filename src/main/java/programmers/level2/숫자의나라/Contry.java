package programmers.level2.숫자의나라;

public class Contry {


    public String solution(int n) {
        StringBuilder sb = new StringBuilder();
        // String 과 비교하여 시간차이에서 월등히 좋다.

        int newNumber;

        while(n>0){
            newNumber = n%3;

            if(newNumber==0){
                sb.insert(0,4);
                n=n/3-1;
            }
            else{
                sb.insert(0,newNumber);
                n=n/3;
            }
        }
        return sb.toString();
    }
}
