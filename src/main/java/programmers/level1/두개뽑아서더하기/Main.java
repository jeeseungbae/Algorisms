package programmers.level1.두개뽑아서더하기;
import org.junit.Test;
import java.util.*;

public class Main {

    private Set<Integer> answers = new TreeSet<>();

    @Test
    public void test1(){
        solution(new int[]{2,1,3,4,1}).equals(new int[]{2,3,4,5,6,7});
        solution(new int[]{5,0,2,7}).equals(new int[]{2,5,7,9,12});
    }

    public int[] solution(int[] numbers) {
        int[] answer = {};

        for(int i=0; i<numbers.length; i++){
            for(int j=i+1; j<numbers.length; j++){
                int x = numbers[i]+numbers[j];
                answers.add(x);
            }
        }

        answer=new int[answers.size()];
        Iterator<Integer> it = answers.iterator();

        for(int i=0; i<answers.size(); i++){
            answer[i] = it.next();
        }

        return answer;
    }

}
