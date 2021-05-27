package programmersTest.level1Test.실패율;

import org.junit.jupiter.api.Test;
import programmers.level1.실패율.FailurePercent;

public class FailurePercentTest {

    @Test
    public void test1(){
        FailurePercent test = new FailurePercent();
        test.solution(5,new int[]{2, 1, 2, 6, 2, 4, 3, 3});
    }
    @Test
    public void test2(){
        FailurePercent test = new FailurePercent();
        test.solution(4,new int[]{4,4,4,4,4});
    }
}
