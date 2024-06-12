import java.util.*;
public class UnitArray {
    public static void main(String[] args) {
        String sentence = "a cat is a thing";
        String[] words = sentence.split("\\s+");
        HashSet<String> wordsOld = new HashSet<>();
        HashSet<String> ansWords = new HashSet<>();
        for (String word : words) {
            if (wordsOld.contains(word)) {

                ansWords.add(word);
            } else {
                wordsOld.add(word);
            }
        }
        System.out.println(ansWords);
    }
}
