public class Main {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer();

        int n;
        for (int i = 0; i < 16; i++) {
            for (int j = 0; j < 16; j++) {
                n = i*16+j;
                stringBuffer.append(String.format("\033[48;5;%dm %-4d", n, n));
            }
            stringBuffer.append("\033[0m\n");
        }
        System.out.print(stringBuffer);
    }
}
