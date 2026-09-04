public class Palindrome {
    public static void main(String[] args) {

        int number = 12321;

        if (isNumberPalindrome(number)) {
            System.out.println(number + " is a palindrome number.");
        } else {
            System.out.println(number + " is not a palindrome number.");
        }
    }

    public static boolean isNumberPalindrome(int num) {
        if (num < 0)
            return false;

        int originalNum = num;
        int reversedNum = 0;

        while (num > 0) {
            int lastDigit = num % 10;
            reversedNum = (reversedNum * 10) + lastDigit;
            num = num / 10;
        }

        return originalNum == reversedNum;
    }
}
