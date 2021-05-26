package programmers.level2.게임맵최단거리;

import java.util.LinkedList;
import java.util.Queue;

public class GameMap {

    private Queue<int[]> store = new LinkedList<>();
    private int[] dx = new int[]{1,0,-1,0};
    private int[] dy = new int[]{0,1,0,-1};


    public int solution(int[][] maps) {

        int n = maps.length;
        int m = maps[0].length;
        store.add(new int[]{0,0});
        maps[0][0]=0;

        bfs(maps,n,m,2);

        if(maps[n-1][m-1]==1){
            return -1;
        }
        else{
            return maps[n-1][m-1];
        }
    }

    public boolean bfs(int[][] board, int n, int m, int count){

        int num = store.size();

        if(num==0){
            return false;
        }

        for(int i=0; i<num; i++){
            int[] pos = store.poll();

            if(pos[0]==n-1&&pos[1]==m-1){
                board[n-1][m-1]=count-1;
                return true;
            }


            for(int j=0; j<4; j++){
                int newdx = pos[0] + dx[j];
                int newdy = pos[1] + dy[j];

                if(0<=newdx&&n>newdx&&0<=newdy&&m>newdy) {
                    if (board[newdx][newdy] == 1) {
                        board[newdx][newdy]=count;
                        store.add(new int[]{newdx, newdy});
                    }
                }
            }
        }

        if(bfs(board,n,m,++count)){
            return true;
        }
        return false;
    }
}
