import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class casamento {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        String A = in.nextLine();
        String B = in.nextLine();

        List<Character> Alist = new ArrayList<>();
        List<Character> Blist = new ArrayList<>();

        if (A.length() > B.length()) {
            int dif = A.length() - B.length();
            for (int i = 0; i < dif; i++) {
                Blist.add('0');
            }
            for (Character i : A.toCharArray()) {
                Alist.add(i);
            }
            for (Character i : B.toCharArray()) {
                Blist.add(i);
            }
        } else if (A.length() < B.length()) {
            int dif = B.length() - A.length();
            for (int i = 0; i < dif; i++) {
                Alist.add('0');
            }
            for (Character i : A.toCharArray()) {
                Alist.add(i);
            }
            for (Character i : B.toCharArray()) {
                Blist.add(i);
            }
        } else {
            for (Character i : A.toCharArray()) {
                Alist.add(i);
            }
            for (Character i : B.toCharArray()) {
                Blist.add(i);
            }
        }
        String resultA = "";
        String resultB = "";

        for (int i = 0; i < Alist.size(); i++) {
            int numberA = Alist.get(i) - '0';
            int numberB = Blist.get(i) - '0';
            if (numberA > numberB) {
                resultA += numberA;
            } else if (numberA < numberB) {
                resultB += numberB;
            } else if (numberA == numberB) {
                resultA += numberA;
                resultB += numberB;
            }
        }
        if (Integer.parseInt(resultA) > Integer.parseInt(resultB)) {
            System.out.println(resultB + " " + resultA);
        } else {
            System.out.println(resultA + " " + resultB);
        }
        in.close();
    }
}