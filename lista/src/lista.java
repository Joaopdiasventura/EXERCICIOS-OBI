import java.util.Scanner;

public class lista {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int size = in.nextInt();
        in.nextLine();

        int[] list = new int[size];

        for (int i = 0; i < size; i++) {
            list[i] = in.nextInt();
        }

        int operations = 0;
        int start = 0;
        int end = size - 1;

        while (start < end) {
            if (list[start] == list[end]) {
                start++;
                end--;
            }
            else if (list[start] < list[end]) {
                list[start + 1] += list[start];
                start++;
                operations++;
            }
            else {
                list[end - 1] += list[end];
                end--;
                operations++;
            }
        }

        System.out.println(operations);
        
        in.close();
    }
}