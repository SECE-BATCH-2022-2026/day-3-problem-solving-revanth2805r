import java.util.*;

public class program2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        List<String> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String word = sc.nextLine();
            if (!list.contains(word)) {
                list.add(word);
            }
        }

        Collections.sort(list, new Comparator<String>() {
            public int compare(String a, String b) {
                boolean aUpper = Character.isUpperCase(a.charAt(0));
                boolean bUpper = Character.isUpperCase(b.charAt(0));

                if (aUpper && !bUpper) return -1;
                if (!aUpper && bUpper) return 1;

                return a.compareTo(b);
            }
        });

        for (String s : list) {
            System.out.println(s);
        }
    }
}
