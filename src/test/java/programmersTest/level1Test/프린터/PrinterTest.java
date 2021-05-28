package programmersTest.level1Test.프린터;

import org.junit.jupiter.api.Test;
import programmers.level2.프린터.Printer;

public class PrinterTest {

    @Test
    public void test1(){
        Printer test = new Printer();
        test.solution(new int[]{1, 1, 9, 1, 1, 1},0);
    }
}
