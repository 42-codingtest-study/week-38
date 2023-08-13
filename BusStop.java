import java.util.Arrays;

public class BusStop {

    public static void main(String[] args) {
        int[][] answer1 = solution(3, new int[][]{{1, 2}});
        for(int[] row : answer1){
            System.out.println(Arrays.toString(row)); // {1,0,1},{2,1,2},{3,2,3}
        }
        System.out.println();

        int[][] answer2 = solution(3, new int[][]{{1, 2}, {3, 3}});
        for(int[] row : answer2){
            System.out.println(Arrays.toString(row)); // {1,0,1},{2,1,1},{2,1,0}
        }
    }

    public static int[][] solution(int N, int[][] bus_stop) {
        int[][] answer = new int[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                int minDistance = Integer.MAX_VALUE;
                for(int[] busStop : bus_stop){
                    int distance = Math.abs(i - busStop[0] + 1) + Math.abs(j - busStop[1] + 1);
                    minDistance = Math.min(minDistance, distance);
                }
                answer[i][j] = minDistance;
            }
        }

        return answer;
    }

}
