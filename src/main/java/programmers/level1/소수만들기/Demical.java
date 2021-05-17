package programmers.level1.소수만들기;

public class Demical {

    private Boolean[] ertos = new Boolean[50000];
    private int answer=0;

    public int solution(int[] nums) {
//        init();

        bfs(nums,0,0,0);

        return answer;
    }

    private int bfs(int[] nums, int num,int total,int count){

        if(count==3){
            if(check(total)){
                answer++;
            }
//            if(ertos[total]==true){
//                answer++;
//            }
            return 1;
        }

        for(int i=num; i<nums.length; i++){
            total += nums[i];
            bfs(nums,i+1,total,++count);
            total -= nums[i];
            count--;
        }
        return 0;
    }

    // 소수 판별법 - 제곱근범위 나누기 _ 이문제 평균 1ms
    public Boolean check(int total){
        int count=2;
        int sqrt_Value = (int) Math.sqrt(total);

        while(total%count!=0){
            if(count>sqrt_Value){
                return true;
            }
            count++;
        }

        return false;
    }


// 에라토스테네스의 체 평균시간 6ms
//    public void init(){
//        ertos[0] = false;
//        ertos[1] = false;
//        for(int i=2; i<50000; i++){
//            if(ertos[i]==null){
//                ertos[i] = true;
//                for(int j=i+i; j<50000; j+=i){
//                    ertos[j]=false;
//                }
//            }
//        }
//    }
}
