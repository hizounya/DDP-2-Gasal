public final class soal1 {

    public static void printSignature() {
        String owl = "\uD83E\uDD89"; // U+1F989

        String art =
            "╭───────╮\n" +
            "│  o o  │\n" +
            "│   ^   │\n" +
            "│  (_)  │\n" +
            "╰──┬─┬──╯\n" +
            "   ╰─╯\n";

        System.out.print(art);
        System.out.println("---------------------------");
        System.out.println("Hizounya Maycinto Alkian " + owl + " (NPM: 2306245661)");
        System.out.println("notes: Owl emoji = Unicode U+1F989.");
    }

    public static void main(String[] args) {
        printSignature();
    }
}
