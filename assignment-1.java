import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        System.out.println("Length of first string is " + s1.length());
        System.out.println("Length of second string is " + s2.length());
        if (s1.length() == s2.length()) {
            System.out.println("The length of the two strings are the same");
        } else {
            System.out.println("The length of the two strings is not the same");
        }
        if (s1.equals(s2)) {
            System.out.println("Two strings are equal");
        } else {
            System.out.println("Two strings are not equal");
        }
    }
}
