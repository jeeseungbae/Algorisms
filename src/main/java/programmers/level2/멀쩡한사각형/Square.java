package programmers.level2.멀쩡한사각형;

public class Square {
    public long solution(long w, long h) {
        long answer = 1;

        long gcd_num = gcd(Math.max(w,h),Math.min(w,h));
        long w_cut = w/gcd_num;
        long h_cut = h/gcd_num;

        answer = w*h-(w_cut+h_cut-1)*gcd_num;

        return answer;
    }

    public long gcd(long max, long min){

        if(max%min==0){
            return min;
        }
        else{
            return gcd(min,max%min);
        }
    }
}
