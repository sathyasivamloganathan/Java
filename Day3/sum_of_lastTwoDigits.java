import java.util.Scanner;
class sum_of_lastTwoDigits{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number 1: ");
        int num1 = scan.nextInt();
        System.out.print("Enter the number 2: ");
        int num2 = scan.nextInt();
        int a = Math.abs(num1)%10;
        int b = Math.abs(num2)%10;
        System.out.println(a+b);
    }
}