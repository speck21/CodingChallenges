import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the character to search for: ");
        String checkFor = scan.nextLine();
        System.out.println("Enter the sentence to search in: ");
        String checkIn = scan.nextLine();
        System.out.println(charCount(checkFor, checkIn));
    }

    public static int charCount(String checkFor, String checkIn){
        char searchedChar = checkFor.charAt(0);
        int count = 0;
        char[] sentenceCharArray = checkIn.toCharArray();
        for(int i = 0; i< sentenceCharArray.length;i++){
            if(sentenceCharArray[i] == searchedChar){
                count++;
            }
        }
        return count;

    }
}