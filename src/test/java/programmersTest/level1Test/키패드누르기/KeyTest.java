package programmersTest.level1Test.키패드누르기;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import programmers.level1.키패드누르기.Key;

public class KeyTest {

    @Test
    public void test1(){
        Key test = new Key();
        int[] numbers = new int[]{1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
        Assertions.assertEquals(test.solution(numbers,"right"),"LRLLLRLLRRL");
    }

    @Test
    public void test2(){
        Key test = new Key();
        int[] numbers = new int[]{7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2};
        Assertions.assertEquals(test.solution(numbers,"left"),"LRLLRRLLLRR");
    }

    @Test
    public void test3(){
        Key test = new Key();
        int[] numbers = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        Assertions.assertEquals(test.solution(numbers,"right"),"LLRLLRLLRL");
    }

}
