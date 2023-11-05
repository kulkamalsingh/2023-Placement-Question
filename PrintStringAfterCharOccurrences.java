public class PrintStringAfterCharOccurrences {

    public static String getStringAfterCharOccurrences(String input, char targetChar, int count) {
        int charCount = 0;
        int index = -1;

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == targetChar) {
                charCount++;
                if (charCount == count) {
                    index = i;
                    break;
                }
            }
        }

        if (index != -1) {
            return input.substring(index + 1);
        } else {
            return "Character not found " + count + " times.";
        }
    }

    public static void main(String[] args) {
        String inputString = "This is a sample string with C characters and some more C characters.";
        char targetChar = 'C';
        int countNeeded = 2;
        String result = getStringAfterCharOccurrences(inputString, targetChar, countNeeded);
        System.out.println(result);  // Output: "haracters and some more C characters."
    }
}
