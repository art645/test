import java.util.*;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList;

public class Test {
    public static void main(String[] args) {
        Map<String, String> freq = new HashMap<>();
        freq.put("1","tishka");
        freq.put("2","tishka");
        freq.put("3","aishka");
        freq.put("4","eishka");
        freq.put("5","irishka");
        List<String> topTen = freq.keySet().stream()
                .sorted(comparing(freq::get).reversed())
                .limit(10)
                .collect(toList ());
        topTen.forEach(System.out::println);
        System.out.println("cats");
    }

    private static String alphabetize(String s) {
        char[] a = s.toCharArray();
        Arrays.sort(a);
        return new String(a);
    }

}
