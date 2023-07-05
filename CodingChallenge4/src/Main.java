import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number for sequential addition: ");
        int number = scan.nextInt();
        System.out.println(oneToN(number));

    }

    public static int oneToN(int number){
        int result=0;
        for(int i = 1; i<=number; i++){
            result += i;
        }
        return result;
    }
}