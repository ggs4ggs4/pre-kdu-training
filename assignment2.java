import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        HashSet<String> set = new HashSet<>();
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            String input = scanner.nextLine();
            list.add(input);
            set.add(input);
            map.put(input, map.getOrDefault(input, 0) + 1);
        }

        System.out.println("\nList Contains:");
        for (String str : list) {
            System.out.println(str);
        }
        
        System.out.println("\nSet Contains:");
        for (String str : set) {
            System.out.println(str);
        }

        System.out.println("\nFrequency of the words:");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Word = " + entry.getKey() + ", Frequency = " + entry.getValue());
        }
    }
}
