import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.nextLine();
        String s2 = scanner.nextLine();

        int count = function(s1, s2);
        System.out.print(count);
    }

    public static int function(String s1, String s2) {
        int count = 0;
        for (int i = 0; i <= s1.length() - s2.length(); i++) {
            boolean c = true;
            for (int j = 0; j < s2.length(); j++) {
                if (s1.charAt(i + j) != s2.charAt(j)) {
                    c = false;
                    break;
                }
            }
            if(c) count++;
        }
        return count;
    }
}
