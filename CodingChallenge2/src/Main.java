import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String toBeReversed;
        System.out.println("Enter string to be reversed: ");
        toBeReversed = scan.nextLine();
        System.out.println(reverse(toBeReversed));

    }

    public static String reverse(String str){
        String reversed = "";
        for(int i=str.length()-1; i>=0; i--){
            reversed+= str.toCharArray()[i];
        }
        return reversed;
    }
}