// Day68_Q2.java
// Write a program to use StringTokenizer class to tokenize a sentence.
import java.util.*;
public class string_tokenizer2{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String s = scan.nextLine();
        System.out.println("Enter the delimiter: ");
        String delim = scan.nextLine();
        StringTokenizer st = new StringTokenizer(s, delim,true);
        System.out.println("The tokens are: ");
        while(st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }
    }
}