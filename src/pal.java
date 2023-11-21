import java.util.Scanner;

public class pal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String a = sc.next();

        boolean isPalindrome = true;


        for (int i = 0, j = a.length() - 1; i < j; i++, j--) {
            if (a.charAt(i) != a.charAt(j)) {
                isPalindrome = false;
                break; // If characters don't match, it's not a palindrome, no need to check further
            }
        }

        if(isPalindrome) {
            System.out.println("It is a palindrome.");
        } else{
            System.out.println("Not a palindrome");
        }




    }
}
