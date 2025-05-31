import java.util.Comparator;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        String arr1[] = {"cucumber", "aeronomical", "tomato", "bacone", "tea", "telescopic", "fantasmagorical"};
        List<String> l = Arrays.asList(arr1);
        Comparator<String> c = (a, b) -> {
            if (a.length() != b.length()) {
                return a.length() - b.length();
            } else {
                return (a.compareTo(b) > 1) ? 1 : -1;
            }
        };
        Collections.sort(l, c);
        System.out.print(l);

    }
    }
