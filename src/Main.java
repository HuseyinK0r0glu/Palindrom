import java.util.Scanner;

public class Main {

    static boolean isPalindrom(int input){
        int reverseNumber=0,tmp,remainder;
        tmp=input;

        while(tmp!=0){
            remainder = tmp%10;
            reverseNumber = reverseNumber*10+remainder;
            tmp/=10;
        }
        if(input==reverseNumber){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        System.out.println(isPalindrom(input));

    }
}