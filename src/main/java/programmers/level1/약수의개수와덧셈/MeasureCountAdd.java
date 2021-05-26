package programmers.level1.약수의개수와덧셈;

public class MeasureCountAdd {
    public int solution(int left, int right) {
        int answer = 0;


        for(int i=left; i<=right; i++){
            int x = count(i);
            if(x%2==0){
                answer+=i;
            }
            else{
                answer-=i;
            }
        }

        return answer;
    }

    public int count(int num){
        if(num==1){
            return 1;
        }
        int count=2;
        for(int i=2; i<=(int)Math.sqrt(num); i++){
            if(num%i==0){
                if(i==num/i){
                    count++;
                }
                else{
                    count+=2;
                }
            }
        }
        return count;
    }
}
