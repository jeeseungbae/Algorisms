package programmersTest.level2Test.멀쩡한사각형;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import programmers.level2.멀쩡한사각형.Square;

public class SquareTest {

    @Test
    public void test1(){
        Square test = new Square();
        Assertions.assertEquals(test.solution(8,12),80);
    }

    @Test
    public void test2(){
        Square test = new Square();
        Assertions.assertEquals(test.solution(1,1),0);
    }

    @Test
    public void test3(){
        Square test = new Square();
        Assertions.assertEquals(test.solution(1,1),0);
    }

}
