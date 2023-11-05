// What is a palindrome, give me some examples. Then he told me to write the code. I gave 3 solutions for this.
//  (2 iterative +1 recursive)


public class PalindromeChecker {
    public static boolean isPalindrome(String str) {
        // Remove spaces and convert to lowercase
        str = str.replaceAll("\\s", "").toLowerCase();
        int left = 0;
        int right = str.length() - 1;
        
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        
        return true;
    }
    
    public static void main(String[] args) {
        String input = "Amanaplanacanalpanama";
        boolean result = isPalindrome(input);
        System.out.println("Is it a palindrome? " + result);
    }
}


// import java.util.Stack;

// public class PalindromeChecker {
//     public static boolean isPalindrome(String str) {
//         str = str.replaceAll("\\s", "").toLowerCase();
//         Stack<Character> stack = new Stack<>();
        
//         for (char ch : str.toCharArray()) {
//             stack.push(ch);
//         }
        
//         StringBuilder reversed = new StringBuilder();
//         while (!stack.isEmpty()) {
//             reversed.append(stack.pop());
//         }
        
//         return str.equals(reversed.toString());
//     }
    
//     public static void main(String[] args) {
//         String input = "A man, a plan, a canal, Panama!";
//         boolean result = isPalindrome(input);
//         System.out.println("Is it a palindrome? " + result);
//     }
// }


// public class PalindromeChecker {
//     public static boolean isPalindrome(String str) {
//         str = str.replaceAll("\\s", "").toLowerCase();
        
//         if (str.length() <= 1) {
//             return true;
//         }
        
//         if (str.charAt(0) == str.charAt(str.length() - 1)) {
//             return isPalindrome(str.substring(1, str.length() - 1));
//         }
        
//         return false;
//     }
    
//     public static void main(String[] args) {
//         String input = "madam";
//         boolean result = isPalindrome(input);
//         System.out.println("Is it a palindrome? " + result);
//     }
// }
