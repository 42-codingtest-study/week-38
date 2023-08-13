package b2_3052;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i = 0; i<42; i++) {
            hm.put(i, 0);
        }
        for(int i = 0; i < 10; i++) {
            int j = Integer.parseInt(br.readLine()) % 42;
            hm.put(j, hm.get(j)+1);
        }int k = 0;
        for(int i = 0; i<42; i++) {
            if(hm.get(i) != 0) k++;
        }
            System.out.print(k);

    }
}
