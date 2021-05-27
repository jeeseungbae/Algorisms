package programmers.level1.체육복;

public class Uniform {

    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        int[] students = new int[n+2];

        students[0]=-1;
        students[n+1]=-1;

        for(int i:reserve){
            students[i] +=1;
        }

        for(int i:lost){
            students[i] -=1;
        }

        for(int i=1; i<=n; i++){
            int front = i-1;
            int back = i+1;

            if(students[i]<0 && students[front]>0){
                students[front]-=1;
                students[i] +=1;
            }
            else if(students[i]<0 && students[back]>0){
                students[back]-=1;
                students[i] +=1;
            }
            if(students[i]>=0){
                answer++;
            }
        }
        return answer;
    }
}
