import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numCases = Integer.valueOf(in.nextLine());
        for (int i = 0; i < numCases; i++) {
            // Get number of engines and skip engine names
            int numEngines = Integer.valueOf(in.nextLine());
            for (int j = 0; j < numEngines; j++) {
                in.nextLine();
            }
            // Calc
            int numQueries = Integer.valueOf(in.nextLine());
            int numSwitches = 0;
            Set<String> set = new HashSet<>();
            for (int j = 0; j < numQueries; j++) {
                String line = in.nextLine();
                set.add(line);
                if (set.size() == numEngines) {
                    numSwitches++;
                    set.clear();
                    set.add(line);
                }
            }
            System.out.println("Case #" + (i+1) + ": " + numSwitches);
        }
    }
}
