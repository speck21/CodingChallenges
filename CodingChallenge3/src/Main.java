import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter sentence, longest word will be returned: ");
        String sentence = scan.nextLine();
        System.out.println(longestWord(sentence));

    }

    public static String longestWord(String sentence){
        String[] wordArray = sentence.replaceAll("\\p{Punct}", "").split(" ");
        String longestWord= "";

        for (String word:wordArray) {
            if(word.length()>longestWord.length()){
                longestWord = word;
            }
        }
        return longestWord;
    }
}