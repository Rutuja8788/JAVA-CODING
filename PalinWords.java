import java.util.Scanner;

public class PalinWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input: words = ");
        String input = scanner.nextLine();
        input = input.substring(input.indexOf('[') + 1, input.lastIndexOf(']'));
    //startIndex (inclusive) up to but not including the character at the endIndex (exclusive).
        String[] words = input.split(",\\s*");

        String firstPalindrome = null;
        for (String word : words)
        {
            int left = 0;
            int right = word.length() - 1;
            boolean isPalindrome = true;
            while (left < right)
            {
                if (word.charAt(left++) != word.charAt(right--)) {
                    isPalindrome = false;
                    break;
                }
            }
            if (isPalindrome) {
                firstPalindrome = word;
                break;
            }
        }
        if (firstPalindrome != null)
        {
            System.out.println(firstPalindrome);
        }
        else
        {
            System.out.println("\" \" ");
        }

    }
}
