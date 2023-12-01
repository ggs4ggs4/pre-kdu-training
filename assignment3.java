import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

public class assignment3 {

    public static void main(String[] args) {
        String csvFile = "input.csv"; // Replace with the actual path to your CSV file
        Map<String, Integer> wordCountMap = new LinkedHashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] words = line.split(",");
                for (String word : words) {
                    String cleanedWord = word.trim();
                    wordCountMap.put(cleanedWord, wordCountMap.getOrDefault(cleanedWord, 0) + 1);
                }
            }

            wordCountMap.entrySet().stream()
                    .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                    .limit(3)
                    .forEach(entry -> System.out.println(entry.getKey()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
