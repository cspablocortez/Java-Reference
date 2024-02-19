import java.util.HashMap;

/**
 * Exaggerate
 */
public class HashMapExercise {

    public static void main(String[] args) {
        String sentence = "The movie I watched was good. The story I like, but what I really dislike in general is the entire cast. So bad it made the movie good.";
        String newSentence = exaggerate(sentence);
        System.out.println(newSentence);
    }

    private static String exaggerate(String sentence) {
        HashMap<String, String> dict = new HashMap<String, String>();
        dict.put("good", "great");
        dict.put("bad", "terrible");
        dict.put("like", "love");
        dict.put("dislike", "hate");

        String[] sentenceArr = sentence.split(" ");
        StringBuilder exaggeratedString = new StringBuilder();
        
        for (String word : sentenceArr) {
            if (dict.containsKey(word)) {
                exaggeratedString.append(dict.get(word));
            } else {
                exaggeratedString.append(word);
            }
            exaggeratedString.append(" ");
        }

        return exaggeratedString.toString();
    }
}