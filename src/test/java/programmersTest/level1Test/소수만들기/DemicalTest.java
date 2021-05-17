package programmersTest.level1Test.소수만들기;

import org.junit.jupiter.api.Test;
import programmers.level1.소수만들기.Demical;

public class DemicalTest {

    @Test
    public void test1(){
        Demical test = new Demical();
        int[] nums = new int[]{1,2,3,4};
        System.out.println(test.solution(nums));
    }

    @Test
    public void test2(){
        Demical test = new Demical();
        int[] nums = new int[]{1,2,7,6,4};
        System.out.println(test.solution(nums));
    }

}
