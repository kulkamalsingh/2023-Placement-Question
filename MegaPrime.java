// Count MegaPrime Numbers in a Range

public class MegaPrime {
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n <= 3) return true;
        if (n % 2 == 0 || n % 3 == 0) return false;
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) return false;
        }
        return true;
    }

    public static boolean isMegaPrime(int num) {
        String str = Integer.toString(num);
        for (char c : str.toCharArray()) {
            int digit = Character.getNumericValue(c);
            if (!isPrime(digit)) {
                return false;
            }
        }
        return isPrime(num);
    }

    public static void countMegaPrimes(int start, int end) {
        int count = 0;
        for (int i = start; i <= end; i++) {
            if (isMegaPrime(i)) {
                System.out.println(i);
                count++;
            }
        }
        System.out.println("Total MegaPrime numbers: " + count);
    }

    public static void main(String[] args) {
        int startRange = 10;
        int endRange = 100;
        countMegaPrimes(startRange, endRange);
    }
}

