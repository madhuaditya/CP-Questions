import java.util.Scanner;

public class E_No_Palindromes {
    static boolean isPalindrome(String str)
    {

        // Pointers pointing to the beginning
        // and the end of the string
        int i = 0, j = str.length() - 1;

        // While there are characters to compare
        while (i < j) {

            // If there is a mismatch
            if (str.charAt(i) != str.charAt(j))
                return false;

            // Increment first pointer and
            // decrement the other
            i++;
            j--;
        }

        // Given string is a palindrome
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- >0) {
            // code here
//        int n = sc.nextInt();
            String str = sc.next();
            int n = str.length();
            if (n == 1) {
                System.out.println("NO");
                continue;
            }
            if (!isPalindrome(str)) {
                System.out.println("yes");
                System.out.println(1);
                System.out.println(str);
                continue;
            }
            int id = 0;
            char ch = str.charAt(0);
            for (int i = 1; i < n; i++) {

                if (str.charAt(i) != ch) {
                    id = i;
                    break;
                }
            }
            if (id == 0) {
                System.out.println("NO");
                continue;
            }
            String s = str.substring(id + 1);
            String a = str.substring(0,id+1);
            if (!isPalindrome(s)&& ! isPalindrome(a)) {
                System.out.println("YES");
                System.out.println(2);
                System.out.println(str.substring(0, id + 1) + " " + str.substring(id + 1));
                continue;
            }

            if ((id )== 1 || (id) == (n ) / 2) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
                System.out.println(2);
                System.out.println(str.substring(0, id + 2) + " " + str.substring(id + 2, str.length()));
            }
        }


    }
}
