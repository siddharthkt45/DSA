package Strings;

import java.util.Scanner;

public class Split_Sentence_To_Words {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sentence: ");
        String s = sc.nextLine();
        
        convertSentenceToWords(s);
    }
    
    private static void convertSentenceToWords(String s) {
        String[] parts = s.split(" ");              // split function splits the string based on a separator
        for (String str : parts) {                        // called regex
            System.out.println(str);
        }
    }
}