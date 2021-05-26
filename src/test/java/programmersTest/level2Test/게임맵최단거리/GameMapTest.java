package programmersTest.level2Test.게임맵최단거리;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import programmers.level2.게임맵최단거리.GameMap;

public class GameMapTest {

    @Test
    public void test1(){
        GameMap test = new GameMap();
        int[][] map = new int[][]{{1,0,1,1,1},{1,0,1,0,1},{1,0,1,1,1},{1,1,1,0,1},{0,0,0,0,1}};
        Assertions.assertEquals(test.solution(map),11);
    }

    @Test
    public void test2(){
        GameMap test = new GameMap();
        int[][] map = new int[][]{{1,0,1,1,1},{1,0,1,0,1},{1,0,1,1,1},{1,1,1,0,0},{0,0,0,0,1}};
        Assertions.assertEquals(test.solution(map),-1);
    }
}
