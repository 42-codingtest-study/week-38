import java.util.Arrays;

public class Exam {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[] {2, 2, 1}))); // 1, 1, 3
        System.out.println(Arrays.toString(solution(new int[] {3, 2, 1, 2}))); // 1, 2, 4, 2
    }

    public static int[] solution(int[] grade){
        int[] answer = new int[grade.length];

        for (int i = 0; i < grade.length; i++) {
            int rank = 1;
            for (int score : grade) {
                if(score > grade[i]) {
                    rank++;
                }
            }
            answer[i] = rank;
        }

        return answer;
    }

}
