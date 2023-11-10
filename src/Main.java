import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        HashMap<Character, Integer> letterCount = new HashMap<>();
        Pair<Character, Integer> result = new Pair<>(' ', 0);

        String word = new Input().readInput("Type a word: ");

        for (Character letter: word.toCharArray()) {
            Character letterLowerCase = Character.toLowerCase(letter);
            Integer count = letterCount.getOrDefault(letterLowerCase, 0);
            letterCount.put(letterLowerCase, count + 1);
        }

        for (Map.Entry<Character, Integer> set: letterCount.entrySet()) {
            if (set.getValue() > result.second()) {
                result = new Pair<>(set.getKey(), set.getValue());
            }
        }

        System.out.println("Letter: " + result.first());
        System.out.println("Repeated: " + result.second());
    }
}