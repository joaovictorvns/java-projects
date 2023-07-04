public class Main {
    public static void main(String[] args) throws InterruptedException {
        progressBarCLI();
        for (int i = 1; i < 101; i++) {
            Thread.sleep(100);
            progressBarCLI(i);
        }
        System.out.println();
    }

    private static void progressBarCLI(int iFill, char cFill, String sSide) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < iFill; i++) {
            stringBuilder.append(cFill);
        }
        String sFill = stringBuilder.toString();
        char[] sSide_ = sSide.toCharArray();
        System.out.printf("\r%3d%% %c%-100s%c", iFill, sSide_[0], sFill, sSide_[1]);
    }

    private static void progressBarCLI(int iFill, char cFill) {
        progressBarCLI(iFill, cFill, "[]");
    }

    private static void progressBarCLI(int iFill) {
        progressBarCLI(iFill, '#', "[]");
    }

    private static void progressBarCLI() {
        progressBarCLI(0, '#', "[]");
    }
}
