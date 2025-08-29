import java.util.Scanner;

public class soal2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 1; i <= 4; i++) {
            System.out.print("Masukkan bilangan ke-" + i + ": ");
            int x = in.nextInt();

            if (x < min) min = x;
            if (x > max) max = x;
        }

        System.out.println("Terkecil: " + min);
        System.out.println("Terbesar: " + max);

        in.close();
    }
}
