package programmersTest.level1Test.문자열내림차순으로배치하기;

import org.junit.jupiter.api.Test;
import programmers.level1.문자열내림차순으로배치하기.Dec;

public class DecTest {

    @Test
    public void Solution0(){
        Dec contry = new Dec();

        System.out.println(contry.solution("Zbcdefg"));
    }
    @Test
    public void Solution1(){
        Dec contry = new Dec();

        System.out.println(contry.solution("ABCDabcd"));
    }
}
