import java.util.ArrayList;
import java.util.HashMap;

public class NumberToWordConverter {
    public static void main(String[] args) {
        ArrayList<Integer> numbersList = new ArrayList<>();
        numbersList.add(0);
        numbersList.add(1);
        numbersList.add(2);
        // Continue adding elements for numbers up to 100 in the numbersList.
        numbersList.add(275);

        ArrayList<String> wordsList = new ArrayList<>();
        wordsList.add("zero");
        wordsList.add("one");
        wordsList.add("two");
        // Continue adding corresponding words for numbers up to 100 in the wordsList.
        wordsList.add("Two hundred SeventyFive");

        HashMap<Integer, String> map = new HashMap<>();

        for (int i = 0; i < numbersList.size(); i++) {
            map.put(numbersList.get(i), wordsList.get(i));
        }

        int input = 275;
        String word = map.get(input);

        if (word != null) {
            System.out.println(word);
        } else {
            System.out.println("Number out of range");
        }
    }
}
