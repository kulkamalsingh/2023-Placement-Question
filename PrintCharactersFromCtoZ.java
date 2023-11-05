public class PrintCharactersFromCtoZ {

    public static void printCharactersFromCtoZ(char startChar) {
        for (char c = startChar; c <= 'Z'; c++) {
            System.out.print(c + " ");
        }
    }

    public static void main(String[] args) {
        char startChar = 'C';
        printCharactersFromCtoZ(startChar);
    }
}
