import java.util.Scanner;
public class SumOrOdd
{
	public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number 1: ");
        int num1 = scan.nextInt();
        System.out.println("Enter the number 2: ");
        int num2 = scan.nextInt();
        int addValue = num1+num2;
        if(addValue%2==0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
	}
}
