import java.util.Scanner;

public class calculo {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);

        int result = in.nextInt();
        int start = in.nextInt();
        int end = in.nextInt();

        int qnt = 0;

        for (int i = start; i <= end; i++) {
            int dezena = i / 10;
            int unidade = i % 10;

            if ((unidade + dezena) == result) {
                qnt++;
            }
        }

        System.out.println(qnt);

        in.close();
    }
}