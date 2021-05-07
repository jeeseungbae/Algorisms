package programmersTest.level2Test.짝지어제거하기;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import programmers.level2.짝지어제거하기.Remove;

public class removeTest {

    @Test
    public void test1(){
        Remove test = new Remove();
        Assertions.assertEquals(test.solution("baabaa"),1);
    }

    @Test
    public void test2(){
        Remove test = new Remove();
        Assertions.assertEquals(test.solution("cdcd"),0);
    }

}
