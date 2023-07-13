/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;
public class GreaterValue
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number 1: ");
        int num1 = scan.nextInt();
        System.out.println("Enter the number 2: ");
        int num2 = scan.nextInt();
        if(num1>num2){
            System.out.println("Number 1 is greater: "+num1);
        }
        else{
            System.out.println("Number 2 is greater: "+num2);
        }
	}
}
