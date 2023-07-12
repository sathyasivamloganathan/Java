import java.util.Scanner;
class secondLast{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number:");
        int num = scan.nextInt();
        if(num>=0 && num<10){
            System.out.println(-1);
        }
        int a = num/10;
        System.out.print(Math.abs(a)%10);
    }
}