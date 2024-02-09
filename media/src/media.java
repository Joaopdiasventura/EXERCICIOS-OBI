import java.util.Scanner;

public class media {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);

        int number1 = in.nextInt();
        int number2 = in.nextInt();

        int first = 0;
        int second = 0;
        int third = 0;

        if (number1 < number2) {
            first = number1;
            second = number2;
        } else {
            first = number2;
            second = number1;
        }

        third = (first * 2) - second;
        
        System.out.println(third);

        in.close();
    }
}
