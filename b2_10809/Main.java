package b2_10809;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<Character, Integer> hm = new HashMap<>();
        String str = br.readLine();
        for(char c = 'a'; c <= 'z'; c++) {
            hm.put(c, -1);
        }
        for(int i = 0; i < str.length(); i++) {
            if(hm.get(str.charAt(i)) == -1)
                hm.put(str.charAt(i), i);
        }
        for(char c = 'a'; c <= 'z'; c++) {
            System.out.print(hm.get(c) + " ");
        }

    }
}
