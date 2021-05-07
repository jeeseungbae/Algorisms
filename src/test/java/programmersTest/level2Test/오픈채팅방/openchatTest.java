package programmersTest.level2Test.오픈채팅방;

import org.junit.jupiter.api.Test;
import programmers.level2.오픈채팅방.openchat;

public class openchatTest {

    @Test
    public void test1(){
        String[] record = new String[]{"Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"};
        openchat test = new openchat();
        for(String i :test.solution(record)){
            System.out.println(i);
        }
    }

    @Test
    public void test2(){
        String[] record = new String[]{"Enter Uid1234 Muzi","Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"};
        openchat test = new openchat();
//        test.solution(record);
        for(String i :test.solution(record)){
            System.out.println(i);
        }
    }
}
