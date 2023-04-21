import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Integer> dominoes = new ArrayList<>();
        dominoes.add(2);
        dominoes.add(4);
        dominoes.add(1);
        dominoes.add(3);
        dominoes.add(4);
        dominoes.add(6);
        dominoes.add(2);
        dominoes.add(4);
        dominoes.add(1);
        dominoes.add(6);
        
        int result = solution(dominoes);
        System.out.println("Minimum number of tiles to remove: " + result);
    }
    
    public static int solution(List<Integer> A) {
        int N = A.size() / 2;
        int count = 0;
        
        for (int i = 0; i < N - 1; i++) {
            int left1 = A.get(2 * i);
            int right1 = A.get(2 * i + 1);
            int left2 = A.get(2 * (i + 1));
            int right2 = A.get(2 * (i + 1) + 1);
            
            if (right1 != left2) {
                count++;
                
                if (left1 + right1 < left2 + right2) {
                    A.set(2 * (i + 1), left1);
                    A.set(2 * (i + 1) + 1, right1);
                } else {
                    A.set(2 * i, left2);
                    A.set(2 * i + 1, right2);
                }
            }
        }
        
        return count;
    }
}