import java.util.Scanner;
class isOdd{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = scan.nextInt();
        if(num%2!=0){
            System.out.println("Number is Odd - 2");
        }
        else if(num==0){
            System.out.println("Number is even - 1");
        }
        else{
            System.out.println("Number is even - 1");
        }
    }
}