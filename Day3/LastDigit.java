import java.util.Scanner;
class LastDigit{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number:");
        int num = scan.nextInt();
        System.out.println(Math.abs(num)%10);
    }
}