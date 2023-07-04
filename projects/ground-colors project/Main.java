public class Main {
    public static void main(String[] args) {
        String tmpString = new String();

        int n;
        for (int i = 0; i < 16; i++) {
            for (int j = 0; j < 16; j++) {
                n = i*16+j;
                tmpString += String.format("\033[48;5;%dm %-4d", n, n);
            }
            tmpString += "\033[0m\n";
        }
        System.out.print(tmpString);
    }
}
