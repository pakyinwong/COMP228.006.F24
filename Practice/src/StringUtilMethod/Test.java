package StringUtilMethod;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        System.out.println(StringUtils.isPalindrome(s) ? "The string is a palindrome." : "The string is not a palindrome.");
        System.out.println("Reversed String: " + StringUtils.reverse(s));
    }
}
