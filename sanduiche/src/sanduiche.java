import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;;

public class sanduiche {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);

        int ingredients = in.nextInt();
        int sizeNotCombinations = in.nextInt();
        
        List<Integer[]> notCombinations = new ArrayList<>();

        for (int i = 0; i < sizeNotCombinations; i++) {
            Integer[] notCombination = new Integer[2];
            notCombination[0] = in.nextInt();
            notCombination[1] = in.nextInt();
            notCombinations.add(notCombination);
        }

        in.close();

        List<Integer[]> combinations = new ArrayList<>();

        for (int i = 1; i <= ingredients; i++) {
            for (int j = 0; j < i; j++) {
                Integer[] combination = new Integer[2];
                combination[0] = i;
                combination[1] = j;
                combinations.add(combination);
            }
        }    

        int allCombinations = 0;

        for (Integer[] combination : combinations) {
            if (!containsCombination(notCombinations, combination)) {
                allCombinations += 1;
            }
        }
        
        System.out.println(allCombinations);

    }
    public static boolean containsCombination(List<Integer[]> combinations, Integer[] targetCombination) {
        for (Integer[] combination : combinations) {
            if (combination[0].equals(targetCombination[0]) && combination[1].equals(targetCombination[1]) || combination[1].equals(targetCombination[0]) && combination[0].equals(targetCombination[1])) {
                return true;
            }
        }
        return false;
    }    
}