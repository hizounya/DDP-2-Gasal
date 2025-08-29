import java.util.Scanner;

public class soal3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan sebuah kalimat: ");
        String kalimat = in.nextLine();

        if (kalimat.isEmpty()) {
            System.out.println("Input kosong. Program selesai.");
            return;
        }

        // Cari kata terpanjang
        int n = kalimat.length();
        int i = 0;
        int bestStart = -1, bestEnd = -1, bestLen = 0;

        while (i < n) {
            // lewati spasi
            while (i < n && Character.isWhitespace(kalimat.charAt(i))) i++;
            if (i >= n) break;

            int start = i;
            while (i < n && !Character.isWhitespace(kalimat.charAt(i))) i++;
            int end = i - 1;

            int len = end - start + 1;
            if (len > bestLen) {
                bestLen = len;
                bestStart = start;
                bestEnd = end;
            }
        }

        // Semua spasi
        if (bestStart == -1) {
            bestStart = 0;
            bestEnd = Math.max(0, n - 1);
            bestLen = bestEnd - bestStart + 1;
        }

        // Panjang substring yang wajar
        int minLen = (bestLen >= 2) ? 2 : 1;
        int maxLen = Math.min(6, bestLen);
        int len = minLen + (int)(Math.random() * (maxLen - minLen + 1));

        // Ambil potongan tengah dari kata terpanjang
        int start = bestStart + (bestLen - len) / 2;
        int end = start + len - 1; // inklusif

        System.out.print("Apa substring dari indeks " + start + " hingga " + end + " ? ");
        String jawaban = in.nextLine();

        String kunci = kalimat.substring(start, end + 1); // end eksklusif => +1
        if (jawaban.equals(kunci)) {
            System.out.println("Benar!");
        } else {
            System.out.println("Kurang tepat. Jawaban yang benar: " + kunci);
        }

        in.close();
    }
}
