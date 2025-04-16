package 백준.실버.정렬.단어정렬1181;
import java.util.*;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        Set<String> words = new HashSet<>();
        for (int i = 0; i < N; i++) {
            words.add(input.next());
        }

        List<String> list = new ArrayList<>(words);
        list.sort(new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                if (a.length() != b.length()) {
                    return a.length() - b.length();
                } else {
                    return a.compareTo(b);
                }
            }
        });

        for (String word : list) {
            System.out.println(word);
        }
    }
}
